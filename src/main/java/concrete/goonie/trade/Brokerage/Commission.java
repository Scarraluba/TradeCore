package concrete.goonie.trade.Brokerage;

class Commission {
        double perLot;
        double perTrade;
        double percentOfTrade;
        double minCommission;
        
        public Commission(double perLot, double perTrade, double percentOfTrade, double minCommission) {
            this.perLot = perLot;
            this.perTrade = perTrade;
            this.percentOfTrade = percentOfTrade;
            this.minCommission = minCommission;
        }
        
        public double calculateCommission(double volume, double tradeValue) {
            double commission = 0;
            commission += volume * perLot;
            commission += perTrade;
            commission += tradeValue * percentOfTrade / 100;
            return Math.max(commission, minCommission);
        }
    }