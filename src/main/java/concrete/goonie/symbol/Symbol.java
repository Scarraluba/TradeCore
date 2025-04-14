package concrete.goonie.symbol;

import concrete.goonie.enums.ENUM_TIMEFRAME;

/**
 * The Symbol class represents a financial symbol (such as a trading pair) and its associated timeframes.
 * It encapsulates various pieces of symbol-related information such as period frames, symbol-specific values (e.g.,
 * SymbolInfoDouble, SymbolInfoInteger, and SymbolInfoString) for managing data related to the symbol.
 */
public class Symbol {

    private ENUM_TIMEFRAME periodFrames;  // Timeframe for the symbol
    private final SymbolInfoDouble symbolInfoDouble = new SymbolInfoDouble(); // Symbol information (double type)
    private final SymbolInfoInteger symbolInfoInteger = new SymbolInfoInteger(); // Symbol information (integer type)
    private final SymbolInfoString symbolInfoString = new SymbolInfoString(); // Symbol information (string type)

    /**
     * Constructs a new Symbol instance with the specified period frame.
     *
     * @param periodFrames the timeframe (period) for the symbol, such as 1 minute, 5 minutes, 1 hour, etc.
     */
    public Symbol(ENUM_TIMEFRAME periodFrames) {
        this.periodFrames = periodFrames;
    }

    // Timeframe methods

    /**
     * Gets the period frame (timeframe) associated with this symbol.
     *
     * @return the ENUM_TIMEFRAME representing the symbol's period
     */
    public ENUM_TIMEFRAME getPeriodFrames() {
        return periodFrames;
    }

    /**
     * Sets the period frame (timeframe) for this symbol.
     *
     * @param periodFrames the ENUM_TIMEFRAME to set for the symbol
     */
    public void setPeriodFrames(ENUM_TIMEFRAME periodFrames) {
        this.periodFrames = periodFrames;
    }

// SymbolInfoDouble delegates
    public double getBid() {
        return symbolInfoDouble.getBid();
    }

    public void setBid(double bid) {
        symbolInfoDouble.setBid(bid);
    }

    public double getBidHigh() {
        return symbolInfoDouble.getBidHigh();
    }

    public void setBidHigh(double bidHigh) {
        symbolInfoDouble.setBidHigh(bidHigh);
    }

    public double getBidLow() {
        return symbolInfoDouble.getBidLow();
    }

    public void setBidLow(double bidLow) {
        symbolInfoDouble.setBidLow(bidLow);
    }

    public double getAsk() {
        return symbolInfoDouble.getAsk();
    }

    public void setAsk(double ask) {
        symbolInfoDouble.setAsk(ask);
    }

    public double getAskHigh() {
        return symbolInfoDouble.getAskHigh();
    }

    public void setAskHigh(double askHigh) {
        symbolInfoDouble.setAskHigh(askHigh);
    }

    public double getAskLow() {
        return symbolInfoDouble.getAskLow();
    }

    public void setAskLow(double askLow) {
        symbolInfoDouble.setAskLow(askLow);
    }

    public double getLast() {
        return symbolInfoDouble.getLast();
    }

    public void setLast(double last) {
        symbolInfoDouble.setLast(last);
    }

    public double getLastHigh() {
        return symbolInfoDouble.getLastHigh();
    }

    public void setLastHigh(double lastHigh) {
        symbolInfoDouble.setLastHigh(lastHigh);
    }

    public double getLastLow() {
        return symbolInfoDouble.getLastLow();
    }

    public void setLastLow(double lastLow) {
        symbolInfoDouble.setLastLow(lastLow);
    }

    public double getVolumeReal() {
        return symbolInfoDouble.getVolumeReal();
    }

    public void setVolumeReal(double volumeReal) {
        symbolInfoDouble.setVolumeReal(volumeReal);
    }

    public double getVolumeHighReal() {
        return symbolInfoDouble.getVolumeHighReal();
    }

    public void setVolumeHighReal(double volumeHighReal) {
        symbolInfoDouble.setVolumeHighReal(volumeHighReal);
    }

    public double getVolumeLowReal() {
        return symbolInfoDouble.getVolumeLowReal();
    }

    public void setVolumeLowReal(double volumeLowReal) {
        symbolInfoDouble.setVolumeLowReal(volumeLowReal);
    }

    public double getOptionStrike() {
        return symbolInfoDouble.getOptionStrike();
    }

    public void setOptionStrike(double optionStrike) {
        symbolInfoDouble.setOptionStrike(optionStrike);
    }

    public double getPoint() {
        return symbolInfoDouble.getPoint();
    }

    public void setPoint(double point) {
        symbolInfoDouble.setPoint(point);
    }

    public double getTradeTickValue() {
        return symbolInfoDouble.getTradeTickValue();
    }

    public void setTradeTickValue(double tradeTickValue) {
        symbolInfoDouble.setTradeTickValue(tradeTickValue);
    }

    public double getTradeTickValueProfit() {
        return symbolInfoDouble.getTradeTickValueProfit();
    }

    public void setTradeTickValueProfit(double tradeTickValueProfit) {
        symbolInfoDouble.setTradeTickValueProfit(tradeTickValueProfit);
    }

    public double getTradeTickValueLoss() {
        return symbolInfoDouble.getTradeTickValueLoss();
    }

    public void setTradeTickValueLoss(double tradeTickValueLoss) {
        symbolInfoDouble.setTradeTickValueLoss(tradeTickValueLoss);
    }

    public double getTradeTickSize() {
        return symbolInfoDouble.getTradeTickSize();
    }

    public void setTradeTickSize(double tradeTickSize) {
        symbolInfoDouble.setTradeTickSize(tradeTickSize);
    }

    public double getTradeContractSize() {
        return symbolInfoDouble.getTradeContractSize();
    }

    public void setTradeContractSize(double tradeContractSize) {
        symbolInfoDouble.setTradeContractSize(tradeContractSize);
    }

    public double getTradeAccruedInterest() {
        return symbolInfoDouble.getTradeAccruedInterest();
    }

    public void setTradeAccruedInterest(double tradeAccruedInterest) {
        symbolInfoDouble.setTradeAccruedInterest(tradeAccruedInterest);
    }

    public double getTradeFaceValue() {
        return symbolInfoDouble.getTradeFaceValue();
    }

    public void setTradeFaceValue(double tradeFaceValue) {
        symbolInfoDouble.setTradeFaceValue(tradeFaceValue);
    }

    public double getTradeLiquidityRate() {
        return symbolInfoDouble.getTradeLiquidityRate();
    }

    public void setTradeLiquidityRate(double tradeLiquidityRate) {
        symbolInfoDouble.setTradeLiquidityRate(tradeLiquidityRate);
    }

    public double getVolumeMin() {
        return symbolInfoDouble.getVolumeMin();
    }

    public void setVolumeMin(double volumeMin) {
        symbolInfoDouble.setVolumeMin(volumeMin);
    }

    public double getVolumeMax() {
        return symbolInfoDouble.getVolumeMax();
    }

    public void setVolumeMax(double volumeMax) {
        symbolInfoDouble.setVolumeMax(volumeMax);
    }

    public double getVolumeStep() {
        return symbolInfoDouble.getVolumeStep();
    }

    public void setVolumeStep(double volumeStep) {
        symbolInfoDouble.setVolumeStep(volumeStep);
    }

    public double getVolumeLimit() {
        return symbolInfoDouble.getVolumeLimit();
    }

    public void setVolumeLimit(double volumeLimit) {
        symbolInfoDouble.setVolumeLimit(volumeLimit);
    }

    public double getSwapLong() {
        return symbolInfoDouble.getSwapLong();
    }

    public void setSwapLong(double swapLong) {
        symbolInfoDouble.setSwapLong(swapLong);
    }

    public double getSwapShort() {
        return symbolInfoDouble.getSwapShort();
    }

    public void setSwapShort(double swapShort) {
        symbolInfoDouble.setSwapShort(swapShort);
    }

    public double getSwapSunday() {
        return symbolInfoDouble.getSwapSunday();
    }

    public void setSwapSunday(double swapSunday) {
        symbolInfoDouble.setSwapSunday(swapSunday);
    }

    public double getSwapMonday() {
        return symbolInfoDouble.getSwapMonday();
    }

    public void setSwapMonday(double swapMonday) {
        symbolInfoDouble.setSwapMonday(swapMonday);
    }

    public double getSwapTuesday() {
        return symbolInfoDouble.getSwapTuesday();
    }

    public void setSwapTuesday(double swapTuesday) {
        symbolInfoDouble.setSwapTuesday(swapTuesday);
    }

    public double getSwapWednesday() {
        return symbolInfoDouble.getSwapWednesday();
    }

    public void setSwapWednesday(double swapWednesday) {
        symbolInfoDouble.setSwapWednesday(swapWednesday);
    }

    public double getSwapThursday() {
        return symbolInfoDouble.getSwapThursday();
    }

    public void setSwapThursday(double swapThursday) {
        symbolInfoDouble.setSwapThursday(swapThursday);
    }

    public double getSwapFriday() {
        return symbolInfoDouble.getSwapFriday();
    }

    public void setSwapFriday(double swapFriday) {
        symbolInfoDouble.setSwapFriday(swapFriday);
    }

    public double getSwapSaturday() {
        return symbolInfoDouble.getSwapSaturday();
    }

    public void setSwapSaturday(double swapSaturday) {
        symbolInfoDouble.setSwapSaturday(swapSaturday);
    }

    public double getMarginInitial() {
        return symbolInfoDouble.getMarginInitial();
    }

    public void setMarginInitial(double marginInitial) {
        symbolInfoDouble.setMarginInitial(marginInitial);
    }
    public double getMarginHedged() {
        return symbolInfoDouble.getMarginHedged();
    }

    public void setMarginHedged(double marginInitial) {
        symbolInfoDouble.setMarginHedged(marginInitial);
    }
    public double getMarginMaintenance() {
        return symbolInfoDouble.getMarginMaintenance();
    }

    public void setMarginMaintenance(double marginMaintenance) {
        symbolInfoDouble.setMarginMaintenance(marginMaintenance);
    }

    public double getSessionVolume() {
        return symbolInfoDouble.getSessionVolume();
    }

    public void setSessionVolume(double sessionVolume) {
        symbolInfoDouble.setSessionVolume(sessionVolume);
    }

    public double getSessionTurnover() {
        return symbolInfoDouble.getSessionTurnover();
    }

    public void setSessionTurnover(double sessionTurnover) {
        symbolInfoDouble.setSessionTurnover(sessionTurnover);
    }

    public double getSessionInterest() {
        return symbolInfoDouble.getSessionInterest();
    }

    public void setSessionInterest(double sessionInterest) {
        symbolInfoDouble.setSessionInterest(sessionInterest);
    }

    public double getSessionBuyOrdersVolume() {
        return symbolInfoDouble.getSessionBuyOrdersVolume();
    }

    public void setSessionBuyOrdersVolume(double sessionBuyOrdersVolume) {
        symbolInfoDouble.setSessionBuyOrdersVolume(sessionBuyOrdersVolume);
    }

    public double getSessionSellOrdersVolume() {
        return symbolInfoDouble.getSessionSellOrdersVolume();
    }

    public void setSessionSellOrdersVolume(double sessionSellOrdersVolume) {
        symbolInfoDouble.setSessionSellOrdersVolume(sessionSellOrdersVolume);
    }

    public double getSessionOpen() {
        return symbolInfoDouble.getSessionOpen();
    }

    public void setSessionOpen(double sessionOpen) {
        symbolInfoDouble.setSessionOpen(sessionOpen);
    }

    public double getSessionClose() {
        return symbolInfoDouble.getSessionClose();
    }

    public void setSessionClose(double sessionClose) {
        symbolInfoDouble.setSessionClose(sessionClose);
    }

    public double getSessionAW() {
        return symbolInfoDouble.getSessionAW();
    }

    public void setSessionAW(double sessionAW) {
        symbolInfoDouble.setSessionAW(sessionAW);
    }

    public double getSessionPriceSettlement() {
        return symbolInfoDouble.getSessionPriceSettlement();
    }

    public void setSessionPriceSettlement(double sessionPriceSettlement) {
        symbolInfoDouble.setSessionPriceSettlement(sessionPriceSettlement);
    }

    public double getSessionPriceLimitMin() {
        return symbolInfoDouble.getSessionPriceLimitMin();
    }

    public void setSessionPriceLimitMin(double sessionPriceLimitMin) {
        symbolInfoDouble.setSessionPriceLimitMin(sessionPriceLimitMin);
    }

    public double getSessionPriceLimitMax() {
        return symbolInfoDouble.getSessionPriceLimitMax();
    }

    public void setSessionPriceLimitMax(double sessionPriceLimitMax) {
        symbolInfoDouble.setSessionPriceLimitMax(sessionPriceLimitMax);
    }

    public double getPriceChange() {
        return symbolInfoDouble.getPriceChange();
    }

    public void setPriceChange(double priceChange) {
        symbolInfoDouble.setPriceChange(priceChange);
    }

    public double getPriceVolatility() {
        return symbolInfoDouble.getPriceVolatility();
    }

    public void setPriceVolatility(double priceVolatility) {
        symbolInfoDouble.setPriceVolatility(priceVolatility);
    }

    public double getPriceTheoretical() {
        return symbolInfoDouble.getPriceTheoretical();
    }

    public void setPriceTheoretical(double priceTheoretical) {
        symbolInfoDouble.setPriceTheoretical(priceTheoretical);
    }

    public double getPriceDelta() {
        return symbolInfoDouble.getPriceDelta();
    }

    public void setPriceDelta(double priceDelta) {
        symbolInfoDouble.setPriceDelta(priceDelta);
    }

    public double getPriceTheta() {
        return symbolInfoDouble.getPriceTheta();
    }

    public void setPriceTheta(double priceTheta) {
        symbolInfoDouble.setPriceTheta(priceTheta);
    }

    public double getPriceGamma() {
        return symbolInfoDouble.getPriceGamma();
    }

    public void setPriceGamma(double priceGamma) {
        symbolInfoDouble.setPriceGamma(priceGamma);
    }

    public double getPriceVega() {
        return symbolInfoDouble.getPriceVega();
    }

    public void setPriceVega(double priceVega) {
        symbolInfoDouble.setPriceVega(priceVega);
    }

    public double getPriceRho() {
        return symbolInfoDouble.getPriceRho();
    }

    public void setPriceRho(double priceRho) {
        symbolInfoDouble.setPriceRho(priceRho);
    }

    public double getPriceOmega() {
        return symbolInfoDouble.getPriceOmega();
    }

    public void setPriceOmega(double priceOmega) {
        symbolInfoDouble.setPriceOmega(priceOmega);
    }

    public double getPriceSensitivity() {
        return symbolInfoDouble.getPriceSensitivity();
    }

    public void setPriceSensitivity(double priceSensitivity) {
        symbolInfoDouble.setPriceSensitivity(priceSensitivity);
    }

    // SymbolInfoInteger delegates
    public int getSubscriptionDelay() {
        return symbolInfoInteger.getSubscriptionDelay();
    }

    public void setSubscriptionDelay(int subscriptionDelay) {
        symbolInfoInteger.setSubscriptionDelay(subscriptionDelay);
    }

    public int getSector() {
        return symbolInfoInteger.getSector();
    }

    public void setSector(int sector) {
        symbolInfoInteger.setSector(sector);
    }

    public int getIndustry() {
        return symbolInfoInteger.getIndustry();
    }

    public void setIndustry(int industry) {
        symbolInfoInteger.setIndustry(industry);
    }

    public long getSessionDeals() {
        return symbolInfoInteger.getSessionDeals();
    }

    public void setSessionDeals(long sessionDeals) {
        symbolInfoInteger.setSessionDeals(sessionDeals);
    }

    public long getSessionBuyOrders() {
        return symbolInfoInteger.getSessionBuyOrders();
    }

    public void setSessionBuyOrders(long sessionBuyOrders) {
        symbolInfoInteger.setSessionBuyOrders(sessionBuyOrders);
    }

    public long getSessionSellOrders() {
        return symbolInfoInteger.getSessionSellOrders();
    }

    public void setSessionSellOrders(long sessionSellOrders) {
        symbolInfoInteger.setSessionSellOrders(sessionSellOrders);
    }

    public long getVolume() {
        return symbolInfoInteger.getVolume();
    }

    public void setVolume(long volume) {
        symbolInfoInteger.setVolume(volume);
    }

    public long getVolumeHigh() {
        return symbolInfoInteger.getVolumeHigh();
    }

    public void setVolumeHigh(long volumeHigh) {
        symbolInfoInteger.setVolumeHigh(volumeHigh);
    }

    public long getVolumeLow() {
        return symbolInfoInteger.getVolumeLow();
    }

    public void setVolumeLow(long volumeLow) {
        symbolInfoInteger.setVolumeLow(volumeLow);
    }

    public int getDigits() {
        return symbolInfoInteger.getDigits();
    }

    public void setDigits(int digits) {
        symbolInfoInteger.setDigits(digits);
    }

    public int getSpread() {
        return (int) ((getAsk() - getBid()) / getPoint());
    }

    public void setSpread(int spread) {
        symbolInfoInteger.setSpread(spread);
    }

    public int getTicksBookDepth() {
        return symbolInfoInteger.getTicksBookDepth();
    }

    public void setTicksBookDepth(int ticksBookDepth) {
        symbolInfoInteger.setTicksBookDepth(ticksBookDepth);
    }

    public int getTradeCalcMode() {
        return symbolInfoInteger.getTradeCalcMode();
    }

    public void setTradeCalcMode(int tradeCalcMode) {
        symbolInfoInteger.setTradeCalcMode(tradeCalcMode);
    }

    public int getTradeMode() {
        return symbolInfoInteger.getTradeMode();
    }

    public void setTradeMode(int tradeMode) {
        symbolInfoInteger.setTradeMode(tradeMode);
    }

    public int getTradeStopsLevel() {
        return symbolInfoInteger.getTradeStopsLevel();
    }

    public void setTradeStopsLevel(int tradeStopsLevel) {
        symbolInfoInteger.setTradeStopsLevel(tradeStopsLevel);
    }

    public int getTradeFreezeLevel() {
        return symbolInfoInteger.getTradeFreezeLevel();
    }

    public void setTradeFreezeLevel(int tradeFreezeLevel) {
        symbolInfoInteger.setTradeFreezeLevel(tradeFreezeLevel);
    }

    public int getTradeExeMode() {
        return symbolInfoInteger.getTradeExeMode();
    }

    public void setTradeExeMode(int tradeExeMode) {
        symbolInfoInteger.setTradeExeMode(tradeExeMode);
    }

    public int getSwapMode() {
        return symbolInfoInteger.getSwapMode();
    }

    public void setSwapMode(int swapMode) {
        symbolInfoInteger.setSwapMode(swapMode);
    }

    public int getSwapRollover3Days() {
        return symbolInfoInteger.getSwapRollover3Days();
    }

    public void setSwapRollover3Days(int swapRollover3Days) {
        symbolInfoInteger.setSwapRollover3Days(swapRollover3Days);
    }

    public boolean isMarginHedgedUseLeg() {
        return symbolInfoInteger.isMarginHedgedUseLeg();
    }

    public void setMarginHedgedUseLeg(boolean marginHedgedUseLeg) {
        symbolInfoInteger.setMarginHedgedUseLeg(marginHedgedUseLeg);
    }

    public int getExpirationMode() {
        return symbolInfoInteger.getExpirationMode();
    }

    public void setExpirationMode(int expirationMode) {
        symbolInfoInteger.setExpirationMode(expirationMode);
    }

    public int getFillingMode() {
        return symbolInfoInteger.getFillingMode();
    }

    public void setFillingMode(int fillingMode) {
        symbolInfoInteger.setFillingMode(fillingMode);
    }

    public int getOrderMode() {
        return symbolInfoInteger.getOrderMode();
    }

    public void setOrderMode(int orderMode) {
        symbolInfoInteger.setOrderMode(orderMode);
    }

    public int getOrderGtcMode() {
        return symbolInfoInteger.getOrderGtcMode();
    }

    public void setOrderGtcMode(int orderGtcMode) {
        symbolInfoInteger.setOrderGtcMode(orderGtcMode);
    }

    public int getOptionMode() {
        return symbolInfoInteger.getOptionMode();
    }

    public void setOptionMode(int optionMode) {
        symbolInfoInteger.setOptionMode(optionMode);
    }

    public int getOptionRight() {
        return symbolInfoInteger.getOptionRight();
    }

    public void setOptionRight(int optionRight) {
        symbolInfoInteger.setOptionRight(optionRight);
    }

    // SymbolInfoString delegates
    public String getBasis() {
        return symbolInfoString.getBasis();
    }

    public void setBasis(String basis) {
        symbolInfoString.setBasis(basis);
    }

    public String getCategory() {
        return symbolInfoString.getCategory();
    }

    public void setCategory(String category) {
        symbolInfoString.setCategory(category);
    }

    public String getCountry() {
        return symbolInfoString.getCountry();
    }

    public void setCountry(String country) {
        symbolInfoString.setCountry(country);
    }

    public String getSectorName() {
        return symbolInfoString.getSectorName();
    }

    public void setSectorName(String sectorName) {
        symbolInfoString.setSectorName(sectorName);
    }

    public String getIndustryName() {
        return symbolInfoString.getIndustryName();
    }

    public void setIndustryName(String industryName) {
        symbolInfoString.setIndustryName(industryName);
    }

    public String getCurrencyBase() {
        return symbolInfoString.getCurrencyBase();
    }

    public void setCurrencyBase(String currencyBase) {
        symbolInfoString.setCurrencyBase(currencyBase);
    }

    public String getCurrencyProfit() {
        return symbolInfoString.getCurrencyProfit();
    }

    public void setCurrencyProfit(String currencyProfit) {
        symbolInfoString.setCurrencyProfit(currencyProfit);
    }

    public String getCurrencyMargin() {
        return symbolInfoString.getCurrencyMargin();
    }

    public void setCurrencyMargin(String currencyMargin) {
        symbolInfoString.setCurrencyMargin(currencyMargin);
    }

    public String getBank() {
        return symbolInfoString.getBank();
    }

    public void setBank(String bank) {
        symbolInfoString.setBank(bank);
    }

    public String getDescription() {
        return symbolInfoString.getDescription();
    }

    public void setDescription(String description) {
        symbolInfoString.setDescription(description);
    }

    public String getExchange() {
        return symbolInfoString.getExchange();
    }

    public void setExchange(String exchange) {
        symbolInfoString.setExchange(exchange);
    }

    public String getFormula() {
        return symbolInfoString.getFormula();
    }

    public void setFormula(String formula) {
        symbolInfoString.setFormula(formula);
    }

    public String getIsin() {
        return symbolInfoString.getIsin();
    }

    public void setIsin(String isin) {
        symbolInfoString.setIsin(isin);
    }

    public String getPage() {
        return symbolInfoString.getPage();
    }

    public void setPage(String page) {
        symbolInfoString.setPage(page);
    }

    public String getPath() {
        return symbolInfoString.getPath();
    }

    public void setPath(String path) {
        symbolInfoString.setPath(path);
    }

    public String getSymbolName() {
        return symbolInfoString.getName();
    }

    public void setSymbolName(String symbolName) {
        symbolInfoString.setName(symbolName);
    }

    public void updatePrices(double bid, double ask) {
        setAsk(ask);
        setBid(bid);
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "periodFrames=" + periodFrames +
                ", symbolInfoDouble=" + symbolInfoDouble +
                ", symbolInfoInteger=" + symbolInfoInteger +
                ", symbolInfoString=" + symbolInfoString +
                '}';
    }
}