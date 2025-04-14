package concrete.goonie.trade.position;


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

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getPriceOpen() {
        return priceOpen;
    }

    public void setPriceOpen(double priceOpen) {
        this.priceOpen = priceOpen;
    }

    public double getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(double closePrice) {
        this.closePrice = closePrice;
    }

    public double getStopLoss() {
        return stopLoss;
    }

    public void setStopLoss(double stopLoss) {
        this.stopLoss = stopLoss;
    }

    public double getTakeProfit() {
        return takeProfit;
    }

    public void setTakeProfit(double takeProfit) {
        this.takeProfit = takeProfit;
    }

    public double getPriceCurrent() {
        return priceCurrent;
    }

    public void setPriceCurrent(double priceCurrent) {
        this.priceCurrent = priceCurrent;
    }

    public double getSwap() {
        return swap;
    }

    public void setSwap(double swap) {
        this.swap = swap;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

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
