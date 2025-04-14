package concrete.goonie.account;

import java.io.Serializable;

/**
 * Represents account-related properties stored as integer or boolean types.
 * <p>
 * Includes login credentials, leverage, order limits, trade permissions, and currency precision.
 * This class is serializable for storage or transmission.
 * </p>
 */
class AccountInfoInteger implements Serializable {

    // Fields to store the property values
    private long login;
    private long leverage;
    private int limitOrders;
    private boolean tradeAllowed;
    private boolean tradeExpert;
    private int currencyDigits;

    /**
     * @return The login ID of the account.
     */
    public long getLogin() {
        return login;
    }

    /**
     * @param login Sets the login ID of the account.
     */
    public void setLogin(long login) {
        this.login = login;
    }

    /**
     * @return The leverage assigned to the account.
     */
    public long getLeverage() {
        return leverage;
    }

    /**
     * @param leverage Sets the account leverage.
     */
    public void setLeverage(long leverage) {
        this.leverage = leverage;
    }

    /**
     * @return Maximum number of allowed limit orders.
     */
    public int getLimitOrders() {
        return limitOrders;
    }

    /**
     * @param limitOrders Sets the maximum number of limit orders.
     */
    public void setLimitOrders(int limitOrders) {
        this.limitOrders = limitOrders;
    }

    /**
     * @return {@code true} if trading is allowed on the account.
     */
    public boolean isTradeAllowed() {
        return tradeAllowed;
    }

    /**
     * @param tradeAllowed Enables or disables general trading permission.
     */
    public void setTradeAllowed(boolean tradeAllowed) {
        this.tradeAllowed = tradeAllowed;
    }

    /**
     * @return {@code true} if Expert Advisors (EAs) are allowed to trade.
     */
    public boolean isTradeExpert() {
        return tradeExpert;
    }

    /**
     * @param tradeExpert Enables or disables trading by Expert Advisors.
     */
    public void setTradeExpert(boolean tradeExpert) {
        this.tradeExpert = tradeExpert;
    }

    /**
     * @return Number of digits after the decimal in currency representation.
     */
    public int getCurrencyDigits() {
        return currencyDigits;
    }

    /**
     * @param currencyDigits Sets the number of currency digits.
     */
    public void setCurrencyDigits(int currencyDigits) {
        this.currencyDigits = currencyDigits;
    }

    /**
     * Returns a string representation of this account integer info object.
     *
     * @return A formatted string containing all property values.
     */
    @Override
    public String toString() {
        return "AccountInfoInteger{" +
                "login=" + login +
                ", leverage=" + leverage +
                ", limitOrders=" + limitOrders +
                ", tradeAllowed=" + tradeAllowed +
                ", tradeExpert=" + tradeExpert +
                ", currencyDigits=" + currencyDigits +
                '}';
    }
}
