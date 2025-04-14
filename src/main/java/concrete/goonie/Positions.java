package concrete.goonie;

import concrete.goonie.account.Account;
import concrete.goonie.enums.ENUM_POSITION_TYPE;
import concrete.goonie.symbol.Symbol;
import concrete.goonie.trade.position.Position;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Manages a collection of trading positions.
 * Provides methods to add, remove, and select positions,
 * and retrieves statistics about the current open positions.
 */
public class Positions {
    private List<Position> openPositions = new CopyOnWriteArrayList<>();
    private HashMap<Integer, Position> positionsHash = new HashMap<>();
    private Position selectedPosition;

    private static Positions instance;

    /**
     * Constructor that initializes the instance of the Positions class.
     */
    public Positions() {
        instance = this;
    }

    /**
     * Returns the singleton instance of the Positions class.
     *
     * @return The singleton instance of Positions.
     */
    public static Positions getInstance() {
        return instance;
    }

    /**
     * Sets the singleton instance of the Positions class.
     *
     * @param positions The Positions instance to set.
     * @return The set Positions instance.
     */
    public static synchronized Positions setInstance(Positions positions) {
        if (instance == null) {
            instance = positions;
        }
        return instance;
    }

    /**
     * Adds an open position to the collection.
     *
     * @param position The position to add.
     * @throws IllegalArgumentException If the position is null.
     */
    public void addPosition(Position position) {
        if (position == null) {
            throw new IllegalArgumentException("Position cannot be null");
        }
        openPositions.add(position);
        positionsHash.put((int) position.getTicket(), position);
    }

    /**
     * Returns the list of open positions.
     *
     * @return The list of open positions.
     */
    public List<Position> getOpenPositions() {
        return openPositions;
    }

    /**
     * Returns the hashmap of positions indexed by their ticket number.
     *
     * @return The hashmap of positions.
     */
    public HashMap<Integer, Position> getPositionsHash() {
        return positionsHash;
    }

    /**
     * Returns the total number of open positions.
     *
     * @return The number of open positions.
     */
    public int getPositionsTotal() {
        return openPositions.size();
    }

    /**
     * Returns the count of open BUY positions.
     *
     * @return The number of buy positions.
     */
    public int getBuyCount() {
        int buyCount = 0;
        for (Position position : openPositions) {
            if (position.getType() == ENUM_POSITION_TYPE.POSITION_TYPE_BUY.ordinal()) {
                buyCount++;
            }
        }
        return buyCount;
    }

    /**
     * Returns the count of open SELL positions.
     *
     * @return The number of sell positions.
     */
    public int getSellCount() {
        int sellCount = 0;
        for (Position position : openPositions) {
            if (position.getType() == ENUM_POSITION_TYPE.POSITION_TYPE_SELL.ordinal()) {
                sellCount++;
            }
        }
        return sellCount;
    }

    /**
     * Returns the symbol of the open position at the specified index.
     * Also selects the position for further processing.
     *
     * @param index The index of the position.
     * @return The symbol of the position or null if index is out of bounds.
     */
    public Symbol getPositionSymbol(int index) {
        Position position = getPositionByIndex(index);
        return position != null ? position.getSymbol() : null;
    }

    /**
     * Retrieves the position at the specified index.
     *
     * @param index The index of the position.
     * @return The position or null if index is out of bounds.
     */
    public Position getPositionByIndex(int index) {
        if (index >= 0 && index < openPositions.size()) {
            selectedPosition = openPositions.get(index);
            return selectedPosition;
        } else {
            return null; // Index out of bounds
        }
    }

    /**
     * Retrieves the ticket number of the position at the specified index.
     *
     * @param index The index of the position.
     * @return The ticket number of the position or 0 if index is out of bounds.
     */
    public long getPositionTicket(int index) {
        Position position = getPositionByIndex(index);
        return position != null ? position.getTicket() : 0;
    }

    /**
     * Selects an open position for further processing based on the symbol.
     *
     * @param symbol The symbol to search for.
     * @return True if the position with the specified symbol is found, false otherwise.
     */
    public boolean getPositionBySymbol(Symbol symbol) {
        for (Position position : openPositions) {
            if (position.getSymbol().equals(symbol)) {
                selectedPosition = position;
                return true;
            }
        }
        return false; // Position with the specified symbol not found
    }

    /**
     * Selects an open position based on the ticket number.
     *
     * @param ticket The ticket number to search for.
     * @return True if the position with the specified ticket number is found, false otherwise.
     */
    public boolean getPositionByTicket(long ticket) {
        for (Position position : openPositions) {
            if (position.getTicket() == ticket) {
                selectedPosition = position;
                return true;
            }
        }
        return false; // Position with the specified ticket not found
    }

    /**
     * Returns the currently selected position.
     *
     * @return The currently selected position.
     */
    public Position getCurrentPosition() {
        return selectedPosition;
    }

    /**
     * Removes a position by its ticket number.
     *
     * @param ticket The ticket number of the position to remove.
     */
    public void removePositionByTicket(long ticket) {
        Iterator<Position> iterator = openPositions.iterator();
        while (iterator.hasNext()) {
            Position position = iterator.next();
            if (position.getTicket() == ticket) {
                iterator.remove(); // Safely remove the position using the iterator
                return;
            }
        }
    }

    /**
     * Removes the specified position from the collection and adds it to the orders.
     *
     * @param position The position to remove.
     */
    public void removePosition(Position position) {
        Account.getInstance().getOrders().addOrder(position); // Placeholder, adjust to pass actual order details
        openPositions.remove(position);
    }

    /**
     * Returns the index of a given position in the open positions list.
     *
     * @param position The position to find.
     * @return The index of the position or -1 if not found.
     */
    public int getPositionIndex(Position position) {
        return openPositions.indexOf(position);
    }

    /**
     * Clears all open positions and resets the selected position.
     */
    public void clear() {
        positionsHash.clear();
        openPositions.clear();
        selectedPosition = null;
    }
}
