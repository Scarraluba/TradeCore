package concrete.goonie.trade.order;

import concrete.goonie.symbol.Symbol;

import java.time.LocalDateTime;

/**
 * Represents a trading order in the trading system.
 * This class encapsulates the order details using several delegated classes for handling
 * integer, double, and string related order data.
 */
public class Order {
    private final OrderInteger orderInteger = new OrderInteger();
    private final OrderString orderString = new OrderString();
    private final OrderDouble orderDouble = new OrderDouble();

    private Symbol symbol;
    private LocalDateTime openTime;
    private LocalDateTime closeTime;

    // ===== OrderDouble Delegates =====

    /**
     * Gets the initial volume of the order.
     *
     * @return the initial volume of the order
     */
    public double getVolumeInitial() {
        return orderDouble.getVolumeInitial();
    }

    /**
     * Sets the initial volume of the order.
     *
     * @param volumeInitial the initial volume of the order
     */
    public void setVolumeInitial(double volumeInitial) {
        orderDouble.setVolumeInitial(volumeInitial);
    }

    /**
     * Gets the current volume of the order.
     *
     * @return the current volume of the order
     */
    public double getVolumeCurrent() {
        return orderDouble.getVolumeCurrent();
    }

    /**
     * Sets the current volume of the order.
     *
     * @param volumeCurrent the current volume of the order
     */
    public void setVolumeCurrent(double volumeCurrent) {
        orderDouble.setVolumeCurrent(volumeCurrent);
    }

    /**
     * Gets the open price of the order.
     *
     * @return the open price of the order
     */
    public double getPriceOpen() {
        return orderDouble.getPriceOpen();
    }

    /**
     * Sets the open price of the order.
     *
     * @param priceOpen the open price of the order
     */
    public void setPriceOpen(double priceOpen) {
        orderDouble.setPriceOpen(priceOpen);
    }

    /**
     * Gets the close price of the order.
     *
     * @return the close price of the order
     */
    public double getPriceClose() {
        return orderDouble.getPriceClose();
    }

    /**
     * Sets the close price of the order.
     *
     * @param priceClose the close price of the order
     */
    public void setPriceClose(double priceClose) {
        orderDouble.setPriceClose(priceClose);
    }

    /**
     * Gets the stop loss value of the order.
     *
     * @return the stop loss value of the order
     */
    public double getStopLoss() {
        return orderDouble.getStopLoss();
    }

    /**
     * Sets the stop loss value of the order.
     *
     * @param stopLoss the stop loss value of the order
     */
    public void setStopLoss(double stopLoss) {
        orderDouble.setStopLoss(stopLoss);
    }

    /**
     * Gets the take profit value of the order.
     *
     * @return the take profit value of the order
     */
    public double getTakeProfit() {
        return orderDouble.getTakeProfit();
    }

    /**
     * Sets the take profit value of the order.
     *
     * @param takeProfit the take profit value of the order
     */
    public void setTakeProfit(double takeProfit) {
        orderDouble.setTakeProfit(takeProfit);
    }

    /**
     * Gets the current price of the order.
     *
     * @return the current price of the order
     */
    public double getPriceCurrent() {
        return orderDouble.getPriceCurrent();
    }

    /**
     * Sets the current price of the order.
     *
     * @param priceCurrent the current price of the order
     */
    public void setPriceCurrent(double priceCurrent) {
        orderDouble.setPriceCurrent(priceCurrent);
    }

    /**
     * Gets the stop limit price of the order.
     *
     * @return the stop limit price of the order
     */
    public double getPriceStopLimit() {
        return orderDouble.getPriceStopLimit();
    }

    /**
     * Sets the stop limit price of the order.
     *
     * @param priceStopLimit the stop limit price of the order
     */
    public void setPriceStopLimit(double priceStopLimit) {
        orderDouble.setPriceStopLimit(priceStopLimit);
    }

    /**
     * Gets the profit of the order.
     *
     * @return the profit of the order
     */
    public double getProfit() {
        return orderDouble.getProfit();
    }

    /**
     * Sets the profit of the order.
     *
     * @param profit the profit of the order
     */
    public void setProfit(double profit) {
        orderDouble.setProfit(profit);
    }

    // ===== OrderInteger Delegates =====

    /**
     * Gets the order ticket of the order.
     *
     * @return the order ticket of the order
     */
    public long getOrderTicket() {
        return orderInteger.getOrderTicket();
    }

    /**
     * Sets the order ticket of the order.
     *
     * @param orderTicket the order ticket to set
     */
    public void setOrderTicket(long orderTicket) {
        orderInteger.setOrderTicket(orderTicket);
    }

    /**
     * Gets the type of the order.
     *
     * @return the type of the order
     */
    public int getOrderType() {
        return orderInteger.getOrderType();
    }

    /**
     * Sets the type of the order.
     *
     * @param orderType the type of the order
     */
    public void setOrderType(int orderType) {
        orderInteger.setOrderType(orderType);
    }

    /**
     * Gets the state of the order.
     *
     * @return the state of the order
     */
    public int getOrderState() {
        return orderInteger.getOrderState();
    }

    /**
     * Sets the state of the order.
     *
     * @param orderState the state of the order
     */
    public void setOrderState(int orderState) {
        orderInteger.setOrderState(orderState);
    }

    /**
     * Gets the filling type of the order.
     *
     * @return the filling type of the order
     */
    public int getOrderTypeFilling() {
        return orderInteger.getOrderTypeFilling();
    }

    /**
     * Sets the filling type of the order.
     *
     * @param orderTypeFilling the filling type of the order
     */
    public void setOrderTypeFilling(int orderTypeFilling) {
        orderInteger.setOrderTypeFilling(orderTypeFilling);
    }

    /**
     * Gets the magic number of the order.
     *
     * @return the magic number of the order
     */
    public int getOrderMagic() {
        return orderInteger.getOrderMagic();
    }

    /**
     * Sets the magic number of the order.
     *
     * @param orderMagic the magic number of the order
     */
    public void setOrderMagic(int orderMagic) {
        orderInteger.setOrderMagic(orderMagic);
    }

    /**
     * Gets the reason for the order.
     *
     * @return the reason for the order
     */
    public int getOrderReason() {
        return orderInteger.getOrderReason();
    }

    /**
     * Sets the reason for the order.
     *
     * @param orderReason the reason for the order
     */
    public void setOrderReason(int orderReason) {
        orderInteger.setOrderReason(orderReason);
    }

    /**
     * Gets the position ID of the order.
     *
     * @return the position ID of the order
     */
    public int getOrderPositionId() {
        return orderInteger.getOrderPositionId();
    }

    /**
     * Sets the position ID of the order.
     *
     * @param orderPositionId the position ID of the order
     */
    public void setOrderPositionId(int orderPositionId) {
        orderInteger.setOrderPositionId(orderPositionId);
    }

    /**
     * Gets the position by ID of the order.
     *
     * @return the position by ID of the order
     */
    public int getOrderPositionById() {
        return orderInteger.getOrderPositionById();
    }

    /**
     * Sets the position by ID of the order.
     *
     * @param orderPositionById the position by ID of the order
     */
    public void setOrderPositionById(int orderPositionById) {
        orderInteger.setOrderPositionById(orderPositionById);
    }

    // ===== OrderString Delegates =====

    /**
     * Gets the comment of the order.
     *
     * @return the comment of the order
     */
    public String getOrderComment() {
        return orderString.getOrderComment();
    }

    /**
     * Sets the comment of the order.
     *
     * @param orderComment the comment of the order
     */
    public void setOrderComment(String orderComment) {
        orderString.setOrderComment(orderComment);
    }

    /**
     * Gets the external ID of the order.
     *
     * @return the external ID of the order
     */
    public String getOrderExternalId() {
        return orderString.getOrderExternalId();
    }

    /**
     * Sets the external ID of the order.
     *
     * @param orderExternalId the external ID of the order
     */
    public void setOrderExternalId(String orderExternalId) {
        orderString.setOrderExternalId(orderExternalId);
    }

    /**
     * Gets the symbol associated with the order.
     *
     * @return the symbol associated with the order
     */
    public Symbol getSymbol() {
        return symbol;
    }

    /**
     * Sets the symbol associated with the order.
     *
     * @param symbol the symbol to set for the order
     */
    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    /**
     * Gets the open time of the order.
     *
     * @return the open time of the order
     */
    public LocalDateTime getOpenTime() {
        return openTime;
    }

    /**
     * Sets the open time of the order.
     *
     * @param openTime the open time of the order
     */
    public void setOpenTime(LocalDateTime openTime) {
        this.openTime = openTime;
    }

    /**
     * Gets the close time of the order.
     *
     * @return the close time of the order
     */
    public LocalDateTime getCloseTime() {
        return closeTime;
    }

    /**
     * Sets the close time of the order.
     *
     * @param closeTime the close time of the order
     */
    public void setCloseTime(LocalDateTime closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * Provides a string representation of the order with all associated data.
     *
     * @return a string representation of the order
     */
    @Override
    public String toString() {
        return "Order{\n" +
                orderInteger.toString() + "\n\n" +
                orderString.toString() + "\n\n" +
                orderDouble.toString() +
                "\n}";
    }
}
