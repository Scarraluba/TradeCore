package concrete.goonie.account;

import java.io.Serializable;

/**
 * Represents detailed account information using double-precision values.
 * This class encapsulates various financial metrics such as balance, equity,
 * margin requirements, and account assets or liabilities.
 * <p>
 * It is designed to be serializable for transmission or storage.
 * </p>
 */
class AccountInfoDouble implements Serializable {

    // Fields to store the property values
    private double balance;
    private double credit;
    private double profit;
    private double equity;
    private double margin;
    private double marginFree;
    private double marginLevel;
    private double marginSOMarginCall;
    private double marginSOMarginStopOut;
    private double marginInitial;
    private double marginMaintenance;
    private double assets;
    private double liabilities;
    private double commissionBlocked;

    /**
     * @return Current account balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance Sets the current account balance.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return Credit allocated to the account.
     */
    public double getCredit() {
        return credit;
    }

    /**
     * @param credit Sets the account's credit value.
     */
    public void setCredit(double credit) {
        this.credit = credit;
    }

    /**
     * @return Current floating profit or loss.
     */
    public double getProfit() {
        return profit;
    }

    /**
     * @param profit Sets the floating profit or loss.
     */
    public void setProfit(double profit) {
        this.profit = profit;
    }

    /**
     * @return Account equity (balance + credit + profit).
     */
    public double getEquity() {
        return equity;
    }

    /**
     * @param equity Sets the account's equity.
     */
    public void setEquity(double equity) {
        this.equity = equity;
    }

    /**
     * @return Margin used for currently open positions.
     */
    public double getMargin() {
        return margin;
    }

    /**
     * @param margin Sets the used margin.
     */
    public void setMargin(double margin) {
        this.margin = margin;
    }

    /**
     * @return Free margin available for new positions.
     */
    public double getMarginFree() {
        return marginFree;
    }

    /**
     * @param marginFree Sets the free margin.
     */
    public void setMarginFree(double marginFree) {
        this.marginFree = marginFree;
    }

    /**
     * @return Margin level (typically equity / margin * 100).
     */
    public double getMarginLevel() {
        return marginLevel;
    }

    /**
     * @param marginLevel Sets the margin level.
     */
    public void setMarginLevel(double marginLevel) {
        this.marginLevel = marginLevel;
    }

    /**
     * @return Margin level at which margin call occurs.
     */
    public double getMarginSOMarginCall() {
        return marginSOMarginCall;
    }

    /**
     * @param marginSOMarginCall Sets the margin call level.
     */
    public void setMarginSOMarginCall(double marginSOMarginCall) {
        this.marginSOMarginCall = marginSOMarginCall;
    }

    /**
     * @return Margin level at which stop out occurs.
     */
    public double getMarginSOMarginStopOut() {
        return marginSOMarginStopOut;
    }

    /**
     * @param marginSOMarginStopOut Sets the stop out level.
     */
    public void setMarginSOMarginStopOut(double marginSOMarginStopOut) {
        this.marginSOMarginStopOut = marginSOMarginStopOut;
    }

    /**
     * @return Initial margin required to open positions.
     */
    public double getMarginInitial() {
        return marginInitial;
    }

    /**
     * @param marginInitial Sets the initial margin.
     */
    public void setMarginInitial(double marginInitial) {
        this.marginInitial = marginInitial;
    }

    /**
     * @return Maintenance margin required to keep positions open.
     */
    public double getMarginMaintenance() {
        return marginMaintenance;
    }

    /**
     * @param marginMaintenance Sets the maintenance margin.
     */
    public void setMarginMaintenance(double marginMaintenance) {
        this.marginMaintenance = marginMaintenance;
    }

    /**
     * @return Total assets held in the account.
     */
    public double getAssets() {
        return assets;
    }

    /**
     * @param assets Sets the total assets.
     */
    public void setAssets(double assets) {
        this.assets = assets;
    }

    /**
     * @return Total liabilities of the account.
     */
    public double getLiabilities() {
        return liabilities;
    }

    /**
     * @param liabilities Sets the total liabilities.
     */
    public void setLiabilities(double liabilities) {
        this.liabilities = liabilities;
    }

    /**
     * @return Commission amount that is currently blocked.
     */
    public double getCommissionBlocked() {
        return commissionBlocked;
    }

    /**
     * @param commissionBlocked Sets the blocked commission.
     */
    public void setCommissionBlocked(double commissionBlocked) {
        this.commissionBlocked = commissionBlocked;
    }

    /**
     * Returns a string representation of this account information object.
     *
     * @return A formatted string of all the fields.
     */
    @Override
    public String toString() {
        return "AccountInfoDouble{" +
                "balance=" + balance +
                ", credit=" + credit +
                ", profit=" + profit +
                ", equity=" + equity +
                ", margin=" + margin +
                ", marginFree=" + marginFree +
                ", marginLevel=" + marginLevel +
                ", marginSOMarginCall=" + marginSOMarginCall +
                ", marginSOMarginStopOut=" + marginSOMarginStopOut +
                ", marginInitial=" + marginInitial +
                ", marginMaintenance=" + marginMaintenance +
                ", assets=" + assets +
                ", liabilities=" + liabilities +
                ", commissionBlocked=" + commissionBlocked +
                '}';
    }
}
