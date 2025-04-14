package concrete.goonie.enums;

/**
 * Enum representing the types of positions in a trading system.
 * <p>
 * The position types are:
 * - POSITION_TYPE_BUY: Represents a buy position in the market.
 * - POSITION_TYPE_SELL: Represents a sell position in the market.
 * </p>
 */
public enum ENUM_POSITION_TYPE {

    /**
     * A buy position, where the asset is bought with the expectation that its price will rise.
     */
    POSITION_TYPE_BUY,

    /**
     * A sell position, where the asset is sold with the expectation that its price will fall.
     */
    POSITION_TYPE_SELL
}
