package concrete.goonie.trade.order;


import concrete.goonie.symbol.Symbol;

import java.time.LocalDateTime;

/**
 * Represents a trading order in the trading system.
 */
public class Order {
    private final OrderInteger orderInteger = new OrderInteger();
    private final OrderString orderString = new OrderString();
    private final OrderDouble orderDouble = new OrderDouble();

    private Symbol symbol;
    private LocalDateTime openTime;
    private LocalDateTime closeTime;

    // ===== OrderDouble Delegates =====
    public double getVolumeInitial() {
        return orderDouble.getVolumeInitial();
    }

    public void setVolumeInitial(double volumeInitial) {
        orderDouble.setVolumeInitial(volumeInitial);
    }

    public double getVolumeCurrent() {
        return orderDouble.getVolumeCurrent();
    }

    public void setVolumeCurrent(double volumeCurrent) {
        orderDouble.setVolumeCurrent(volumeCurrent);
    }

    public double getPriceOpen() {
        return orderDouble.getPriceOpen();
    }

    public void setPriceOpen(double priceOpen) {
        orderDouble.setPriceOpen(priceOpen);
    }
    public double getPriceClose() {
        return orderDouble.getPriceClose();
    }

    public void setPriceClose(double priceOpen) {
        orderDouble.setPriceClose(priceOpen);
    }

    public double getStopLoss() {
        return orderDouble.getStopLoss();
    }

    public void setStopLoss(double stopLoss) {
        orderDouble.setStopLoss(stopLoss);
    }

    public double getTakeProfit() {
        return orderDouble.getTakeProfit();
    }

    public void setTakeProfit(double takeProfit) {
        orderDouble.setTakeProfit(takeProfit);
    }

    public double getPriceCurrent() {
        return orderDouble.getPriceCurrent();
    }

    public void setPriceCurrent(double priceCurrent) {
        orderDouble.setPriceCurrent(priceCurrent);
    }

    public double getPriceStopLimit() {
        return orderDouble.getPriceStopLimit();
    }

    public void setPriceStopLimit(double priceStopLimit) {
        orderDouble.setPriceStopLimit(priceStopLimit);
    }

    public double getProfit() {
        return orderDouble.getProfit();
    }

    public void setProfit(double profit) {
        orderDouble.setProfit(profit);
    }

    // ===== OrderInteger Delegates =====
    public long getOrderTicket() {
        return orderInteger.getOrderTicket();
    }

    public void setOrderTicket(long orderTicket) {
        orderInteger.setOrderTicket(orderTicket);
    }

    public int getOrderType() {
        return orderInteger.getOrderType();
    }

    public void setOrderType(int orderType) {
        orderInteger.setOrderType(orderType);
    }

    public int getOrderState() {
        return orderInteger.getOrderState();
    }

    public void setOrderState(int orderState) {
        orderInteger.setOrderState(orderState);
    }

    public int getOrderTypeFilling() {
        return orderInteger.getOrderTypeFilling();
    }

    public void setOrderTypeFilling(int orderTypeFilling) {
        orderInteger.setOrderTypeFilling(orderTypeFilling);
    }

    public int getOrderMagic() {
        return orderInteger.getOrderMagic();
    }

    public void setOrderMagic(int orderMagic) {
        orderInteger.setOrderMagic(orderMagic);
    }

    public int getOrderReason() {
        return orderInteger.getOrderReason();
    }

    public void setOrderReason(int orderReason) {
        orderInteger.setOrderReason(orderReason);
    }

    public int getOrderPositionId() {
        return orderInteger.getOrderPositionId();
    }

    public void setOrderPositionId(int orderPositionId) {
        orderInteger.setOrderPositionId(orderPositionId);
    }

    public int getOrderPositionById() {
        return orderInteger.getOrderPositionById();
    }

    public void setOrderPositionById(int orderPositionById) {
        orderInteger.setOrderPositionById(orderPositionById);
    }

    // ===== OrderString Delegates =====

    public String getOrderComment() {
        return orderString.getOrderComment();
    }

    public void setOrderComment(String orderComment) {
        orderString.setOrderComment(orderComment);
    }

    public String getOrderExternalId() {
        return orderString.getOrderExternalId();
    }

    public void setOrderExternalId(String orderExternalId) {
        orderString.setOrderExternalId(orderExternalId);
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public LocalDateTime getOpenTime() {
        return openTime;
    }

    public void setOpenTime(LocalDateTime openTime) {
        this.openTime = openTime;
    }

    public LocalDateTime getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(LocalDateTime closeTime) {
        this.closeTime = closeTime;
    }

    @Override
    public String toString() {
        return "Order{\n" +
                orderInteger.toString() + "\n\n" +
                orderString.toString() + "\n\n" +
                orderDouble.toString() +
                "\n}";
    }
}
