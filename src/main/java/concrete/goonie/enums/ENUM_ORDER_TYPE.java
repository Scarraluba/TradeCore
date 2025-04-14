package concrete.goonie.enums;

/**
 * Enum representing the different types of orders available in the trading system.
 * <p>
 * The order types include:
 * - MARKET_BUY: A market order to buy.
 * - MARKET_SELL: A market order to sell.
 * - LIMIT_BUY: A limit order to buy.
 * - LIMIT_SELL: A limit order to sell.
 * - STOP_BUY: A stop order to buy.
 * - STOP_SELL: A stop order to sell.
 * </p>
 */
public enum ENUM_ORDER_TYPE {

    /**
     * A market order to buy the asset at the current market price.
     */
    MARKET_BUY,

    /**
     * A market order to sell the asset at the current market price.
     */
    MARKET_SELL,

    /**
     * A limit order to buy the asset at a specified price or better.
     */
    LIMIT_BUY,

    /**
     * A limit order to sell the asset at a specified price or better.
     */
    LIMIT_SELL,

    /**
     * A stop order to buy the asset once the price rises to a certain level.
     */
    STOP_BUY,

    /**
     * A stop order to sell the asset once the price falls to a certain level.
     */
    STOP_SELL
}
