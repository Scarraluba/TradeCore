package concrete.goonie.trade.order;

/**
 * The OrderDouble class represents the details of a trade order with double precision values.
 * It stores information such as the initial and current trade volume, opening and closing prices,
 * stop loss, take profit levels, current price, stop limit, and the profit of the trade.
 */
public class OrderDouble {

    private double volumeInitial;
    private double volumeCurrent;
    private double priceOpen;
    private double priceClose;
    private double stopLoss;
    private double takeProfit;
    private double priceCurrent;
    private double priceStopLimit;
    private double profit;

    /**
     * Gets the initial volume of the trade.
     *
     * @return the initial volume of the trade
     */
    public double getVolumeInitial() {
        return volumeInitial;
    }

    /**
     * Sets the initial volume of the trade.
     *
     * @param volumeInitial the initial volume to set
     */
    public void setVolumeInitial(double volumeInitial) {
        this.volumeInitial = volumeInitial;
    }

    /**
     * Gets the current volume of the trade.
     *
     * @return the current volume of the trade
     */
    public double getVolumeCurrent() {
        return volumeCurrent;
    }

    /**
     * Sets the current volume of the trade.
     *
     * @param volumeCurrent the current volume to set
     */
    public void setVolumeCurrent(double volumeCurrent) {
        this.volumeCurrent = volumeCurrent;
    }

    /**
     * Gets the open price of the trade.
     *
     * @return the open price of the trade
     */
    public double getPriceOpen() {
        return priceOpen;
    }

    /**
     * Sets the open price of the trade.
     *
     * @param priceOpen the open price to set
     */
    public void setPriceOpen(double priceOpen) {
        this.priceOpen = priceOpen;
    }

    /**
     * Gets the close price of the trade.
     *
     * @return the close price of the trade
     */
    public double getPriceClose() {
        return priceClose;
    }

    /**
     * Sets the close price of the trade.
     *
     * @param priceClose the close price to set
     */
    public void setPriceClose(double priceClose) {
        this.priceClose = priceClose;
    }

    /**
     * Gets the stop loss level of the trade.
     *
     * @return the stop loss level of the trade
     */
    public double getStopLoss() {
        return stopLoss;
    }

    /**
     * Sets the stop loss level of the trade.
     *
     * @param stopLoss the stop loss level to set
     */
    public void setStopLoss(double stopLoss) {
        this.stopLoss = stopLoss;
    }

    /**
     * Gets the take profit level of the trade.
     *
     * @return the take profit level of the trade
     */
    public double getTakeProfit() {
        return takeProfit;
    }

    /**
     * Sets the take profit level of the trade.
     *
     * @param takeProfit the take profit level to set
     */
    public void setTakeProfit(double takeProfit) {
        this.takeProfit = takeProfit;
    }

    /**
     * Gets the current price of the trade.
     *
     * @return the current price of the trade
     */
    public double getPriceCurrent() {
        return priceCurrent;
    }

    /**
     * Sets the current price of the trade.
     *
     * @param priceCurrent the current price to set
     */
    public void setPriceCurrent(double priceCurrent) {
        this.priceCurrent = priceCurrent;
    }

    /**
     * Gets the stop limit price of the trade.
     *
     * @return the stop limit price of the trade
     */
    public double getPriceStopLimit() {
        return priceStopLimit;
    }

    /**
     * Sets the stop limit price of the trade.
     *
     * @param priceStopLimit the stop limit price to set
     */
    public void setPriceStopLimit(double priceStopLimit) {
        this.priceStopLimit = priceStopLimit;
    }

    /**
     * Gets the profit of the trade.
     *
     * @return the profit of the trade
     */
    public double getProfit() {
        return profit;
    }

    /**
     * Sets the profit of the trade.
     *
     * @param profit the profit to set
     */
    public void setProfit(double profit) {
        this.profit = profit;
    }

    /**
     * Returns a string representation of the order with key details.
     *
     * @return a string representation of the order
     */
    @Override
    public String toString() {
        return "Volume Initial: " + volumeInitial + "\n" +
                "Volume Current: " + volumeCurrent + "\n" +
                "Price Open: " + priceOpen + "\n" +
                "Stop Loss: " + stopLoss + "\n" +
                "Take Profit: " + takeProfit + "\n" +
                "Price Current: " + priceCurrent + "\n" +
                "Price Stop Limit: " + priceStopLimit;
    }
}
