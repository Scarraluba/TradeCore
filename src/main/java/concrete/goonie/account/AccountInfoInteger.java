package concrete.goonie.account;


import java.io.Serializable;

class AccountInfoInteger implements Serializable {
    // Fields to store the property values
    private long login;
    private long leverage;
    private int limitOrders;
    private boolean tradeAllowed;
    private boolean tradeExpert;
    private int currencyDigits;

    public long getLogin() {
        return login;
    }

    public void setLogin(long login) {
        this.login = login;
    }

    public long getLeverage() {
        return leverage;
    }

    public void setLeverage(long leverage) {
        this.leverage = leverage;
    }

    public int getLimitOrders() {
        return limitOrders;
    }

    public void setLimitOrders(int limitOrders) {
        this.limitOrders = limitOrders;
    }

    public boolean isTradeAllowed() {
        return tradeAllowed;
    }

    public void setTradeAllowed(boolean tradeAllowed) {
        this.tradeAllowed = tradeAllowed;
    }

    public boolean isTradeExpert() {
        return tradeExpert;
    }

    public void setTradeExpert(boolean tradeExpert) {
        this.tradeExpert = tradeExpert;
    }

    public int getCurrencyDigits() {
        return currencyDigits;
    }

    public void setCurrencyDigits(int currencyDigits) {
        this.currencyDigits = currencyDigits;
    }

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
