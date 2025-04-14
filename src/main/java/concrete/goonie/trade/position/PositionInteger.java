package concrete.goonie.trade.position;


public class PositionInteger {

    // Fields to store the property values
    private long ticket;
    private long openTime;
    private long openTimeMillis;
    private long updateTime;
    private long updateTimeMillis;
    private int type;
    private int magicNumber;
    private long identifier;
    private int reason;

    public long getTicket() {
        return ticket;
    }

    public void setTicket(long ticket) {
        this.ticket = ticket;
    }

    public long getOpenTime() {
        return openTime;
    }

    public void setOpenTime(long openTime) {
        this.openTime = openTime;
    }

    public long getOpenTimeMillis() {
        return openTimeMillis;
    }

    public void setOpenTimeMillis(long openTimeMillis) {
        this.openTimeMillis = openTimeMillis;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public long getUpdateTimeMillis() {
        return updateTimeMillis;
    }

    public void setUpdateTimeMillis(long updateTimeMillis) {
        this.updateTimeMillis = updateTimeMillis;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getMagicNumber() {
        return magicNumber;
    }

    public void setMagicNumber(int magicNumber) {
        this.magicNumber = magicNumber;
    }

    public long getIdentifier() {
        return identifier;
    }

    public void setIdentifier(long identifier) {
        this.identifier = identifier;
    }

    public int getReason() {
        return reason;
    }

    public void setReason(int reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Position Information:\n" +
                "Ticket: " + ticket + "\n" +
                "Open Time: " + openTime + "\n" +
                "Open Time (Millis): " + openTimeMillis + "\n" +
                "Update Time: " + updateTime + "\n" +
                "Update Time (Millis): " + updateTimeMillis + "\n" +
                "Type: " + type + "\n" +
                "Magic Number: " + magicNumber + "\n" +
                "Identifier: " + identifier + "\n" +
                "Reason: " + reason;
    }
}
