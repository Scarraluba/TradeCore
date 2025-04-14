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

public class MT5Broker {
    private String brokerName;
    private Map<Integer, PendingOrder> pendingOrders;
    private double leverage;
    private Commission commissionStructure;
    private double spreadMultiplier;
    private RiskManagement riskManagement;
    private LocalDateTime serverTime;
    private double swapLong;
    private double swapShort;

    public MT5Broker(String brokerName, double initialBalance,
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

    public void updateMarketData(Symbol symbol, double bid, double ask) {

        symbol.updatePrices(bid, ask);

        // Update open trades for this symbol
        updateOpenTrades(symbol, bid, ask);

        // Check pending orders
        checkPendingOrders(symbol, bid, ask);

        // Calculate swaps at end of day
        if (serverTime.getHour() == 22 && serverTime.getMinute() == 0) { // Typically swaps are applied at 22:00 server time
            calculateSwaps();
        }

        serverTime = serverTime.plusMinutes(1); // Simulate time passing
    }

    private void checkPendingOrders(Symbol symbol, double bid, double ask) {
        Iterator<Map.Entry<Integer, PendingOrder>> iterator = pendingOrders.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, PendingOrder> entry = iterator.next();
            PendingOrder order = entry.getValue();

            if (order.symbol.equals(symbol)) {
                boolean triggered = false;

                switch (order.type) {
                    case LIMIT_BUY:
                        triggered = (bid <= order.price);
                        break;
                    case LIMIT_SELL:
                        triggered = (ask >= order.price);
                        break;
                    case STOP_BUY:
                        triggered = (ask >= order.price);
                        break;
                    case STOP_SELL:
                        triggered = (bid <= order.price);
                        break;
                    default:
                        break;
                }

                // Check expiration
                boolean expired = order.expiration != null && serverTime.isAfter(order.expiration);

                if (triggered && !expired) {
                    // Execute pending order
                    ENUM_ORDER_TYPE marketType = (order.type == LIMIT_BUY || order.type == STOP_BUY)
                            ? MARKET_BUY : MARKET_SELL;

                    double openPrice = (marketType == MARKET_BUY) ? ask : bid;

                    // Calculate commission
                    Symbol symbolInfo = order.symbol;
                    double tradeValue = symbolInfo.getTradeContractSize() * order.volume * openPrice;
                    double commission = commissionStructure.calculateCommission(order.volume, tradeValue);

                    // Create and open the trade
                    long ticket = ThreadLocalRandom.current().nextLong(319, 9869);
                    ;
                    Position trade = new Position(ticket, order.symbol, order.volume, marketType,
                            openPrice, order.stopLoss, order.takeProfit,
                            commission, order.comment);


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

    private void updateOpenTrades(Symbol symbol, double bid, double ask) {

        for (Position trade : Account.getInstance().getPositions().getOpenPositions()) {
            if (trade.getSymbol().equals(symbol)) {
                boolean whatTypeIsIt = trade.getType() == MARKET_BUY.ordinal() ||
                        trade.getType() == LIMIT_BUY.ordinal() || trade.getType() == STOP_BUY.ordinal();

                if (whatTypeIsIt) {
                    trade.setPriceCurrent(bid);
                } else {
                    trade.setPriceCurrent(ask);
                }
                // Update profit
                trade.setProfit(trade.calculateProfit(bid, ask));

                // Check trade conditions (SL/TP)
                checkTradeConditions(trade);
            }
        }
        calculateEquityAndMargin();
    }

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

    private void calculateSwaps() {
        final Account account = Account.getInstance();
        for (Position trade : account.getPositions().getOpenPositions()) {
            Symbol symbolInfo = trade.getSymbol();
            boolean whatTypeIsIt = trade.getType() == MARKET_BUY.ordinal() ||
                    trade.getType() == LIMIT_BUY.ordinal() || trade.getType() == STOP_BUY.ordinal();

            double swapRate = whatTypeIsIt ? symbolInfo.getSwapLong() : symbolInfo.getSwapShort();

            // Swap is typically calculated per lot per night
            double swap = swapRate * trade.getVolume();
            trade.setSwap(trade.getSwap() + swap);

            account.setBalance(account.getBalance() + swap);
        }
        calculateEquityAndMargin();
    }

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

    // Calculate required margin for a trade (more sophisticated calculation)
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
                .anyMatch(t -> {
                    final ENUM_ORDER_TYPE orderType = values()[t.getType()];
                    return t.getSymbol().equals(symbol) &&
                            ((type == MARKET_BUY && orderType == MARKET_SELL || orderType == LIMIT_SELL || orderType == STOP_SELL)) ||
                            (type == MARKET_SELL && (orderType == MARKET_BUY || orderType == LIMIT_BUY || orderType == STOP_BUY));
                });
        ;

        if (hasOppositePosition) {
            margin *= symbol.getMarginHedged(); // Apply hedged margin factor
        }

        return margin;
    }
}
