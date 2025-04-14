package concrete.goonie.enums;

/**
 * Enum representing various return codes for trading or order processing.
 * <p>
 * Each enum constant corresponds to a specific status or error code that
 * might be encountered during trading operations, such as invalid lot sizes,
 * margin calls, or take profit hits.
 * </p>
 */
public enum RETCODES {

    /**
     * Invalid lot size.
     */
    RET_INVALID_LOT("Invalid Lot Size"),

    /**
     * The operation was successful.
     */
    RET_OK("OK"),

    /**
     * The volume limit has been exceeded.
     */
    RET_VOLUME_LIMIT_EXCEEDED("Volume Limit Exceeded"),

    /**
     * The stop level is invalid.
     */
    RET_INVALID_STOP_LEVEL("Invalid Stop Level"),

    /**
     * Margin call occurred.
     */
    RET_MARGIN_CALL("Margin Call"),

    /**
     * The stop level has been hit.
     */
    RET_STOP_LEVEL_HIT("Stop Level Hit"),

    /**
     * Not enough money to execute the order.
     */
    RET_NOT_ENOUGH_MONEY("Not Enough Money"),

    /**
     * Take profit level has been hit.
     */
    RET_TAKE_PROFIT_HIT("Take Profit Hit"),

    /**
     * The order was manually closed.
     */
    RET_MANUAL_CLOSE("Manually Closed"),

    /**
     * Trailing stop failed.
     */
    TRAIL_FAIL("Trailing Failed");

    private final String description;

    /**
     * Constructor for the RETCODES enum.
     *
     * @param description the description of the return code.
     */
    RETCODES(String description) {
        this.description = description;
    }

    /**
     * Returns the description of the return code.
     *
     * @return the description of the return code.
     */
    @Override
    public String toString() {
        return description;
    }
}
