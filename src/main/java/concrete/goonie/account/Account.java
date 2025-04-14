package concrete.goonie.account;

import concrete.goonie.Orders;
import concrete.goonie.Positions;
import concrete.goonie.Symbols;

import java.time.LocalDateTime;

/**
 * Represents a trading account containing all relevant account information such as balances, leverage,
 * account name, currency, positions, and symbol data. Also includes singleton support for global access.
 */
public class Account {

    private final AccountInfoDouble accountInfoDouble;
    private final AccountInfoInteger accountInfoInteger;
    private final AccountInfoString accountInfoString;
    private static Account instance;
    private final Positions positions;
    private final Orders orders;
    private final Symbols symbols;
    private LocalDateTime fromDate, toDate;

    private boolean activeAccount;

    /**
     * Default constructor initializing all account information objects and shared trading data (positions and symbols).
     */
    public Account() {
        accountInfoDouble = new AccountInfoDouble();
        accountInfoInteger = new AccountInfoInteger();
        accountInfoString = new AccountInfoString();
        positions = Positions.getInstance();
        orders = Orders.getInstance();
        symbols = Symbols.getInstance();
        instance = this;
    }

    /**
     * Initializes a new account with essential data.
     *
     * @param name     the account name
     * @param currency the account base currency
     * @param deposit  the initial deposit
     * @param leverage the leverage ratio
     */
    public Account(String name, String currency, double deposit, int leverage) {
        this();
        setAccountName(name);
        setAccountCurrency(currency);
        setLeverage(leverage);
        setLimitOrders(50);
        setMarginFree(deposit);
        setMarginLevel(0);
        setEquity(deposit);
        setBalance(deposit);
    }

    /**
     * Initializes a new account with full tracking information including balance, credit, and trading period.
     *
     * @param id       the account login ID
     * @param name     the account name
     * @param currency the account currency
     * @param credit   the account credit
     * @param balance  the account balance
     * @param leverage the account leverage
     * @param fromDate the start date of account activity
     * @param toDate   the end date of account activity
     */
    public Account(int id, String name, String currency, double credit, double balance,
                   int leverage, LocalDateTime fromDate, LocalDateTime toDate) {
        this(name, currency, balance, leverage);
        setCredit(credit);
        setLogin(id);
        setFromDate(fromDate);
        setToDate(toDate);
    }

    /**
     * Returns the current singleton instance of the Account.
     *
     * @return the Account instance
     */
    public static synchronized Account getInstance() {
        return instance;
    }

    /**
     * Sets the singleton instance if not already initialized.
     *
     * @param account the account to set as instance
     * @return the existing or newly set instance
     */
    public static synchronized Account setInstance(Account account) {
        if (instance == null) {
            instance = account;
        }
        return instance;
    }

    // ===========================
    // AccountInfoDouble Delegates
    // ===========================

    /** @return the current balance of the account */
    public double getBalance() {
        return accountInfoDouble.getBalance();
    }

    /** @param balance sets the account balance */
    public void setBalance(double balance) {
        accountInfoDouble.setBalance(balance);
    }

    /** @return the account credit */
    public double getCredit() {
        return accountInfoDouble.getCredit();
    }

    /** @param credit sets the account credit */
    public void setCredit(double credit) {
        accountInfoDouble.setCredit(credit);
    }

    /** @return the current profit */
    public double getProfit() {
        return accountInfoDouble.getProfit();
    }

    /** @param profit sets the account profit */
    public void setProfit(double profit) {
        accountInfoDouble.setProfit(profit);
    }

    /** @return the account equity */
    public double getEquity() {
        return accountInfoDouble.getEquity();
    }

    /** @param equity sets the account equity */
    public void setEquity(double equity) {
        accountInfoDouble.setEquity(equity);
    }

    /** @return the used margin */
    public double getMargin() {
        return accountInfoDouble.getMargin();
    }

    /** @param margin sets the used margin */
    public void setMargin(double margin) {
        accountInfoDouble.setMargin(margin);
    }

    /** @return the free margin */
    public double getMarginFree() {
        return accountInfoDouble.getMarginFree();
    }

    /** @param marginFree sets the free margin */
    public void setMarginFree(double marginFree) {
        accountInfoDouble.setMarginFree(marginFree);
    }

    /** @return the margin level */
    public double getMarginLevel() {
        return accountInfoDouble.getMarginLevel();
    }

    /** @param marginLevel sets the margin level */
    public void setMarginLevel(double marginLevel) {
        accountInfoDouble.setMarginLevel(marginLevel);
    }

    /** @return margin call threshold */
    public double getMarginSOMarginCall() {
        return accountInfoDouble.getMarginSOMarginCall();
    }

    /** @param marginSOMarginCall sets the margin call threshold */
    public void setMarginSOMarginCall(double marginSOMarginCall) {
        accountInfoDouble.setMarginSOMarginCall(marginSOMarginCall);
    }

    /** @return stop out margin level */
    public double getMarginSOMarginStopOut() {
        return accountInfoDouble.getMarginSOMarginStopOut();
    }

    /** @param marginSOMarginStopOut sets the stop out margin level */
    public void setMarginSOMarginStopOut(double marginSOMarginStopOut) {
        accountInfoDouble.setMarginSOMarginStopOut(marginSOMarginStopOut);
    }

    /** @return initial margin */
    public double getMarginInitial() {
        return accountInfoDouble.getMarginInitial();
    }

    /** @param marginInitial sets the initial margin */
    public void setMarginInitial(double marginInitial) {
        accountInfoDouble.setMarginInitial(marginInitial);
    }

    /** @return maintenance margin */
    public double getMarginMaintenance() {
        return accountInfoDouble.getMarginMaintenance();
    }

    /** @param marginMaintenance sets the maintenance margin */
    public void setMarginMaintenance(double marginMaintenance) {
        accountInfoDouble.setMarginMaintenance(marginMaintenance);
    }

    /** @return the account's total assets */
    public double getAssets() {
        return accountInfoDouble.getAssets();
    }

    /** @param assets sets the total assets */
    public void setAssets(double assets) {
        accountInfoDouble.setAssets(assets);
    }

    /** @return the account's liabilities */
    public double getLiabilities() {
        return accountInfoDouble.getLiabilities();
    }

    /** @param liabilities sets the liabilities */
    public void setLiabilities(double liabilities) {
        accountInfoDouble.setLiabilities(liabilities);
    }

    /** @return blocked commission amount */
    public double getCommissionBlocked() {
        return accountInfoDouble.getCommissionBlocked();
    }

    /** @param commissionBlocked sets blocked commission */
    public void setCommissionBlocked(double commissionBlocked) {
        accountInfoDouble.setCommissionBlocked(commissionBlocked);
    }

    // ============================
    // AccountInfoInteger Delegates
    // ============================

    /** @return the login ID */
    public long getLogin() {
        return accountInfoInteger.getLogin();
    }

    /** @param login sets the login ID */
    public void setLogin(long login) {
        accountInfoInteger.setLogin(login);
    }

    /** @return the account leverage */
    public long getLeverage() {
        return accountInfoInteger.getLeverage();
    }

    /** @param leverage sets the account leverage */
    public void setLeverage(long leverage) {
        accountInfoInteger.setLeverage(leverage);
    }

    /** @return maximum number of limit orders */
    public int getLimitOrders() {
        return accountInfoInteger.getLimitOrders();
    }

    /** @param limitOrders sets the max number of limit orders */
    public void setLimitOrders(int limitOrders) {
        accountInfoInteger.setLimitOrders(limitOrders);
    }

    /** @return true if trading is allowed */
    public boolean isTradeAllowed() {
        return accountInfoInteger.isTradeAllowed();
    }

    /** @param tradeAllowed enables or disables trading */
    public void setTradeAllowed(boolean tradeAllowed) {
        accountInfoInteger.setTradeAllowed(tradeAllowed);
    }

    /** @return true if expert advisors are allowed */
    public boolean isTradeExpert() {
        return accountInfoInteger.isTradeExpert();
    }

    /** @param tradeExpert enables or disables expert trading */
    public void setTradeExpert(boolean tradeExpert) {
        accountInfoInteger.setTradeExpert(tradeExpert);
    }

    /** @return number of digits used for currency formatting */
    public int getCurrencyDigits() {
        return accountInfoInteger.getCurrencyDigits();
    }

    /** @param currencyDigits sets the number of currency digits */
    public void setCurrencyDigits(int currencyDigits) {
        accountInfoInteger.setCurrencyDigits(currencyDigits);
    }

    // ===========================
    // AccountInfoString Delegates
    // ===========================

    /** @return account name */
    public String getAccountName() {
        return accountInfoString.getAccountName();
    }

    /** @param accountName sets the account name */
    public void setAccountName(String accountName) {
        accountInfoString.setAccountName(accountName);
    }

    /** @return account server name */
    public String getAccountServer() {
        return accountInfoString.getAccountServer();
    }

    /** @param accountServer sets the server name */
    public void setAccountServer(String accountServer) {
        accountInfoString.setAccountServer(accountServer);
    }

    /** @return base currency of the account */
    public String getAccountCurrency() {
        return accountInfoString.getAccountCurrency();
    }

    /** @param accountCurrency sets the base currency */
    public void setAccountCurrency(String accountCurrency) {
        accountInfoString.setAccountCurrency(accountCurrency);
    }

    /** @return company associated with the account */
    public String getAccountCompany() {
        return accountInfoString.getAccountCompany();
    }

    /** @param accountCompany sets the account's company */
    public void setAccountCompany(String accountCompany) {
        accountInfoString.setAccountCompany(accountCompany);
    }

    // ======================
    // Other Accessors
    // ======================

    /** @return associated open positions */
    public Positions getPositions() {
        return positions;
    }

    public Orders getOrders() {
        return orders;
    }

    /** @return symbols used in trading */
    public Symbols getSymbols() {
        return symbols;
    }

    /** @return true if account is marked active */
    public boolean isActiveAccount() {
        return activeAccount;
    }

    /** @return account start date */
    public LocalDateTime getFromDate() {
        return fromDate;
    }

    /** @param fromDate sets the account's start date */
    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    /** @return account end date */
    public LocalDateTime getToDate() {
        return toDate;
    }

    /** @param toDate sets the account's end date */
    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
    }

    /**
     * Returns a string representation of the account's info sections.
     *
     * @return formatted account summary
     */
    @Override
    public String toString() {
        return "Account{" +
                "\naccountInfoDouble=" + accountInfoDouble +
                ",\naccountInfoInteger=" + accountInfoInteger +
                ",\naccountInfoString=" + accountInfoString +
                "\n}";
    }
}
