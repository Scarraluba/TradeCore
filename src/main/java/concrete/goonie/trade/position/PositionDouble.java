package concrete.goonie.trade.position;

/**
 * Represents the double-type properties of a trading position.
 * This class holds various financial details regarding a trade position such as volume,
 * price, stop loss, take profit, swap, commission, and profit.
 */
public class PositionDouble {

    private double volume;
    private double priceOpen;
    private double closePrice;
    private double stopLoss;
    private double takeProfit;
    private double priceCurrent;
    private double swap;
    private double profit;
    private double commission;

    /**
     * Gets the trading volume for the position.
     * @return the trading volume.
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the trading volume for the position.
     * @param volume the trading volume to set.
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Gets the opening price of the position.
     * @return the opening price of the position.
     */
    public double getPriceOpen() {
        return priceOpen;
    }

    /**
     * Sets the opening price of the position.
     * @param priceOpen the opening price to set.
     */
    public void setPriceOpen(double priceOpen) {
        this.priceOpen = priceOpen;
    }

    /**
     * Gets the closing price of the position.
     * @return the closing price of the position.
     */
    public double getClosePrice() {
        return closePrice;
    }

    /**
     * Sets the closing price of the position.
     * @param closePrice the closing price to set.
     */
    public void setClosePrice(double closePrice) {
        this.closePrice = closePrice;
    }

    /**
     * Gets the stop loss value of the position.
     * @return the stop loss value.
     */
    public double getStopLoss() {
        return stopLoss;
    }

    /**
     * Sets the stop loss value of the position.
     * @param stopLoss the stop loss value to set.
     */
    public void setStopLoss(double stopLoss) {
        this.stopLoss = stopLoss;
    }

    /**
     * Gets the take profit value of the position.
     * @return the take profit value.
     */
    public double getTakeProfit() {
        return takeProfit;
    }

    /**
     * Sets the take profit value of the position.
     * @param takeProfit the take profit value to set.
     */
    public void setTakeProfit(double takeProfit) {
        this.takeProfit = takeProfit;
    }

    /**
     * Gets the current price of the position.
     * @return the current price.
     */
    public double getPriceCurrent() {
        return priceCurrent;
    }

    /**
     * Sets the current price of the position.
     * @param priceCurrent the current price to set.
     */
    public void setPriceCurrent(double priceCurrent) {
        this.priceCurrent = priceCurrent;
    }

    /**
     * Gets the swap value for the position.
     * @return the swap value.
     */
    public double getSwap() {
        return swap;
    }

    /**
     * Sets the swap value for the position.
     * @param swap the swap value to set.
     */
    public void setSwap(double swap) {
        this.swap = swap;
    }

    /**
     * Gets the commission for the position.
     * @return the commission value.
     */
    public double getCommission() {
        return commission;
    }

    /**
     * Sets the commission for the position.
     * @param commission the commission value to set.
     */
    public void setCommission(double commission) {
        this.commission = commission;
    }

    /**
     * Gets the profit value for the position.
     * @return the profit value.
     */
    public double getProfit() {
        return profit;
    }

    /**
     * Sets the profit value for the position.
     * @param profit the profit value to set.
     */
    public void setProfit(double profit) {
        this.profit = profit;
    }

    /**
     * Provides a string representation of the PositionDouble object.
     * @return a string describing the position's properties.
     */
    @Override
    public String toString() {
        return "PositionDouble{" +
                "volume=" + volume +
                ", priceOpen=" + priceOpen +
                ", closePrice=" + closePrice +
                ", stopLoss=" + stopLoss +
                ", takeProfit=" + takeProfit +
                ", priceCurrent=" + priceCurrent +
                ", swap=" + swap +
                ", profit=" + profit +
                '}';
    }
}
