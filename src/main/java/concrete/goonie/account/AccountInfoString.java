package concrete.goonie.account;

import java.io.Serializable;

/**
 * Represents account-related properties stored as String types.
 * <p>
 * Includes account name, server, currency, and associated company information.
 * This class is serializable for storage or transmission.
 * </p>
 */
class AccountInfoString implements Serializable {

    // Fields to store the property values
    private String accountName;
    private String accountServer;
    private String accountCurrency;
    private String accountCompany;

    /**
     * @return The name of the account.
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * @param accountName Sets the name of the account.
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * @return The server to which the account is connected.
     */
    public String getAccountServer() {
        return accountServer;
    }

    /**
     * @param accountServer Sets the server for the account connection.
     */
    public void setAccountServer(String accountServer) {
        this.accountServer = accountServer;
    }

    /**
     * @return The currency used by the account.
     */
    public String getAccountCurrency() {
        return accountCurrency;
    }

    /**
     * @param accountCurrency Sets the currency for the account.
     */
    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    /**
     * @return The company associated with the account.
     */
    public String getAccountCompany() {
        return accountCompany;
    }

    /**
     * @param accountCompany Sets the company for the account.
     */
    public void setAccountCompany(String accountCompany) {
        this.accountCompany = accountCompany;
    }

    /**
     * Returns a string representation of this account string info object.
     *
     * @return A formatted string containing all property values.
     */
    @Override
    public String toString() {
        return "AccountInfoString{" +
                "accountName='" + accountName + '\'' +
                ", accountServer='" + accountServer + '\'' +
                ", accountCurrency='" + accountCurrency + '\'' +
                ", accountCompany='" + accountCompany + '\'' +
                '}';
    }
}
