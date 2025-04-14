package concrete.goonie.symbol;

class SymbolInfoInteger {

    // Fields to store the property values
    private int subscriptionDelay;
    private int sector;
    private int industry;
    private long sessionDeals;
    private long sessionBuyOrders;
    private long sessionSellOrders;
    private long volume;
    private long volumeHigh;
    private long volumeLow;
    private int digits;
    private int spread;
    private int ticksBookDepth;
    private int tradeCalcMode;
    private int tradeMode;
    private int tradeStopsLevel;
    private int tradeFreezeLevel;
    private int tradeExeMode;
    private int swapMode;
    private int swapRollover3Days;
    private boolean marginHedgedUseLeg;
    private int expirationMode;
    private int fillingMode;
    private int orderMode;
    private int orderGtcMode;
    private int optionMode;
    private int optionRight;

    public int getSubscriptionDelay() {
        return subscriptionDelay;
    }

    public void setSubscriptionDelay(int subscriptionDelay) {
        this.subscriptionDelay = subscriptionDelay;
    }

    public int getSector() {
        return sector;
    }

    public void setSector(int sector) {
        this.sector = sector;
    }

    public int getIndustry() {
        return industry;
    }

    public void setIndustry(int industry) {
        this.industry = industry;
    }

    public long getSessionDeals() {
        return sessionDeals;
    }

    public void setSessionDeals(long sessionDeals) {
        this.sessionDeals = sessionDeals;
    }

    public long getSessionBuyOrders() {
        return sessionBuyOrders;
    }

    public void setSessionBuyOrders(long sessionBuyOrders) {
        this.sessionBuyOrders = sessionBuyOrders;
    }

    public long getSessionSellOrders() {
        return sessionSellOrders;
    }

    public void setSessionSellOrders(long sessionSellOrders) {
        this.sessionSellOrders = sessionSellOrders;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public long getVolumeHigh() {
        return volumeHigh;
    }

    public void setVolumeHigh(long volumeHigh) {
        this.volumeHigh = volumeHigh;
    }

    public long getVolumeLow() {
        return volumeLow;
    }

    public void setVolumeLow(long volumeLow) {
        this.volumeLow = volumeLow;
    }

    public int getDigits() {
        return digits;
    }

    public void setDigits(int digits) {
        this.digits = digits;
    }

    public int getSpread() {
        return spread;
    }

    public void setSpread(int spread) {
        this.spread = spread;
    }

    public int getTicksBookDepth() {
        return ticksBookDepth;
    }

    public void setTicksBookDepth(int ticksBookDepth) {
        this.ticksBookDepth = ticksBookDepth;
    }

    public int getTradeCalcMode() {
        return tradeCalcMode;
    }

    public void setTradeCalcMode(int tradeCalcMode) {
        this.tradeCalcMode = tradeCalcMode;
    }

    public int getTradeMode() {
        return tradeMode;
    }

    public void setTradeMode(int tradeMode) {
        this.tradeMode = tradeMode;
    }

    public int getTradeStopsLevel() {
        return tradeStopsLevel;
    }

    public void setTradeStopsLevel(int tradeStopsLevel) {
        this.tradeStopsLevel = tradeStopsLevel;
    }

    public int getTradeFreezeLevel() {
        return tradeFreezeLevel;
    }

    public void setTradeFreezeLevel(int tradeFreezeLevel) {
        this.tradeFreezeLevel = tradeFreezeLevel;
    }

    public int getTradeExeMode() {
        return tradeExeMode;
    }

    public void setTradeExeMode(int tradeExeMode) {
        this.tradeExeMode = tradeExeMode;
    }

    public int getSwapMode() {
        return swapMode;
    }

    public void setSwapMode(int swapMode) {
        this.swapMode = swapMode;
    }

    public int getSwapRollover3Days() {
        return swapRollover3Days;
    }

    public void setSwapRollover3Days(int swapRollover3Days) {
        this.swapRollover3Days = swapRollover3Days;
    }

    public boolean isMarginHedgedUseLeg() {
        return marginHedgedUseLeg;
    }

    public void setMarginHedgedUseLeg(boolean marginHedgedUseLeg) {
        this.marginHedgedUseLeg = marginHedgedUseLeg;
    }

    public int getExpirationMode() {
        return expirationMode;
    }

    public void setExpirationMode(int expirationMode) {
        this.expirationMode = expirationMode;
    }

    public int getFillingMode() {
        return fillingMode;
    }

    public void setFillingMode(int fillingMode) {
        this.fillingMode = fillingMode;
    }

    public int getOrderMode() {
        return orderMode;
    }

    public void setOrderMode(int orderMode) {
        this.orderMode = orderMode;
    }

    public int getOrderGtcMode() {
        return orderGtcMode;
    }

    public void setOrderGtcMode(int orderGtcMode) {
        this.orderGtcMode = orderGtcMode;
    }

    public int getOptionMode() {
        return optionMode;
    }

    public void setOptionMode(int optionMode) {
        this.optionMode = optionMode;
    }

    public int getOptionRight() {
        return optionRight;
    }

    public void setOptionRight(int optionRight) {
        this.optionRight = optionRight;
    }

    @Override
    public String toString() {
        return "Symbol Information:\n" +
                "Subscription Delay: " + subscriptionDelay + "\n" +
                "Sector: " + sector + "\n" +
                "Industry: " + industry + "\n" +
                "Session Deals: " + sessionDeals + "\n" +
                "Session Buy Orders: " + sessionBuyOrders + "\n" +
                "Session Sell Orders: " + sessionSellOrders + "\n" +
                "Volume: " + volume + "\n" +
                "Volume High: " + volumeHigh + "\n" +
                "Volume Low: " + volumeLow + "\n" +
                "Digits: " + digits + "\n" +
                "Spread: " + spread + "\n" +
                "Ticks Book Depth: " + ticksBookDepth + "\n" +
                "Trade Calculation Mode: " + tradeCalcMode + "\n" +
                "Trade Mode: " + tradeMode + "\n" +
                "Trade Stops Level: " + tradeStopsLevel + "\n" +
                "Trade Freeze Level: " + tradeFreezeLevel + "\n" +
                "Trade Execution Mode: " + tradeExeMode + "\n" +
                "Swap Mode: " + swapMode + "\n" +
                "Swap Rollover 3 Days: " + swapRollover3Days + "\n" +
                "Margin Hedged Use Leg: " + marginHedgedUseLeg + "\n" +
                "Expiration Mode: " + expirationMode + "\n" +
                "Filling Mode: " + fillingMode + "\n" +
                "Order Mode: " + orderMode + "\n" +
                "Order GTC Mode: " + orderGtcMode + "\n" +
                "Option Mode: " + optionMode + "\n" +
                "Option Right: " + optionRight;
    }
}
