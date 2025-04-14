# 📊 Goonie Trading Library
### Java Framework for MT5/MT4 Trading Systems  
A complete mirror of MQL5 structures with broker-side calculations, risk management, and historical data analysis.

---

🌐 **Overview**  
A thread-safe, delegation-pattern-based Java library for:

- MetaTrader 5/4 integration (orders, positions, symbols)
- Brokerage calculations (margin, swaps, commissions)
- Historical data aggregation (OHLCV bars, timeframes)
- Trade lifecycle management (order → position → analysis)

Built for:  
- Backtesting  
- Trade Automation  
- Risk Monitoring

---

🧩 **Core Components**  
(Fully documented with your provided Javadoc)

### 1. **Account & Brokerage**  
| **Class** | **Description** |
| --- | --- |
| `Account` | Singleton storing balance, equity, leverage, currency. Globally accessible. |
| `Broker` | Manages broker-specific rules: commissions, spreads, risk limits. |

### 2. **Orders & Positions**  
| **Class** | **Delegates To** | **Key Data** |
| --- | --- | --- |
| `Order` | `OrderDouble` (price/volume), `OrderInteger` (ticket/type), `OrderString` (comment) | Pending/executed orders |
| `Position` | `PositionDouble` (profit/swap), `PositionInteger` (timestamps), `PositionString` (ID) | Open/closed trades |
| `Orders` | Collection | Bulk order management |
| `Positions` | Collection | Position statistics |

### 3. **Market Data**  
| **Class** | **Description** |
| --- | --- |
| `Symbol` | Financial instrument (e.g., EURUSD) with Bid/Ask, point size, lot rules. |
| `Bar` | Single candlestick: Open, High, Low, Close, Volume. |
| `BarSeries` | Time-series collection of Bar objects. |
| `HistoricalData` | Singleton for multi-symbol, multi-timeframe history. |

### 4. **Enums (MQL5-Compatible)**  
| **Enum** | **Values** |
| --- | --- |
| `ENUM_ORDER_TYPE` | `MARKET_BUY`, `LIMIT_SELL`, etc. |
| `ENUM_POSITION_TYPE` | `BUY`, `SELL` |
| `ENUM_TIMEFRAME` | `M1`, `H1`, `D1` with Duration mapping |
| `RETCODES` | Trade operation status codes |

---

⚙️ **Key Features**  
- ✅ **Exact MQL5 Parity**  
   All classes mirror MetaTrader’s structs (e.g., `SymbolInfoDouble → Symbol`).
   
- ✅ **Thread-Safe Design**  
   Critical components (Symbols, HistoricalData) use singleton pattern for safe multi-threaded access.
   
- ✅ **Delegation Pattern**  
   Separation of concerns:
   - `OrderDouble` → price/volume
   - `OrderInteger` → ticket/type
   - `OrderString` → metadata
   
- ✅ **Extensible Calculations**  
   Customize Broker rules for margin, swaps, slippage, and more.

---

📋 **Usage Examples**

1. **Fetch Symbol Data**  
```java
Symbol eurusd = Symbols.getInstance() 
                      .getSymbol("EURUSD", ENUM_TIMEFRAME.H1); 
double bid = eurusd.getBid();  // Delegates to SymbolInfoDouble
int spread = eurusd.getSpread(); // Delegates to SymbolInfoInteger
