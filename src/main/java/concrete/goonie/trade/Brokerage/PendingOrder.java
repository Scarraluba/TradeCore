package concrete.goonie.trade.Brokerage;


import concrete.goonie.enums.ENUM_ORDER_TYPE;
import concrete.goonie.symbol.Symbol;

import java.time.LocalDateTime;

class PendingOrder {
        int ticket;
        Symbol symbol;
        double volume;
        ENUM_ORDER_TYPE type;
        double price; // Price at which the order will be triggered
        double stopLoss;
        double takeProfit;
        LocalDateTime expiration;
        String comment;
        
        public PendingOrder(int ticket, Symbol symbol, double volume, ENUM_ORDER_TYPE type,
                           double price, double stopLoss, double takeProfit, 
                           LocalDateTime expiration, String comment) {
            this.ticket = ticket;
            this.symbol = symbol;
            this.volume = volume;
            this.type = type;
            this.price = price;
            this.stopLoss = stopLoss;
            this.takeProfit = takeProfit;
            this.expiration = expiration;
            this.comment = comment;
        }
    }