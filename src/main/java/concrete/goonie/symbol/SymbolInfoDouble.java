package concrete.goonie.symbol;

/**
 * Represents information related to a financial symbol, encapsulating various market data values.
 * This class holds multiple market-related properties such as bid, ask, last price, volume, and other
 * symbol-specific information for trading and analysis.
 */
class SymbolInfoDouble {

    private double bid;
    private double bidHigh;
    private double bidLow;
    private double ask;
    private double askHigh;
    private double askLow;
    private double last;
    private double lastHigh;
    private double lastLow;
    private double volumeReal;
    private double volumeHighReal;
    private double volumeLowReal;
    private double optionStrike;
    private double point;
    private double tradeTickValue;
    private double tradeTickValueProfit;
    private double tradeTickValueLoss;
    private double tradeTickSize;
    private double tradeContractSize;
    private double tradeAccruedInterest;
    private double tradeFaceValue;
    private double tradeLiquidityRate;
    private double volumeMin;
    private double volumeMax;
    private double volumeStep;
    private double volumeLimit;
    private double swapLong;
    private double swapShort;
    private double swapSunday;
    private double swapMonday;
    private double swapTuesday;
    private double swapWednesday;
    private double swapThursday;
    private double swapFriday;
    private double swapSaturday;
    private double marginInitial;
    private double marginMaintenance;
    private double marginHedged;
    private double sessionVolume;
    private double sessionTurnover;
    private double sessionInterest;
    private double sessionBuyOrdersVolume;
    private double sessionSellOrdersVolume;
    private double sessionOpen;
    private double sessionClose;
    private double sessionAW;
    private double sessionPriceSettlement;
    private double sessionPriceLimitMin;
    private double sessionPriceLimitMax;
    private double priceChange;
    private double priceVolatility;
    private double priceTheoretical;
    private double priceDelta;
    private double priceTheta;
    private double priceGamma;
    private double priceVega;
    private double priceRho;
    private double priceOmega;
    private double priceSensitivity;

    /**
     * Gets the current bid price.
     *
     * @return The bid price.
     */
    public double getBid() {
        return bid;
    }

    /**
     * Sets the bid price.
     *
     * @param bid The bid price to set.
     */
    public void setBid(double bid) {
        this.bid = bid;
    }

    /**
     * Gets the highest bid price.
     *
     * @return The highest bid price.
     */
    public double getBidHigh() {
        return bidHigh;
    }

    /**
     * Sets the highest bid price.
     *
     * @param bidHigh The highest bid price to set.
     */
    public void setBidHigh(double bidHigh) {
        this.bidHigh = bidHigh;
    }

    /**
     * Gets the lowest bid price.
     *
     * @return The lowest bid price.
     */
    public double getBidLow() {
        return bidLow;
    }

    /**
     * Sets the lowest bid price.
     *
     * @param bidLow The lowest bid price to set.
     */
    public void setBidLow(double bidLow) {
        this.bidLow = bidLow;
    }

    /**
     * Gets the current ask price.
     *
     * @return The ask price.
     */
    public double getAsk() {
        return ask;
    }

    /**
     * Sets the ask price.
     *
     * @param ask The ask price to set.
     */
    public void setAsk(double ask) {
        this.ask = ask;
    }

    /**
     * Gets the highest ask price.
     *
     * @return The highest ask price.
     */
    public double getAskHigh() {
        return askHigh;
    }

    /**
     * Sets the highest ask price.
     *
     * @param askHigh The highest ask price to set.
     */
    public void setAskHigh(double askHigh) {
        this.askHigh = askHigh;
    }

    /**
     * Gets the lowest ask price.
     *
     * @return The lowest ask price.
     */
    public double getAskLow() {
        return askLow;
    }

    /**
     * Sets the lowest ask price.
     *
     * @param askLow The lowest ask price to set.
     */
    public void setAskLow(double askLow) {
        this.askLow = askLow;
    }

    /**
     * Gets the last price.
     *
     * @return The last price.
     */
    public double getLast() {
        return last;
    }

    /**
     * Sets the last price.
     *
     * @param last The last price to set.
     */
    public void setLast(double last) {
        this.last = last;
    }

    /**
     * Gets the highest last price.
     *
     * @return The highest last price.
     */
    public double getLastHigh() {
        return lastHigh;
    }

    /**
     * Sets the highest last price.
     *
     * @param lastHigh The highest last price to set.
     */
    public void setLastHigh(double lastHigh) {
        this.lastHigh = lastHigh;
    }

    /**
     * Gets the lowest last price.
     *
     * @return The lowest last price.
     */
    public double getLastLow() {
        return lastLow;
    }

    /**
     * Sets the lowest last price.
     *
     * @param lastLow The lowest last price to set.
     */
    public void setLastLow(double lastLow) {
        this.lastLow = lastLow;
    }

    /**
     * Gets the real volume of the symbol.
     *
     * @return The real volume.
     */
    public double getVolumeReal() {
        return volumeReal;
    }

    /**
     * Sets the real volume of the symbol.
     *
     * @param volumeReal The real volume to set.
     */
    public void setVolumeReal(double volumeReal) {
        this.volumeReal = volumeReal;
    }
    /**
     * Gets the real volume high value.
     *
     * @return the volumeHighReal value.
     */
    public double getVolumeHighReal() {
        return volumeHighReal;
    }

    /**
     * Sets the real volume high value.
     *
     * @param volumeHighReal the volumeHighReal value to set.
     */
    public void setVolumeHighReal(double volumeHighReal) {
        this.volumeHighReal = volumeHighReal;
    }

    /**
     * Gets the real volume low value.
     *
     * @return the volumeLowReal value.
     */
    public double getVolumeLowReal() {
        return volumeLowReal;
    }

    /**
     * Sets the real volume low value.
     *
     * @param volumeLowReal the volumeLowReal value to set.
     */
    public void setVolumeLowReal(double volumeLowReal) {
        this.volumeLowReal = volumeLowReal;
    }

    /**
     * Gets the option strike value.
     *
     * @return the optionStrike value.
     */
    public double getOptionStrike() {
        return optionStrike;
    }

    /**
     * Sets the option strike value.
     *
     * @param optionStrike the optionStrike value to set.
     */
    public void setOptionStrike(double optionStrike) {
        this.optionStrike = optionStrike;
    }

    /**
     * Gets the point value.
     *
     * @return the point value.
     */
    public double getPoint() {
        return point;
    }

    /**
     * Sets the point value.
     *
     * @param point the point value to set.
     */
    public void setPoint(double point) {
        this.point = point;
    }

    /**
     * Gets the trade tick value.
     *
     * @return the tradeTickValue value.
     */
    public double getTradeTickValue() {
        return tradeTickValue;
    }

    /**
     * Sets the trade tick value.
     *
     * @param tradeTickValue the tradeTickValue value to set.
     */
    public void setTradeTickValue(double tradeTickValue) {
        this.tradeTickValue = tradeTickValue;
    }

    /**
     * Gets the trade tick value for profit.
     *
     * @return the tradeTickValueProfit value.
     */
    public double getTradeTickValueProfit() {
        return tradeTickValueProfit;
    }

    /**
     * Sets the trade tick value for profit.
     *
     * @param tradeTickValueProfit the tradeTickValueProfit value to set.
     */
    public void setTradeTickValueProfit(double tradeTickValueProfit) {
        this.tradeTickValueProfit = tradeTickValueProfit;
    }

    /**
     * Gets the trade tick value for loss.
     *
     * @return the tradeTickValueLoss value.
     */
    public double getTradeTickValueLoss() {
        return tradeTickValueLoss;
    }

    /**
     * Sets the trade tick value for loss.
     *
     * @param tradeTickValueLoss the tradeTickValueLoss value to set.
     */
    public void setTradeTickValueLoss(double tradeTickValueLoss) {
        this.tradeTickValueLoss = tradeTickValueLoss;
    }

    /**
     * Gets the trade tick size.
     *
     * @return the tradeTickSize value.
     */
    public double getTradeTickSize() {
        return tradeTickSize;
    }

    /**
     * Sets the trade tick size.
     *
     * @param tradeTickSize the tradeTickSize value to set.
     */
    public void setTradeTickSize(double tradeTickSize) {
        this.tradeTickSize = tradeTickSize;
    }

    /**
     * Gets the trade contract size.
     *
     * @return the tradeContractSize value.
     */
    public double getTradeContractSize() {
        return tradeContractSize;
    }

    /**
     * Sets the trade contract size.
     *
     * @param tradeContractSize the tradeContractSize value to set.
     */
    public void setTradeContractSize(double tradeContractSize) {
        this.tradeContractSize = tradeContractSize;
    }

    /**
     * Gets the trade accrued interest.
     *
     * @return the tradeAccruedInterest value.
     */
    public double getTradeAccruedInterest() {
        return tradeAccruedInterest;
    }

    /**
     * Sets the trade accrued interest.
     *
     * @param tradeAccruedInterest the tradeAccruedInterest value to set.
     */
    public void setTradeAccruedInterest(double tradeAccruedInterest) {
        this.tradeAccruedInterest = tradeAccruedInterest;
    }

    /**
     * Gets the trade face value.
     *
     * @return the tradeFaceValue value.
     */
    public double getTradeFaceValue() {
        return tradeFaceValue;
    }

    /**
     * Sets the trade face value.
     *
     * @param tradeFaceValue the tradeFaceValue value to set.
     */
    public void setTradeFaceValue(double tradeFaceValue) {
        this.tradeFaceValue = tradeFaceValue;
    }

    /**
     * Gets the trade liquidity rate.
     *
     * @return the tradeLiquidityRate value.
     */
    public double getTradeLiquidityRate() {
        return tradeLiquidityRate;
    }

    /**
     * Sets the trade liquidity rate.
     *
     * @param tradeLiquidityRate the tradeLiquidityRate value to set.
     */
    public void setTradeLiquidityRate(double tradeLiquidityRate) {
        this.tradeLiquidityRate = tradeLiquidityRate;
    }

    /**
     * Gets the minimum volume.
     *
     * @return the volumeMin value.
     */
    public double getVolumeMin() {
        return volumeMin;
    }

    /**
     * Sets the minimum volume.
     *
     * @param volumeMin the volumeMin value to set.
     */
    public void setVolumeMin(double volumeMin) {
        this.volumeMin = volumeMin;
    }

    /**
     * Gets the maximum volume.
     *
     * @return the volumeMax value.
     */
    public double getVolumeMax() {
        return volumeMax;
    }

    /**
     * Sets the maximum volume.
     *
     * @param volumeMax the volumeMax value to set.
     */
    public void setVolumeMax(double volumeMax) {
        this.volumeMax = volumeMax;
    }

    /**
     * Gets the volume step value.
     *
     * @return the volumeStep value.
     */
    public double getVolumeStep() {
        return volumeStep;
    }

    /**
     * Sets the volume step value.
     *
     * @param volumeStep the volumeStep value to set.
     */
    public void setVolumeStep(double volumeStep) {
        this.volumeStep = volumeStep;
    }

    /**
     * Gets the volume limit.
     *
     * @return the volumeLimit value.
     */
    public double getVolumeLimit() {
        return volumeLimit;
    }

    /**
     * Sets the volume limit.
     *
     * @param volumeLimit the volumeLimit value to set.
     */
    public void setVolumeLimit(double volumeLimit) {
        this.volumeLimit = volumeLimit;
    }

    /**
     * Gets the swap long value.
     *
     * @return the swapLong value.
     */
    public double getSwapLong() {
        return swapLong;
    }

    /**
     * Sets the swap long value.
     *
     * @param swapLong the swapLong value to set.
     */
    public void setSwapLong(double swapLong) {
        this.swapLong = swapLong;
    }

    /**
     * Gets the swap short value.
     *
     * @return the swapShort value.
     */
    public double getSwapShort() {
        return swapShort;
    }

    /**
     * Sets the swap short value.
     *
     * @param swapShort the swapShort value to set.
     */
    public void setSwapShort(double swapShort) {
        this.swapShort = swapShort;
    }

    /**
     * Gets the swap Sunday value.
     *
     * @return the swapSunday value.
     */
    public double getSwapSunday() {
        return swapSunday;
    }

    /**
     * Sets the swap Sunday value.
     *
     * @param swapSunday the swapSunday value to set.
     */
    public void setSwapSunday(double swapSunday) {
        this.swapSunday = swapSunday;
    }

    /**
     * Gets the swap Monday value.
     *
     * @return the swapMonday value.
     */
    public double getSwapMonday() {
        return swapMonday;
    }

    /**
     * Sets the swap Monday value.
     *
     * @param swapMonday the swapMonday value to set.
     */
    public void setSwapMonday(double swapMonday) {
        this.swapMonday = swapMonday;
    }

    /**
     * Gets the swap Tuesday value.
     *
     * @return the swapTuesday value.
     */
    public double getSwapTuesday() {
        return swapTuesday;
    }

    /**
     * Sets the swap Tuesday value.
     *
     * @param swapTuesday the swapTuesday value to set.
     */
    public void setSwapTuesday(double swapTuesday) {
        this.swapTuesday = swapTuesday;
    }

    /**
     * Gets the swap Wednesday value.
     *
     * @return the swapWednesday value.
     */
    public double getSwapWednesday() {
        return swapWednesday;
    }

    /**
     * Sets the swap Wednesday value.
     *
     * @param swapWednesday the swapWednesday value to set.
     */
    public void setSwapWednesday(double swapWednesday) {
        this.swapWednesday = swapWednesday;
    }

    /**
     * Gets the swap Thursday value.
     *
     * @return the swapThursday value.
     */
    public double getSwapThursday() {
        return swapThursday;
    }

    /**
     * Sets the swap Thursday value.
     *
     * @param swapThursday the swapThursday value to set.
     */
    public void setSwapThursday(double swapThursday) {
        this.swapThursday = swapThursday;
    }

    /**
     * Gets the swap Friday value.
     *
     * @return the swapFriday value.
     */
    public double getSwapFriday() {
        return swapFriday;
    }

    /**
     * Sets the swap Friday value.
     *
     * @param swapFriday the swapFriday value to set.
     */
    public void setSwapFriday(double swapFriday) {
        this.swapFriday = swapFriday;
    }

    /**
     * Gets the swap Saturday value.
     *
     * @return the swapSaturday value.
     */
    public double getSwapSaturday() {
        return swapSaturday;
    }

    /**
     * Sets the swap Saturday value.
     *
     * @param swapSaturday the swapSaturday value to set.
     */
    public void setSwapSaturday(double swapSaturday) {
        this.swapSaturday = swapSaturday;
    }

    /**
     * Gets the initial margin.
     *
     * @return the marginInitial value.
     */
    public double getMarginInitial() {
        return marginInitial;
    }

    /**
     * Sets the initial margin.
     *
     * @param marginInitial the marginInitial value to set.
     */
    public void setMarginInitial(double marginInitial) {
        this.marginInitial = marginInitial;
    }

    /**
     * Gets the maintenance margin.
     *
     * @return the marginMaintenance value.
     */
    public double getMarginMaintenance() {
        return marginMaintenance;
    }

    /**
     * Sets the maintenance margin.
     *
     * @param marginMaintenance the marginMaintenance value to set.
     */
    public void setMarginMaintenance(double marginMaintenance) {
        this.marginMaintenance = marginMaintenance;
    }

    /**
     * Gets the hedged margin.
     *
     * @return the marginHedged value.
     */
    public double getMarginHedged() {
        return marginHedged;
    }

    /**
     * Sets the hedged margin.
     *
     * @param marginHedged the marginHedged value to set.
     */
    public void setMarginHedged(double marginHedged) {
        this.marginHedged = marginHedged;
    }

    /**
     * Gets the session volume.
     *
     * @return the sessionVolume value.
     */
    public double getSessionVolume() {
        return sessionVolume;
    }

    /**
     * Sets the session volume.
     *
     * @param sessionVolume the sessionVolume value to set.
     */
    public void setSessionVolume(double sessionVolume) {
        this.sessionVolume = sessionVolume;
    }

    /**
     * Gets the session turnover.
     *
     * @return the sessionTurnover value.
     */
    public double getSessionTurnover() {
        return sessionTurnover;
    }

    /**
     * Sets the session turnover.
     *
     * @param sessionTurnover the sessionTurnover value to set.
     */
    public void setSessionTurnover(double sessionTurnover) {
        this.sessionTurnover = sessionTurnover;
    }

    /**
     * Gets the session interest.
     *
     * @return the sessionInterest value.
     */
    public double getSessionInterest() {
        return sessionInterest;
    }

    /**
     * Sets the session interest.
     *
     * @param sessionInterest the sessionInterest value to set.
     */
    public void setSessionInterest(double sessionInterest) {
        this.sessionInterest = sessionInterest;
    }

    /**
     * Gets the session buy orders volume.
     *
     * @return the sessionBuyOrdersVolume value.
     */
    public double getSessionBuyOrdersVolume() {
        return sessionBuyOrdersVolume;
    }

    /**
     * Sets the session buy orders volume.
     *
     * @param sessionBuyOrdersVolume the sessionBuyOrdersVolume value to set.
     */
    public void setSessionBuyOrdersVolume(double sessionBuyOrdersVolume) {
        this.sessionBuyOrdersVolume = sessionBuyOrdersVolume;
    }

    /**
     * Gets the session sell orders volume.
     *
     * @return the sessionSellOrdersVolume value.
     */
    public double getSessionSellOrdersVolume() {
        return sessionSellOrdersVolume;
    }

    /**
     * Sets the session sell orders volume.
     *
     * @param sessionSellOrdersVolume the sessionSellOrdersVolume value to set.
     */
    public void setSessionSellOrdersVolume(double sessionSellOrdersVolume) {
        this.sessionSellOrdersVolume = sessionSellOrdersVolume;
    }

    /**
     * Gets the session open price.
     *
     * @return the sessionOpen value.
     */
    public double getSessionOpen() {
        return sessionOpen;
    }

    /**
     * Sets the session open price.
     *
     * @param sessionOpen the sessionOpen value to set.
     */
    public void setSessionOpen(double sessionOpen) {
        this.sessionOpen = sessionOpen;
    }

    /**
     * Gets the session close price.
     *
     * @return the sessionClose value.
     */
    public double getSessionClose() {
        return sessionClose;
    }

    /**
     * Sets the session close price.
     *
     * @param sessionClose the sessionClose value to set.
     */
    public void setSessionClose(double sessionClose) {
        this.sessionClose = sessionClose;
    }

    /**
     * Gets the session average weight.
     *
     * @return the sessionAW value.
     */
    public double getSessionAW() {
        return sessionAW;
    }

    /**
     * Sets the session average weight.
     *
     * @param sessionAW the sessionAW value to set.
     */
    public void setSessionAW(double sessionAW) {
        this.sessionAW = sessionAW;
    }

    /**
     * Gets the session price settlement.
     *
     * @return the sessionPriceSettlement value.
     */
    public double getSessionPriceSettlement() {
        return sessionPriceSettlement;
    }

    /**
     * Sets the session price settlement.
     *
     * @param sessionPriceSettlement the sessionPriceSettlement value to set.
     */
    public void setSessionPriceSettlement(double sessionPriceSettlement) {
        this.sessionPriceSettlement = sessionPriceSettlement;
    }

    /**
     * Gets the session minimum price limit.
     *
     * @return the sessionPriceLimitMin value.
     */
    public double getSessionPriceLimitMin() {
        return sessionPriceLimitMin;
    }

    /**
     * Sets the session minimum price limit.
     *
     * @param sessionPriceLimitMin the sessionPriceLimitMin value to set.
     */
    public void setSessionPriceLimitMin(double sessionPriceLimitMin) {
        this.sessionPriceLimitMin = sessionPriceLimitMin;
    }

    /**
     * Gets the session maximum price limit.
     *
     * @return the sessionPriceLimitMax value.
     */
    public double getSessionPriceLimitMax() {
        return sessionPriceLimitMax;
    }

    /**
     * Sets the session maximum price limit.
     *
     * @param sessionPriceLimitMax the sessionPriceLimitMax value to set.
     */
    public void setSessionPriceLimitMax(double sessionPriceLimitMax) {
        this.sessionPriceLimitMax = sessionPriceLimitMax;
    }

    /**
     * Gets the price change value.
     *
     * @return the priceChange value.
     */
    public double getPriceChange() {
        return priceChange;
    }

    /**
     * Sets the price change value.
     *
     * @param priceChange the priceChange value to set.
     */
    public void setPriceChange(double priceChange) {
        this.priceChange = priceChange;
    }

    /**
     * Gets the price volatility value.
     *
     * @return the priceVolatility value.
     */
    public double getPriceVolatility() {
        return priceVolatility;
    }

    /**
     * Sets the price volatility value.
     *
     * @param priceVolatility the priceVolatility value to set.
     */
    public void setPriceVolatility(double priceVolatility) {
        this.priceVolatility = priceVolatility;
    }

    /**
     * Gets the theoretical price value.
     *
     * @return the priceTheoretical value.
     */
    public double getPriceTheoretical() {
        return priceTheoretical;
    }

    /**
     * Sets the theoretical price value.
     *
     * @param priceTheoretical the priceTheoretical value to set.
     */
    public void setPriceTheoretical(double priceTheoretical) {
        this.priceTheoretical = priceTheoretical;
    }

    /**
     * Gets the price delta value.
     *
     * @return the priceDelta value.
     */
    public double getPriceDelta() {
        return priceDelta;
    }

    /**
     * Sets the price delta value.
     *
     * @param priceDelta the priceDelta value to set.
     */
    public void setPriceDelta(double priceDelta) {
        this.priceDelta = priceDelta;
    }

    /**
     * Gets the price theta value.
     *
     * @return the priceTheta value.
     */
    public double getPriceTheta() {
        return priceTheta;
    }

    /**
     * Sets the price theta value.
     *
     * @param priceTheta the priceTheta value to set.
     */
    public void setPriceTheta(double priceTheta) {
        this.priceTheta = priceTheta;
    }
    /**
     * Gets the gamma value associated with the price.
     * Gamma is a measure of the rate of change of the option's delta relative to changes in the underlying asset's price.
     *
     * @return the priceGamma value
     */
    public double getPriceGamma() {
        return priceGamma;
    }

    /**
     * Sets the gamma value associated with the price.
     *
     * @param priceGamma the priceGamma value to set
     */
    public void setPriceGamma(double priceGamma) {
        this.priceGamma = priceGamma;
    }

    /**
     * Gets the vega value associated with the price.
     * Vega represents the sensitivity of the option's price to changes in volatility of the underlying asset.
     *
     * @return the priceVega value
     */
    public double getPriceVega() {
        return priceVega;
    }

    /**
     * Sets the vega value associated with the price.
     *
     * @param priceVega the priceVega value to set
     */
    public void setPriceVega(double priceVega) {
        this.priceVega = priceVega;
    }

    /**
     * Gets the rho value associated with the price.
     * Rho measures the sensitivity of the option's price to changes in interest rates.
     *
     * @return the priceRho value
     */
    public double getPriceRho() {
        return priceRho;
    }

    /**
     * Sets the rho value associated with the price.
     *
     * @param priceRho the priceRho value to set
     */
    public void setPriceRho(double priceRho) {
        this.priceRho = priceRho;
    }

    /**
     * Gets the omega value associated with the price.
     * Omega measures the sensitivity of the option's price to changes in the underlying asset's price.
     * It is often used to describe the magnitude of an option's leverage.
     *
     * @return the priceOmega value
     */
    public double getPriceOmega() {
        return priceOmega;
    }

    /**
     * Sets the omega value associated with the price.
     *
     * @param priceOmega the priceOmega value to set
     */
    public void setPriceOmega(double priceOmega) {
        this.priceOmega = priceOmega;
    }

    /**
     * Gets the price sensitivity value.
     * Price sensitivity refers to the change in the price of an option or asset with respect to small changes in the underlying price or other factors.
     *
     * @return the priceSensitivity value
     */
    public double getPriceSensitivity() {
        return priceSensitivity;
    }

    /**
     * Sets the price sensitivity value.
     *
     * @param priceSensitivity the priceSensitivity value to set
     */
    public void setPriceSensitivity(double priceSensitivity) {
        this.priceSensitivity = priceSensitivity;
    }


    @Override
     public String toString() {
         return "SymbolInfoDouble{\n" +
                 "bid=" + bid +"\n" +
                 ", bidHigh=" + bidHigh +"\n" +
                 ", bidLow=" + bidLow +"\n" +
                 ", ask=" + ask +"\n" +
                 ", askHigh=" + askHigh+"\n" +
                 ", askLow=" + askLow +"\n" +
                 ", last=" + last +"\n" +
                 ", lastHigh=" + lastHigh +"\n" +
                 ", lastLow=" + lastLow +"\n" +
                 ", volumeReal=" + volumeReal +"\n" +
                 ", volumeHighReal=" + volumeHighReal +"\n" +
                 ", volumeLowReal=" + volumeLowReal +"\n" +
                 ", optionStrike=" + optionStrike +"\n" +
                 ", point=" + point +"\n" +
                 ", tradeTickValue=" + tradeTickValue +"\n" +
                 ", tradeTickValueProfit=" + tradeTickValueProfit +"\n" +
                 ", tradeTickValueLoss=" + tradeTickValueLoss +"\n" +
                 ", tradeTickSize=" + tradeTickSize +"\n" +
                 ", tradeContractSize=" + tradeContractSize +"\n" +
                 ", tradeAccruedInterest=" + tradeAccruedInterest +"\n" +
                 ", tradeFaceValue=" + tradeFaceValue +"\n" +
                 ", tradeLiquidityRate=" + tradeLiquidityRate +"\n" +
                 ", volumeMin=" + volumeMin +"\n" +
                 ", volumeMax=" + volumeMax +"\n" +
                 ", volumeStep=" + volumeStep +"\n" +
                 ", volumeLimit=" + volumeLimit +"\n" +
                 ", swapLong=" + swapLong +"\n" +
                 ", swapShort=" + swapShort +"\n" +
                 ", swapSunday=" + swapSunday +"\n" +
                 ", swapMonday=" + swapMonday +"\n" +
                 ", swapTuesday=" + swapTuesday +"\n" +
                 ", swapWednesday=" + swapWednesday +"\n" +
                 ", swapThursday=" + swapThursday +"\n" +
                 ", swapFriday=" + swapFriday +"\n" +
                 ", swapSaturday=" + swapSaturday +"\n" +
                 ", marginInitial=" + marginInitial +"\n" +
                 ", marginMaintenance=" + marginMaintenance +"\n" +
                 ", sessionVolume=" + sessionVolume +"\n" +
                 ", sessionTurnover=" + sessionTurnover +"\n" +
                 ", sessionInterest=" + sessionInterest +"\n" +
                 ", sessionBuyOrdersVolume=" + sessionBuyOrdersVolume +"\n" +
                 ", sessionSellOrdersVolume=" + sessionSellOrdersVolume +"\n" +
                 ", sessionOpen=" + sessionOpen +"\n" +
                 ", sessionClose=" + sessionClose +"\n" +
                 ", sessionAW=" + sessionAW +"\n" +
                 ", sessionPriceSettlement=" + sessionPriceSettlement +"\n" +
                 ", sessionPriceLimitMin=" + sessionPriceLimitMin +"\n" +
                 ", sessionPriceLimitMax=" + sessionPriceLimitMax +"\n" +
                 ", priceChange=" + priceChange +"\n" +
                 ", priceVolatility=" + priceVolatility +"\n" +
                 ", priceTheoretical=" + priceTheoretical +"\n" +
                 ", priceDelta=" + priceDelta +"\n" +
                 ", priceTheta=" + priceTheta +"\n" +
                 ", priceGamma=" + priceGamma +"\n" +
                 ", priceVega=" + priceVega +"\n" +
                 ", priceRho=" + priceRho +"\n" +
                 ", priceOmega=" + priceOmega +"\n" +
                 ", priceSensitivity=" + priceSensitivity +"\n" +
                 '}';
     }
}
