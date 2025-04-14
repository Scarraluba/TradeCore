package concrete.goonie.trade.Brokerage;

import concrete.goonie.enums.ENUM_ORDER_TYPE;
import concrete.goonie.symbol.Symbol;

import java.time.LocalDateTime;

/**
 * The PendingOrder class represents a trade order that has been placed but is not yet executed.
 * This order will be triggered when the specified conditions (such as price) are met.
 */
class PendingOrder {

    private int ticket;            // Unique identifier for the order
    private Symbol symbol;         // Symbol for the asset (e.g., currency pair)
    private double volume;         // Number of lots to trade
    private ENUM_ORDER_TYPE type; // Type of the order (e.g., buy limit, sell stop)
    private double price;          // The price at which the order will be triggered
    private double stopLoss;       // Stop loss level for risk management
    private double takeProfit;     // Take profit level for profit-taking
    private LocalDateTime expiration; // Expiration date and time of the order
    private String comment;        // Optional comment or note attached to the order

    /**
     * Constructs a new PendingOrder with the specified parameters.
     *
     * @param ticket the unique ticket number for the order
     * @param symbol the symbol of the asset being traded
     * @param volume the number of lots for the order
     * @param type the type of order (e.g., buy limit, sell stop)
     * @param price the price at which the order will be triggered
     * @param stopLoss the stop loss level for the order
     * @param takeProfit the take profit level for the order
     * @param expiration the expiration time of the order
     * @param comment an optional comment for the order
     */
    public PendingOrder(int ticket, Symbol symbol, double volume, ENUM_ORDER_TYPE type,
                        double price, double stopLoss, double takeProfit,
                        LocalDateTime expiration, String comment) {
        this.ticket = ticket;
        this.symbol = symbol;
        this.volume = volume;
        this.type = type;
        this.price = price;
        this.stopLoss = stopLoss;
        this.takeProfit = takeProfit;
        this.expiration = expiration;
        this.comment = comment;
    }

    /**
     * Gets the unique ticket number for the order.
     *
     * @return the ticket number
     */
    public int getTicket() {
        return ticket;
    }

    /**
     * Sets the unique ticket number for the order.
     *
     * @param ticket the ticket number to set
     */
    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    /**
     * Gets the symbol for the asset being traded.
     *
     * @return the symbol of the asset
     */
    public Symbol getSymbol() {
        return symbol;
    }

    /**
     * Sets the symbol for the asset being traded.
     *
     * @param symbol the symbol of the asset to set
     */
    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    /**
     * Gets the number of lots for the order.
     *
     * @return the volume of the order
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the number of lots for the order.
     *
     * @param volume the volume of the order to set
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Gets the type of the order (e.g., buy limit, sell stop).
     *
     * @return the type of the order
     */
    public ENUM_ORDER_TYPE getType() {
        return type;
    }

    /**
     * Sets the type of the order (e.g., buy limit, sell stop).
     *
     * @param type the type of order to set
     */
    public void setType(ENUM_ORDER_TYPE type) {
        this.type = type;
    }

    /**
     * Gets the price at which the order will be triggered.
     *
     * @return the price of the order
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price at which the order will be triggered.
     *
     * @param price the price to set for the order
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the stop loss level for the order.
     *
     * @return the stop loss level
     */
    public double getStopLoss() {
        return stopLoss;
    }

    /**
     * Sets the stop loss level for the order.
     *
     * @param stopLoss the stop loss level to set
     */
    public void setStopLoss(double stopLoss) {
        this.stopLoss = stopLoss;
    }

    /**
     * Gets the take profit level for the order.
     *
     * @return the take profit level
     */
    public double getTakeProfit() {
        return takeProfit;
    }

    /**
     * Sets the take profit level for the order.
     *
     * @param takeProfit the take profit level to set
     */
    public void setTakeProfit(double takeProfit) {
        this.takeProfit = takeProfit;
    }

    /**
     * Gets the expiration time of the order.
     *
     * @return the expiration time of the order
     */
    public LocalDateTime getExpiration() {
        return expiration;
    }

    /**
     * Sets the expiration time of the order.
     *
     * @param expiration the expiration time to set
     */
    public void setExpiration(LocalDateTime expiration) {
        this.expiration = expiration;
    }

    /**
     * Gets the optional comment for the order.
     *
     * @return the comment attached to the order
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets an optional comment for the order.
     *
     * @param comment the comment to attach to the order
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}
