package concrete.goonie.trade.position;

/**
 * Represents the integer-type properties of a trading position.
 * This class holds various details such as ticket number, open and update times,
 * position type, magic number, identifier, and the reason for the position.
 */
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

    /**
     * Gets the ticket number of the position.
     * @return the ticket number.
     */
    public long getTicket() {
        return ticket;
    }

    /**
     * Sets the ticket number of the position.
     * @param ticket the ticket number to set.
     */
    public void setTicket(long ticket) {
        this.ticket = ticket;
    }

    /**
     * Gets the open time of the position.
     * @return the open time in seconds.
     */
    public long getOpenTime() {
        return openTime;
    }

    /**
     * Sets the open time of the position.
     * @param openTime the open time in seconds to set.
     */
    public void setOpenTime(long openTime) {
        this.openTime = openTime;
    }

    /**
     * Gets the open time in milliseconds of the position.
     * @return the open time in milliseconds.
     */
    public long getOpenTimeMillis() {
        return openTimeMillis;
    }

    /**
     * Sets the open time in milliseconds of the position.
     * @param openTimeMillis the open time in milliseconds to set.
     */
    public void setOpenTimeMillis(long openTimeMillis) {
        this.openTimeMillis = openTimeMillis;
    }

    /**
     * Gets the update time of the position.
     * @return the update time in seconds.
     */
    public long getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the update time of the position.
     * @param updateTime the update time in seconds to set.
     */
    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * Gets the update time in milliseconds of the position.
     * @return the update time in milliseconds.
     */
    public long getUpdateTimeMillis() {
        return updateTimeMillis;
    }

    /**
     * Sets the update time in milliseconds of the position.
     * @param updateTimeMillis the update time in milliseconds to set.
     */
    public void setUpdateTimeMillis(long updateTimeMillis) {
        this.updateTimeMillis = updateTimeMillis;
    }

    /**
     * Gets the type of the position.
     * @return the type of the position.
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the type of the position.
     * @param type the type to set.
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * Gets the magic number associated with the position.
     * @return the magic number.
     */
    public int getMagicNumber() {
        return magicNumber;
    }

    /**
     * Sets the magic number associated with the position.
     * @param magicNumber the magic number to set.
     */
    public void setMagicNumber(int magicNumber) {
        this.magicNumber = magicNumber;
    }

    /**
     * Gets the identifier of the position.
     * @return the identifier.
     */
    public long getIdentifier() {
        return identifier;
    }

    /**
     * Sets the identifier of the position.
     * @param identifier the identifier to set.
     */
    public void setIdentifier(long identifier) {
        this.identifier = identifier;
    }

    /**
     * Gets the reason for the position.
     * @return the reason for the position.
     */
    public int getReason() {
        return reason;
    }

    /**
     * Sets the reason for the position.
     * @param reason the reason to set.
     */
    public void setReason(int reason) {
        this.reason = reason;
    }

    /**
     * Provides a string representation of the PositionInteger object.
     * @return a string describing the position's properties.
     */
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
