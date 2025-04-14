package concrete.goonie.trade.order;

/**
 * The OrderInteger class represents an order with integer-related details such as order ticket, type, state, and other order-related identifiers.
 * It provides getters and setters for each of these attributes, as well as a string representation of the order.
 */
public class OrderInteger {

    private long orderTicket;
    private int orderType;
    private int orderState;
    private int orderTypeFilling;
    private int orderMagic;
    private int orderReason;
    private int orderPositionId;
    private int orderPositionById;

    /**
     * Gets the ticket of the order.
     *
     * @return the ticket of the order
     */
    public long getOrderTicket() {
        return orderTicket;
    }

    /**
     * Sets the ticket of the order.
     *
     * @param orderTicket the order ticket to set
     */
    public void setOrderTicket(long orderTicket) {
        this.orderTicket = orderTicket;
    }

    /**
     * Gets the type of the order.
     *
     * @return the type of the order
     */
    public int getOrderType() {
        return orderType;
    }

    /**
     * Sets the type of the order.
     *
     * @param orderType the order type to set
     */
    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    /**
     * Gets the state of the order.
     *
     * @return the state of the order
     */
    public int getOrderState() {
        return orderState;
    }

    /**
     * Sets the state of the order.
     *
     * @param orderState the order state to set
     */
    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    /**
     * Gets the filling type of the order.
     *
     * @return the filling type of the order
     */
    public int getOrderTypeFilling() {
        return orderTypeFilling;
    }

    /**
     * Sets the filling type of the order.
     *
     * @param orderTypeFilling the order filling type to set
     */
    public void setOrderTypeFilling(int orderTypeFilling) {
        this.orderTypeFilling = orderTypeFilling;
    }

    /**
     * Gets the magic number of the order.
     *
     * @return the magic number of the order
     */
    public int getOrderMagic() {
        return orderMagic;
    }

    /**
     * Sets the magic number of the order.
     *
     * @param orderMagic the magic number to set
     */
    public void setOrderMagic(int orderMagic) {
        this.orderMagic = orderMagic;
    }

    /**
     * Gets the reason for the order.
     *
     * @return the reason for the order
     */
    public int getOrderReason() {
        return orderReason;
    }

    /**
     * Sets the reason for the order.
     *
     * @param orderReason the reason to set
     */
    public void setOrderReason(int orderReason) {
        this.orderReason = orderReason;
    }

    /**
     * Gets the position ID of the order.
     *
     * @return the position ID of the order
     */
    public int getOrderPositionId() {
        return orderPositionId;
    }

    /**
     * Sets the position ID of the order.
     *
     * @param orderPositionId the position ID to set
     */
    public void setOrderPositionId(int orderPositionId) {
        this.orderPositionId = orderPositionId;
    }

    /**
     * Gets the position by ID of the order.
     *
     * @return the position by ID of the order
     */
    public int getOrderPositionById() {
        return orderPositionById;
    }

    /**
     * Sets the position by ID of the order.
     *
     * @param orderPositionById the position by ID to set
     */
    public void setOrderPositionById(int orderPositionById) {
        this.orderPositionById = orderPositionById;
    }

    /**
     * Returns a string representation of the order with key details.
     *
     * @return a string representation of the order
     */
    @Override
    public String toString() {
        return "Order Ticket: " + orderTicket + "\n" +
                "Order Type: " + orderType + "\n" +
                "Order State: " + orderState + "\n" +
                "Order Type Filling: " + orderTypeFilling + "\n" +
                "Order Magic: " + orderMagic + "\n" +
                "Order Reason: " + orderReason + "\n" +
                "Order Position ID: " + orderPositionId + "\n" +
                "Order Position By ID: " + orderPositionById;
    }

}
