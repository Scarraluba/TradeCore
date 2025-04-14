package concrete.goonie.trade.position;


public class PositionString {
    private String comment;
    private String externalId;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Override
    public String toString() {
        return "Position Information:\n" +
                "Comment: " + comment + "\n" +
                "External ID: " + externalId;
    }
}
