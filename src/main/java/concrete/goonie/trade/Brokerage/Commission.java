package concrete.goonie.trade.Brokerage;

/**
 * The Commission class calculates the commission for a trade based on various factors such as per lot,
 * per trade fee, percentage of trade value, and a minimum commission threshold.
 */
class Commission {

    private double perLot;          // Commission charged per lot traded
    private double perTrade;        // Fixed commission per trade
    private double percentOfTrade;  // Percentage commission based on the trade value
    private double minCommission;   // Minimum commission amount

    /**
     * Constructs a new Commission instance with the specified commission parameters.
     *
     * @param perLot the commission per lot traded
     * @param perTrade the fixed commission per trade
     * @param percentOfTrade the commission percentage of the trade value
     * @param minCommission the minimum commission value to be applied
     */
    public Commission(double perLot, double perTrade, double percentOfTrade, double minCommission) {
        this.perLot = perLot;
        this.perTrade = perTrade;
        this.percentOfTrade = percentOfTrade;
        this.minCommission = minCommission;
    }

    /**
     * Calculates the total commission for a trade based on the given volume and trade value.
     * The commission is computed by considering the commission per lot, per trade, and a percentage of the trade value.
     * If the calculated commission is less than the minimum commission, the minimum commission will be applied.
     *
     * @param volume the number of lots traded
     * @param tradeValue the total value of the trade
     * @return the calculated commission for the trade
     */
    public double calculateCommission(double volume, double tradeValue) {
        double commission = 0;

        // Add commission based on volume and perLot
        commission += volume * perLot;

        // Add fixed commission per trade
        commission += perTrade;

        // Add commission as a percentage of the trade value
        commission += tradeValue * percentOfTrade / 100;

        // Return the maximum of calculated commission or minimum commission
        return Math.max(commission, minCommission);
    }
}
