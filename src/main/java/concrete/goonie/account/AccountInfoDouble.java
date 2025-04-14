package concrete.goonie.account;


import java.io.Serializable;

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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getEquity() {
        return equity;
    }

    public void setEquity(double equity) {
        this.equity = equity;
    }

    public double getMargin() {
        return margin;
    }

    public void setMargin(double margin) {
        this.margin = margin;
    }

    public double getMarginFree() {
        return marginFree;
    }

    public void setMarginFree(double marginFree) {
        this.marginFree = marginFree;
    }

    public double getMarginLevel() {
        return marginLevel;
    }

    public void setMarginLevel(double marginLevel) {
        this.marginLevel = marginLevel;
    }

    public double getMarginSOMarginCall() {
        return marginSOMarginCall;
    }

    public void setMarginSOMarginCall(double marginSOMarginCall) {
        this.marginSOMarginCall = marginSOMarginCall;
    }

    public double getMarginSOMarginStopOut() {
        return marginSOMarginStopOut;
    }

    public void setMarginSOMarginStopOut(double marginSOMarginStopOut) {
        this.marginSOMarginStopOut = marginSOMarginStopOut;
    }

    public double getMarginInitial() {
        return marginInitial;
    }

    public void setMarginInitial(double marginInitial) {
        this.marginInitial = marginInitial;
    }

    public double getMarginMaintenance() {
        return marginMaintenance;
    }

    public void setMarginMaintenance(double marginMaintenance) {
        this.marginMaintenance = marginMaintenance;
    }

    public double getAssets() {
        return assets;
    }

    public void setAssets(double assets) {
        this.assets = assets;
    }

    public double getLiabilities() {
        return liabilities;
    }

    public void setLiabilities(double liabilities) {
        this.liabilities = liabilities;
    }

    public double getCommissionBlocked() {
        return commissionBlocked;
    }

    public void setCommissionBlocked(double commissionBlocked) {
        this.commissionBlocked = commissionBlocked;
    }

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
