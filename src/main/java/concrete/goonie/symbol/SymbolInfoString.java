package concrete.goonie.symbol;


class SymbolInfoString {

    private String basis;
    private String category;
    private String country;
    private String sectorName;
    private String industryName;
    private String currencyBase;
    private String currencyProfit;
    private String currencyMargin;
    private String bank;
    private String description;
    private String exchange;
    private String formula;
    private String isin;
    private String page;
    private String path;
    private String name;

    public String getBasis() {
        return basis;
    }

    public void setBasis(String basis) {
        this.basis = basis;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public String getCurrencyBase() {
        return currencyBase;
    }

    public void setCurrencyBase(String currencyBase) {
        this.currencyBase = currencyBase;
    }

    public String getCurrencyProfit() {
        return currencyProfit;
    }

    public void setCurrencyProfit(String currencyProfit) {
        this.currencyProfit = currencyProfit;
    }

    public String getCurrencyMargin() {
        return currencyMargin;
    }

    public void setCurrencyMargin(String currencyMargin) {
        this.currencyMargin = currencyMargin;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Symbol Information:\n" +
                "Basis: " + basis + "\n" +
                "Category: " + category + "\n" +
                "Country: " + country + "\n" +
                "Sector Name: " + sectorName + "\n" +
                "Industry Name: " + industryName + "\n" +
                "Currency Base: " + currencyBase + "\n" +
                "Currency Profit: " + currencyProfit + "\n" +
                "Currency Margin: " + currencyMargin + "\n" +
                "Bank: " + bank + "\n" +
                "Description: " + description + "\n" +
                "Exchange: " + exchange + "\n" +
                "Formula: " + formula + "\n" +
                "ISIN: " + isin + "\n" +
                "Page: " + page + "\n" +
                "Path: " + path;
    }
}
