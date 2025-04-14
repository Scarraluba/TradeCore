package concrete.goonie.trade.order;

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

    public double getVolumeInitial() {
        return volumeInitial;
    }

    public void setVolumeInitial(double volumeInitial) {
        this.volumeInitial = volumeInitial;
    }

    public double getVolumeCurrent() {
        return volumeCurrent;
    }

    public void setVolumeCurrent(double volumeCurrent) {
        this.volumeCurrent = volumeCurrent;
    }

    public double getPriceOpen() {
        return priceOpen;
    }

    public void setPriceOpen(double priceOpen) {
        this.priceOpen = priceOpen;
    }

    public double getPriceClose() {
        return priceClose;
    }

    public void setPriceClose(double priceClose) {
        this.priceClose = priceClose;
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

    public double getPriceStopLimit() {
        return priceStopLimit;
    }

    public void setPriceStopLimit(double priceStopLimit) {
        this.priceStopLimit = priceStopLimit;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

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

