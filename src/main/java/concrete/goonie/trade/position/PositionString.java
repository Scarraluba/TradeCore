package concrete.goonie.trade.position;

/**
 * Represents the string-type properties of a trading position.
 * This class holds the comment and external ID associated with the position.
 */
public class PositionString {

    // Fields to store the string property values
    private String comment;
    private String externalId;

    /**
     * Gets the comment associated with the position.
     * @return the comment of the position.
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the comment for the position.
     * @param comment the comment to set for the position.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Gets the external ID associated with the position.
     * @return the external ID of the position.
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the external ID for the position.
     * @param externalId the external ID to set for the position.
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * Provides a string representation of the PositionString object.
     * @return a string describing the position's properties.
     */
    @Override
    public String toString() {
        return "Position Information:\n" +
                "Comment: " + comment + "\n" +
                "External ID: " + externalId;
    }
}
