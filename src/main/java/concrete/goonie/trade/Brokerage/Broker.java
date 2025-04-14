package concrete.goonie.trade.Brokerage;

import concrete.goonie.Positions;
import concrete.goonie.account.Account;
import concrete.goonie.enums.ENUM_ORDER_TYPE;
import concrete.goonie.symbol.Symbol;
import concrete.goonie.trade.position.Position;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import static concrete.goonie.enums.ENUM_ORDER_TYPE.*;

/**
 * Broker class represents a brokerage system that manages orders, trades, and positions for a specific broker.
 * It supports various features such as managing pending orders, calculating swaps, and handling trade conditions.
 */
public class Broker {

    /**
     * The name of the broker.
     */
    private String brokerName;

    /**
     * A map to hold pending orders, keyed by their unique order ID.
     */
    private Map<Integer, PendingOrder> pendingOrders;

    /**
     * The leverage provided by the broker.
     */
    private double leverage;

    /**
     * The commission structure applied by the broker.
     */
    private Commission commissionStructure;

    /**
     * The multiplier used to calculate the spread for a trade.
     */
    private double spreadMultiplier;

    /**
     * The risk management settings of the broker.
     */
    private RiskManagement riskManagement;

    /**
     * The server time used to simulate the passage of time and perform time-based operations.
     */
    private LocalDateTime serverTime;

    /**
     * The swap rate for long positions.
     */
    private double swapLong;

    /**
     * The swap rate for short positions.
     */
    private double swapShort;

    /**
     * Constructs a Broker object with the specified parameters.
     *
     * @param brokerName          The name of the broker.
     * @param initialBalance      The initial balance of the broker.
     * @param leverage            The leverage provided by the broker.
     * @param commissionStructure The commission structure applied by the broker.
     * @param spreadMultiplier    The multiplier used to calculate the spread.
     * @param riskManagement      The risk management settings for the broker.
     */
    public Broker(String brokerName, double initialBalance,
                  double leverage, Commission commissionStructure,
                  double spreadMultiplier, RiskManagement riskManagement) {
        this.brokerName = brokerName;
        this.pendingOrders = new HashMap<>();
        this.leverage = leverage;
        this.commissionStructure = commissionStructure;
        this.spreadMultiplier = spreadMultiplier;
        this.riskManagement = riskManagement;
        this.serverTime = LocalDateTime.now();
        this.swapLong = 0;
        this.swapShort = 0;
    }

    /**
     * Updates market data for a specific symbol (such as bid and ask prices).
     * This method also triggers actions like updating open trades, checking pending orders, and calculating swaps.
     *
     * @param symbol The symbol to update.
     * @param bid    The current bid price for the symbol.
     * @param ask    The current ask price for the symbol.
     */
    public void updateMarketData(Symbol symbol, double bid, double ask) {
        symbol.updatePrices(bid, ask);

        // Update open trades for this symbol
        updateOpenTrades(symbol, bid, ask);

        // Check pending orders
        checkPendingOrders(symbol, bid, ask);

        // Calculate swaps at the end of the day (typically 22:00 server time)
        if (serverTime.getHour() == 22 && serverTime.getMinute() == 0) {
            calculateSwaps();
        }

        serverTime = serverTime.plusMinutes(1); // Simulate time passing
    }

    /**
     * Checks pending orders to see if they should be triggered based on market conditions.
     * If an order is triggered, it executes the trade and removes the pending order.
     *
     * @param symbol The symbol associated with the pending orders.
     * @param bid    The current bid price.
     * @param ask    The current ask price.
     */
    private void checkPendingOrders(Symbol symbol, double bid, double ask) {
        Iterator<Map.Entry<Integer, PendingOrder>> iterator = pendingOrders.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, PendingOrder> entry = iterator.next();
            PendingOrder order = entry.getValue();

            Symbol orderSymbol = order.getSymbol();
            if (orderSymbol.equals(symbol)) {
                boolean triggered = false;
                double price = order.getPrice();
                ENUM_ORDER_TYPE type = order.getType();

                switch (type) {
                    case LIMIT_BUY, STOP_SELL:
                        triggered = (bid <= price);
                        break;
                    case LIMIT_SELL, STOP_BUY:
                        triggered = (ask >= price);
                        break;
                    default:
                        break;
                }

                // Check expiration
                boolean expired = order.getExpiration() != null && serverTime.isAfter(order.getExpiration());

                if (triggered && !expired) {
                    // Execute pending order
                    ENUM_ORDER_TYPE marketType = (type == LIMIT_BUY || type == STOP_BUY)
                            ? MARKET_BUY : MARKET_SELL;

                    double openPrice = (marketType == MARKET_BUY) ? ask : bid;

                    // Calculate commission
                    double volume = order.getVolume();
                    double tradeValue = orderSymbol.getTradeContractSize() * volume * openPrice;
                    double commission = commissionStructure.calculateCommission(volume, tradeValue);

                    // Create and open the trade
                    long ticket = ThreadLocalRandom.current().nextLong(319, 9869);
                    Position trade = new Position(ticket, orderSymbol, volume, marketType,
                            openPrice, order.getStopLoss(), order.getTakeProfit(),
                            commission, order.getComment());

                    final Account account = Account.getInstance();
                    account.getPositions().addPosition(trade);

                    // Deduct commission from balance
                    double balance = account.getBalance();
                    account.setBalance(balance - commission);

                    // Remove pending order
                    iterator.remove();
                } else if (expired) {
                    iterator.remove();
                }
            }
        }
    }

    /**
     * Updates the status of open trades by adjusting the current price and calculating profits.
     *
     * @param symbol The symbol for which open trades need to be updated.
     * @param bid    The current bid price.
     * @param ask    The current ask price.
     */
    private void updateOpenTrades(Symbol symbol, double bid, double ask) {
        for (Position trade : Account.getInstance().getPositions().getOpenPositions()) {
            if (trade.getSymbol().equals(symbol)) {
                boolean isBuyType = trade.getType() == MARKET_BUY.ordinal() ||
                        trade.getType() == LIMIT_BUY.ordinal() || trade.getType() == STOP_BUY.ordinal();

                if (isBuyType) {
                    trade.setPriceCurrent(bid);
                } else {
                    trade.setPriceCurrent(ask);
                }

                // Update profit
                trade.setProfit(trade.calculateProfit(bid, ask));

                // Check trade conditions (Stop Loss / Take Profit)
                checkTradeConditions(trade);
            }
        }
        calculateEquityAndMargin();
    }

    /**
     * Checks the conditions (Stop Loss and Take Profit) of an open trade to determine whether it should be closed.
     *
     * @param trade The trade to check.
     */
    private void checkTradeConditions(Position trade) {
        Symbol symbolInfo = trade.getSymbol();
        double bid = symbolInfo.getBid();
        double ask = symbolInfo.getAsk();

        boolean closeTrade = false;
        double closePrice = 0;

        boolean buyTypes = trade.getType() == MARKET_BUY.ordinal() ||
                trade.getType() == LIMIT_BUY.ordinal() || trade.getType() == STOP_BUY.ordinal();

        boolean sellTypes = trade.getType() == MARKET_SELL.ordinal() ||
                trade.getType() == LIMIT_SELL.ordinal() || trade.getType() == STOP_SELL.ordinal();

        if (buyTypes && bid <= trade.getStopLoss()) {
            closeTrade = true;
            closePrice = trade.getStopLoss();
        } else if (sellTypes && ask >= trade.getStopLoss()) {
            closeTrade = true;
            closePrice = trade.getStopLoss();
        } else if (buyTypes && bid >= trade.getTakeProfit()) {
            closeTrade = true;
            closePrice = trade.getTakeProfit();
        } else if (sellTypes && ask <= trade.getTakeProfit()) {
            closeTrade = true;
            closePrice = trade.getTakeProfit();
        }

        if (closeTrade) {
            closeTrade(trade.getTicket(), closePrice);
        }
    }

    /**
     * Closes a trade by its ticket and calculates the final profit or loss.
     *
     * @param ticket     The ticket ID of the trade to close.
     * @param closePrice The price at which the trade is closed.
     */
    public void closeTrade(long ticket, double closePrice) {
        Account account = Account.getInstance();
        Positions positions = account.getPositions();
        positions.getPositionByTicket(ticket);
        Position trade = positions.getCurrentPosition();

        if (trade == null) {
            throw new IllegalArgumentException("Trade not found: " + ticket);
        }

        // Calculate final profit
        trade.setProfit(trade.calculateProfit(closePrice, closePrice));

        // Update balance
        double balance = account.getBalance() + trade.getProfit();
        account.setBalance(balance);

        // Set close time
        trade.setCloseTime(serverTime);

        // Add to trade history
        positions.addPosition(trade);

        // Recalculate margin and equity
        calculateEquityAndMargin();
    }

    /**
     * Calculates swap rates for all open positions at the end of each day.
     */
    private void calculateSwaps() {
        final Account account = Account.getInstance();
        for (Position trade : account.getPositions().getOpenPositions()) {
            Symbol symbolInfo = trade.getSymbol();
            boolean isBuyType = trade.getType() == MARKET_BUY.ordinal() ||
                    trade.getType() == LIMIT_BUY.ordinal() || trade.getType() == STOP_BUY.ordinal();

            double swapRate = isBuyType ? symbolInfo.getSwapLong() : symbolInfo.getSwapShort();

            // Swap is typically calculated per lot per night
            double swap = swapRate * trade.getVolume();
            trade.setSwap(trade.getSwap() + swap);

            account.setBalance(account.getBalance() + swap);
        }
        calculateEquityAndMargin();
    }

    /**
     * Recalculates the equity, margin, and free margin of the account based on open positions.
     */
    private void calculateEquityAndMargin() {
        Account account = Account.getInstance();
        Positions positions = account.getPositions();

        // Calculate total profit and margin from all open trades
        HashMap<Integer, Position> openTrades = positions.getPositionsHash();
        double totalProfit = openTrades.values().stream()
                .mapToDouble(Position::getProfit)
                .sum();

        double totalSwap = openTrades.values().stream()
                .mapToDouble(Position::getSwap)
                .sum();

        double totalMargin = openTrades.values().stream()
                .mapToDouble(t -> calculateRequiredMargin(t.getSymbol(), t.getVolume(), ENUM_ORDER_TYPE.values()[t.getType()]))

                .sum();

        double balance = account.getBalance();
        account.setEquity(balance + totalProfit + totalSwap);
        account.setMargin(totalMargin);

        final double margin = account.getMargin();
        final double equity = account.getEquity();
        account.setMarginFree(equity - margin);
        account.setMarginLevel((margin > 0) ? (equity / margin) * 100 : 0);
    }

    /**
     * Calculates the required margin for a trade.
     * This calculation takes into account factors like contract size, leverage, and account type.
     *
     * @param symbol The symbol for the trade.
     * @param volume The volume of the trade.
     * @param type   The type of the order (e.g., BUY/SELL).
     * @return The required margin for the trade.
     */
    private double calculateRequiredMargin(Symbol symbol, double volume, ENUM_ORDER_TYPE type) {

        // Base margin calculation
        double margin = (symbol.getTradeContractSize() * volume * symbol.getAsk()) / leverage;

        // Adjust for account type
//        if (accountType == AccountType.ECN) {
        margin *= 1.1; // ECN accounts often have slightly higher margin requirements
//        } else if (accountType == AccountType.MARKET_MAKER) {
//            margin *= 0.9; // Market makers might offer lower margins
//        }

        // Check for hedged positions
        boolean hasOppositePosition = Account.getInstance().getPositions().getPositionsHash().values().stream()
                .anyMatch(position -> position.getSymbol().equals(symbol) && position.getType() != type.ordinal());

        return hasOppositePosition ? margin * 0.5 : margin;
    }

    // Getters and setters for brokerName, leverage, etc.

}
