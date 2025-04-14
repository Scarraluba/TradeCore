package concrete.goonie.trade.order;


public class OrderString {


    private String orderComment;
    private String orderExternalId;


    public String getOrderComment() {
        return orderComment;
    }

    public void setOrderComment(String orderComment) {
        this.orderComment = orderComment;
    }

    public String getOrderExternalId() {
        return orderExternalId;
    }

    public void setOrderExternalId(String orderExternalId) {
        this.orderExternalId = orderExternalId;
    }

    @Override
    public String toString() {
        return "Order Comment: " + orderComment + "\n" +
                "Order External ID: " + orderExternalId;
    }

    // Other getter methods...
}
