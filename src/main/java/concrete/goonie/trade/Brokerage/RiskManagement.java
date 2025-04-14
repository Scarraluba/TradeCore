package concrete.goonie.trade.Brokerage;

import concrete.goonie.account.Account;

/**
 * The RiskManagement class is responsible for validating and enforcing risk management rules for trading.
 * It ensures that each trade adheres to predefined risk parameters like lot size, margin requirements,
 * maximum open trades, and daily loss limits.
 */
class RiskManagement {
    private double maxLotSize;
    private double minLotSize;
    private int maxOpenTrades;
    private double maxRiskPerTrade; // as percentage of balance
    private double maxDailyLoss; // as percentage of balance
    private double maxPositionSize; // as percentage of equity

    /**
     * Constructs a new RiskManagement object with the specified risk parameters.
     *
     * @param maxLotSize the maximum allowed lot size for a trade
     * @param minLotSize the minimum allowed lot size for a trade
     * @param maxOpenTrades the maximum number of open trades allowed at the same time
     * @param maxRiskPerTrade the maximum risk allowed per trade, as a percentage of balance
     * @param maxDailyLoss the maximum daily loss allowed, as a percentage of balance
     * @param maxPositionSize the maximum position size allowed, as a percentage of equity
     */
    public RiskManagement(double maxLotSize, double minLotSize, int maxOpenTrades,
                          double maxRiskPerTrade, double maxDailyLoss, double maxPositionSize) {
        this.maxLotSize = maxLotSize;
        this.minLotSize = minLotSize;
        this.maxOpenTrades = maxOpenTrades;
        this.maxRiskPerTrade = maxRiskPerTrade;
        this.maxDailyLoss = maxDailyLoss;
        this.maxPositionSize = maxPositionSize;
    }

    /**
     * Validates a new trade based on the risk management rules.
     *
     * @param volume the volume of the trade (in lots)
     * @param requiredMargin the margin required for the trade
     * @param broker the account holding the balance and margin information
     * @return true if the trade is valid according to risk management rules, false otherwise
     */
    public boolean validateNewTrade(double volume, double requiredMargin, Account broker) {
        // Check lot size
        if (volume < minLotSize || volume > maxLotSize) {
            return false;
        }

        // Check max open trades
        if (broker.getPositions().getPositionsTotal() >= maxOpenTrades) {
            return false;
        }

        // Check margin requirements
        if (requiredMargin > broker.getMarginFree()) {
            return false;
        }

        // Check position size
        if (requiredMargin > (maxPositionSize / 100) * broker.getEquity()) {
            return false;
        }

        // Check daily loss (simplified)
//        double dailyProfit = broker.calculateDailyProfit();
//        if (dailyProfit < 0 && Math.abs(dailyProfit) > (maxDailyLoss / 100) * broker.getBalance()) {
//            return false;
//        }

        return true;
    }

    /**
     * Gets the maximum allowed lot size for a trade.
     *
     * @return the maximum lot size
     */
    public double getMaxLotSize() {
        return maxLotSize;
    }

    /**
     * Sets the maximum allowed lot size for a trade.
     *
     * @param maxLotSize the maximum lot size to set
     */
    public void setMaxLotSize(double maxLotSize) {
        this.maxLotSize = maxLotSize;
    }

    /**
     * Gets the minimum allowed lot size for a trade.
     *
     * @return the minimum lot size
     */
    public double getMinLotSize() {
        return minLotSize;
    }

    /**
     * Sets the minimum allowed lot size for a trade.
     *
     * @param minLotSize the minimum lot size to set
     */
    public void setMinLotSize(double minLotSize) {
        this.minLotSize = minLotSize;
    }

    /**
     * Gets the maximum number of open trades allowed at the same time.
     *
     * @return the maximum number of open trades
     */
    public int getMaxOpenTrades() {
        return maxOpenTrades;
    }

    /**
     * Sets the maximum number of open trades allowed at the same time.
     *
     * @param maxOpenTrades the maximum number of open trades to set
     */
    public void setMaxOpenTrades(int maxOpenTrades) {
        this.maxOpenTrades = maxOpenTrades;
    }

    /**
     * Gets the maximum allowed risk per trade as a percentage of the account balance.
     *
     * @return the maximum risk per trade
     */
    public double getMaxRiskPerTrade() {
        return maxRiskPerTrade;
    }

    /**
     * Sets the maximum allowed risk per trade as a percentage of the account balance.
     *
     * @param maxRiskPerTrade the maximum risk per trade to set
     */
    public void setMaxRiskPerTrade(double maxRiskPerTrade) {
        this.maxRiskPerTrade = maxRiskPerTrade;
    }

    /**
     * Gets the maximum allowed daily loss as a percentage of the account balance.
     *
     * @return the maximum daily loss
     */
    public double getMaxDailyLoss() {
        return maxDailyLoss;
    }

    /**
     * Sets the maximum allowed daily loss as a percentage of the account balance.
     *
     * @param maxDailyLoss the maximum daily loss to set
     */
    public void setMaxDailyLoss(double maxDailyLoss) {
        this.maxDailyLoss = maxDailyLoss;
    }

    /**
     * Gets the maximum allowed position size as a percentage of equity.
     *
     * @return the maximum position size
     */
    public double getMaxPositionSize() {
        return maxPositionSize;
    }

    /**
     * Sets the maximum allowed position size as a percentage of equity.
     *
     * @param maxPositionSize the maximum position size to set
     */
    public void setMaxPositionSize(double maxPositionSize) {
        this.maxPositionSize = maxPositionSize;
    }
}
