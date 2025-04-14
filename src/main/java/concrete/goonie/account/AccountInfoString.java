package concrete.goonie.account;


import java.io.Serializable;

class AccountInfoString implements Serializable {
    private String accountName;
    private String accountServer;
    private String accountCurrency;
    private String accountCompany;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountServer() {
        return accountServer;
    }

    public void setAccountServer(String accountServer) {
        this.accountServer = accountServer;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public String getAccountCompany() {
        return accountCompany;
    }

    public void setAccountCompany(String accountCompany) {
        this.accountCompany = accountCompany;
    }

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
