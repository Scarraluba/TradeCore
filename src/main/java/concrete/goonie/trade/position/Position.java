package concrete.goonie.trade.position;


import concrete.goonie.enums.ENUM_ORDER_TYPE;
import concrete.goonie.symbol.Symbol;

import java.time.LocalDateTime;

import static concrete.goonie.enums.ENUM_ORDER_TYPE.*;

/**
 * Represents a trading position in the trading system.
 * This class aggregates position-related data through delegation
 * to {@link PositionDouble}, {@link PositionInteger}, and {@link PositionString},
 * and includes additional information such as symbol and time metadata.
 */
public class Position {
    private final PositionDouble positionDouble = new PositionDouble();
    private final PositionInteger positionInteger = new PositionInteger();
    private final PositionString positionString = new PositionString();
    private Symbol symbol;
    private LocalDateTime openTime;
    private LocalDateTime closeTime;

    public Position(int ticket, Symbol symbol, double volume, double openPrice, double closePrice,
                    double sl, double tp, double profit, int type) {
        setTicket(ticket);
        setSymbol(symbol);
        setVolume(volume);


    }

    public Position(long ticket, Symbol symbol, double volume, ENUM_ORDER_TYPE marketType,
                    double openPrice, double stopLoss, double takeProfit, double commission, String comment) {
        setTicket(ticket);
        setSymbol(symbol);
        setVolume(volume);
        setType(marketType.ordinal());
        setPriceOpen(openPrice);
        setStopLoss(stopLoss);
        setTakeProfit(takeProfit);
        setComment(comment);
        setCommission(commission);

    }
    // ===== PositionDouble Delegates =====

    /**
     * Gets the trade volume.
     *
     * @return the volume of the position.
     */
    public double getVolume() {
        return positionDouble.getVolume();
    }

    /**
     * Sets the trade volume.
     *
     * @param volume the volume of the position.
     */
    public void setVolume(double volume) {
        positionDouble.setVolume(volume);
    }

    /**
     * Gets the open price of the position.
     *
     * @return the price at which the position was opened.
     */
    public double getPriceOpen() {
        return positionDouble.getPriceOpen();
    }

    /**
     * Sets the open price of the position.
     *
     * @param priceOpen the price at which the position was opened.
     */
    public void setPriceOpen(double priceOpen) {
        positionDouble.setPriceOpen(priceOpen);
    }

    /**
     * Gets the close price of the position.
     *
     * @return the price at which the position was closed.
     */
    public double getClosePrice() {
        return positionDouble.getClosePrice();
    }

    /**
     * Sets the close price of the position.
     *
     * @param closePrice the price at which the position was closed.
     */
    public void setClosePrice(double closePrice) {
        positionDouble.setClosePrice(closePrice);
    }

    /**
     * Gets the stop loss level.
     *
     * @return the stop loss price.
     */
    public double getStopLoss() {
        return positionDouble.getStopLoss();
    }

    /**
     * Sets the stop loss level.
     *
     * @param stopLoss the stop loss price.
     */
    public void setStopLoss(double stopLoss) {
        positionDouble.setStopLoss(stopLoss);
    }

    /**
     * Gets the take profit level.
     *
     * @return the take profit price.
     */
    public double getTakeProfit() {
        return positionDouble.getTakeProfit();
    }

    /**
     * Sets the take profit level.
     *
     * @param takeProfit the take profit price.
     */
    public void setTakeProfit(double takeProfit) {
        positionDouble.setTakeProfit(takeProfit);
    }

    /**
     * Gets the current market price.
     *
     * @return the current price of the instrument.
     */
    public double getPriceCurrent() {
        return positionDouble.getPriceCurrent();
    }

    /**
     * Sets the current market price.
     *
     * @param priceCurrent the current price of the instrument.
     */
    public void setPriceCurrent(double priceCurrent) {
        positionDouble.setPriceCurrent(priceCurrent);
    }

    /**
     * Gets the swap value for the position.
     *
     * @return the swap (overnight interest).
     */
    public double getSwap() {
        return positionDouble.getSwap();
    }

    /**
     * Sets the swap value for the position.
     *
     * @param swap the swap (overnight interest).
     */
    public void setSwap(double swap) {
        positionDouble.setSwap(swap);
    }
    public double getCommission() {
        return positionDouble.getCommission();
    }
    public void setCommission(double commission) {
        positionDouble.setCommission(commission);
    }

    /**
     * Gets the current profit or loss of the position.
     *
     * @return the net profit or loss.
     */
    public double getProfit() {
        return positionDouble.getProfit();
    }

    /**
     * Sets the current profit or loss of the position.
     *
     * @param profit the net profit or loss.
     */
    public void setProfit(double profit) {
        positionDouble.setProfit(profit);
    }

    // ===== PositionInteger Delegates =====

    /**
     * Gets the unique ticket ID of the position.
     *
     * @return the ticket ID.
     */
    public long getTicket() {
        return positionInteger.getTicket();
    }

    /**
     * Sets the unique ticket ID of the position.
     *
     * @param ticket the ticket ID.
     */
    public void setTicket(long ticket) {
        positionInteger.setTicket(ticket);
    }

    /**
     * Gets the last update time in milliseconds.
     *
     * @return the update time in milliseconds.
     */
    public long getUpdateTimeMillis() {
        return positionInteger.getUpdateTimeMillis();
    }

    /**
     * Sets the last update time in milliseconds.
     *
     * @param updateTimeMillis the update time in milliseconds.
     */
    public void setUpdateTimeMillis(long updateTimeMillis) {
        positionInteger.setUpdateTimeMillis(updateTimeMillis);
    }

    /**
     * Gets the order type.
     *
     * @return the type (e.g., buy/sell).
     */
    public int getType() {
        return positionInteger.getType();
    }

    /**
     * Sets the order type.
     *
     * @param type the type (e.g., buy/sell).
     */
    public void setType(int type) {
        positionInteger.setType(type);
    }

    /**
     * Gets the magic number used to identify expert advisor trades.
     *
     * @return the magic number.
     */
    public int getMagicNumber() {
        return positionInteger.getMagicNumber();
    }

    /**
     * Sets the magic number used to identify expert advisor trades.
     *
     * @param magicNumber the magic number.
     */
    public void setMagicNumber(int magicNumber) {
        positionInteger.setMagicNumber(magicNumber);
    }

    /**
     * Gets the internal identifier of the position.
     *
     * @return the internal identifier.
     */
    public long getIdentifier() {
        return positionInteger.getIdentifier();
    }

    /**
     * Sets the internal identifier of the position.
     *
     * @param identifier the internal identifier.
     */
    public void setIdentifier(long identifier) {
        positionInteger.setIdentifier(identifier);
    }

    /**
     * Gets the reason code for position closure.
     *
     * @return the reason code.
     */
    public int getReason() {
        return positionInteger.getReason();
    }

    /**
     * Sets the reason code for position closure.
     *
     * @param reason the reason code.
     */
    public void setReason(int reason) {
        positionInteger.setReason(reason);
    }

    // ===== PositionString Delegates =====

    /**
     * Gets the comment associated with the position.
     *
     * @return the comment.
     */
    public String getComment() {
        return positionString.getComment();
    }

    /**
     * Sets the comment associated with the position.
     *
     * @param comment the comment.
     */
    public void setComment(String comment) {
        positionString.setComment(comment);
    }

    /**
     * Gets the external identifier for this position.
     *
     * @return the external ID.
     */
    public String getExternalId() {
        return positionString.getExternalId();
    }

    /**
     * Sets the external identifier for this position.
     *
     * @param externalId the external ID.
     */
    public void setExternalId(String externalId) {
        positionString.setExternalId(externalId);
    }

    // ===== Symbol Methods =====

    /**
     * Gets the symbol associated with this position.
     *
     * @return the {@link Symbol}.
     */
    public Symbol getSymbol() {
        return symbol;
    }

    /**
     * Sets the symbol associated with this position.
     *
     * @param symbol the {@link Symbol}.
     */
    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    // ===== Time Methods =====

    /**
     * Gets the open time of the position.
     *
     * @return the open time as {@link LocalDateTime}.
     */
    public LocalDateTime getOpenTime() {
        return openTime;
    }

    /**
     * Sets the open time of the position.
     *
     * @param openTime the open time as {@link LocalDateTime}.
     */
    public void setOpenTime(LocalDateTime openTime) {
        this.openTime = openTime;
    }

    /**
     * Gets the close time of the position.
     *
     * @return the close time as {@link LocalDateTime}.
     */
    public LocalDateTime getCloseTime() {
        return closeTime;
    }

    /**
     * Sets the close time of the position.
     *
     * @param closeTime the close time as {@link LocalDateTime}.
     */
    public void setCloseTime(LocalDateTime closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * Calculates the profit or loss of the trade based on the current market prices.
     * <p>
     * The method determines whether the trade is a buy or sell order and uses the appropriate
     * market price (bid for buy orders, ask for sell orders) to compute the unrealized profit or loss.
     * </p>
     *
     * @param currentBid The current bid price of the symbol.
     * @param currentAsk The current ask price of the symbol.
     * @return The calculated profit or loss in account currency units.
     *
     * <p><b>Calculation Logic:</b></p>
     * <ul>
     *     <li>Buy trades use the <code>currentBid</code> as the closing price.</li>
     *     <li>Sell trades use the <code>currentAsk</code> as the closing price.</li>
     *     <li>Profit is calculated using the formula:
     *     <code>(closePrice - priceOpen) * volume * contractSize</code> for buys, and
     *     <code>(priceOpen - closePrice) * volume * contractSize</code> for sells.</li>
     * </ul>
     * @see #getType()
     * @see #getPriceOpen()
     * @see #getVolume()
     * @see Symbol#getPoint()
     * @see Symbol#getTradeContractSize()
     */

    public double calculateProfit(double currentBid, double currentAsk) {
        boolean whatTypeIsIt = getType() == MARKET_BUY.ordinal() || getType() == LIMIT_BUY.ordinal() || getType() == STOP_BUY.ordinal();
        double closePrice = whatTypeIsIt
                ? currentBid : currentAsk;


        double symbolPoint = symbol.getPoint();
        double pointValue = symbolPoint * symbol.getTradeContractSize() * getVolume();

        if (whatTypeIsIt) {
            return (closePrice - getPriceOpen()) * pointValue / symbolPoint;
        } else {
            return (getPriceOpen() - closePrice) * pointValue / symbolPoint;
        }
    }

    /**
     * Clones this position object.
     *
     * @return a shallow copy of this object.
     * @throws CloneNotSupportedException if cloning is not supported.
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * Returns a string representation of the position.
     *
     * @return a detailed string of all position fields.
     */
    @Override
    public String toString() {
        return "Position{" +
                "positionDouble=" + positionDouble +
                ", positionInteger=" + positionInteger +
                ", positionString=" + positionString +
                ", symbol=" + symbol +
                ", openTime=" + openTime +
                ", closeTime=" + closeTime +
                '}';
    }
}
