package concrete.goonie.trade.order;

public class OrderInteger {

    private long orderTicket;
    private int orderType;
    private int orderState;
    private int orderTypeFilling;
    private int orderMagic;
    private int orderReason;
    private int orderPositionId;
    private int orderPositionById;

    public long getOrderTicket() {
        return orderTicket;
    }

    public void setOrderTicket(long orderTicket) {
        this.orderTicket = orderTicket;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    public int getOrderTypeFilling() {
        return orderTypeFilling;
    }

    public void setOrderTypeFilling(int orderTypeFilling) {
        this.orderTypeFilling = orderTypeFilling;
    }

    public int getOrderMagic() {
        return orderMagic;
    }

    public void setOrderMagic(int orderMagic) {
        this.orderMagic = orderMagic;
    }

    public int getOrderReason() {
        return orderReason;
    }

    public void setOrderReason(int orderReason) {
        this.orderReason = orderReason;
    }

    public int getOrderPositionId() {
        return orderPositionId;
    }

    public void setOrderPositionId(int orderPositionId) {
        this.orderPositionId = orderPositionId;
    }

    public int getOrderPositionById() {
        return orderPositionById;
    }

    public void setOrderPositionById(int orderPositionById) {
        this.orderPositionById = orderPositionById;
    }

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
