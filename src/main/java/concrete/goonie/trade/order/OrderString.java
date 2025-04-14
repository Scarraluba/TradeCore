package concrete.goonie.trade.order;

/**
 * The OrderString class represents an order with string-related details such as order comment and external ID.
 * It provides getters and setters for each of these attributes, as well as a string representation of the order.
 */
public class OrderString {

    private String orderComment;
    private String orderExternalId;

    /**
     * Gets the comment associated with the order.
     *
     * @return the order comment
     */
    public String getOrderComment() {
        return orderComment;
    }

    /**
     * Sets the comment associated with the order.
     *
     * @param orderComment the order comment to set
     */
    public void setOrderComment(String orderComment) {
        this.orderComment = orderComment;
    }

    /**
     * Gets the external ID of the order.
     *
     * @return the external ID of the order
     */
    public String getOrderExternalId() {
        return orderExternalId;
    }

    /**
     * Sets the external ID of the order.
     *
     * @param orderExternalId the external ID to set
     */
    public void setOrderExternalId(String orderExternalId) {
        this.orderExternalId = orderExternalId;
    }

    /**
     * Returns a string representation of the order with key string details.
     *
     * @return a string representation of the order
     */
    @Override
    public String toString() {
        return "Order Comment: " + orderComment + "\n" +
                "Order External ID: " + orderExternalId;
    }
}
