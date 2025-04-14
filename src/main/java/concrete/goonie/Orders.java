package concrete.goonie;

import concrete.goonie.account.Account;
import concrete.goonie.symbol.Symbol;
import concrete.goonie.trade.order.Order;
import concrete.goonie.trade.position.Position;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Manages a collection of orders in the trading system.
 */
public class Orders {

    private List<Order> orders = new CopyOnWriteArrayList<>();
    private Order selectedOrder;
    private static Orders instance;

    public Orders() {
        instance = this;
    }

    public static Orders getInstance() {
        return instance;
    }

    public static synchronized Orders setInstance(Orders positions) {
        if (instance == null) {
            instance = positions;
        }
        return instance;
    }

    /**
     * Adds a new open order to the collection.
     *
     * @param order The order to be added.
     */
    public void addOrder(Order order) {
        orders.add(order);
    }

    /**
     * Returns the total number of open orders.
     *
     * @return The number of open orders.
     */
    public int getOrdersTotal() {
        return orders.size();
    }

    /**
     * Returns the symbol corresponding to the open order at the specified index
     * and selects the order for further processing.
     *
     * @param index The index of the order.
     * @return The symbol of the selected order, or null if the index is out of bounds.
     */
    public Symbol getOrderSymbol(int index) {
        if (isValidIndex(index)) {
            selectedOrder = orders.get(index);
            return selectedOrder.getSymbol();
        }
        return null; // Index out of bounds
    }

    /**
     * Retrieves the ticket number of the open order at the specified index.
     *
     * @param index The index of the order.
     * @return The ticket number of the selected order, or 0 if the index is out of bounds.
     */
    public long getOrderTicket(int index) {
        if (isValidIndex(index)) {
            selectedOrder = orders.get(index);
            return selectedOrder.getOrderTicket();
        }
        return 0; // Index out of bounds
    }

    /**
     * Chooses an open order for further processing based on the symbol.
     *
     * @param symbol The symbol of the order.
     * @return True if the order is found and selected, false otherwise.
     */
    public boolean selectOrderBySymbol(Symbol symbol) {
        for (Order order : orders) {
            if (order.getSymbol().equals(symbol)) {
                selectedOrder = order;
                return true; // Order found
            }
        }
        return false; // Order with the specified symbol not found
    }

    /**
     * Selects an open order based on the ticket number.
     *
     * @param ticket The ticket number of the order.
     * @return True if the order is found and selected, false otherwise.
     */
    public boolean selectOrderByTicket(long ticket) {
        for (Order order : orders) {
            if (order.getOrderTicket() == ticket) {
                selectedOrder = order;
                return true; // Order found
            }
        }
        return false; // Order with the specified ticket not found
    }

    /**
     * Returns the currently selected order.
     *
     * @return The selected order, or null if none is selected.
     */
    public Order getCurrentOrder() {
        return selectedOrder;
    }

    /**
     * Adds a new order based on a position.
     *
     * @param position The position from which to create the order.
     */
    public void addOrder(Position position) {
        Order order = new Order();

        order.setOrderMagic(position.getMagicNumber());
        order.setOrderTicket(position.getTicket());
        order.setSymbol(position.getSymbol());
        order.setOrderType(position.getType());
        order.setVolumeCurrent(position.getVolume());
        order.setPriceOpen(position.getPriceOpen());
        order.setStopLoss(position.getStopLoss());
        order.setTakeProfit(position.getTakeProfit());
        order.setPriceClose(position.getClosePrice());
        order.setProfit(position.getProfit());
        order.setOrderComment(position.getComment());
        order.setOpenTime(position.getOpenTime());
        order.setCloseTime(position.getCloseTime());

        addOrder(order); // Add the newly created order to the collection
    }

    /**
     * Retrieves the order at the specified index.
     *
     * @param index The index of the order.
     * @return The order at the specified index, or null if the index is out of bounds.
     */
    public Order getOrderByIndex(int index) {
        if (isValidIndex(index)) {
            selectedOrder = orders.get(index);
            return selectedOrder;
        }
        return null; // Index out of bounds
    }

    /**
     * Prints an analysis of the current orders, including total orders, wins, losses, and win rate.
     */
    public void printAnalysis() {
        int totalOrders = orders.size();
        int wins = 0;
        int losses = 0;

        for (Order order : orders) {
            double profit = order.getProfit(); // Assuming ORDER_PROFIT returns profit
            if (profit > 0) {
                wins++;
            } else if (profit < 0) {
                losses++;
            }
        }

        // Calculate win rate
        double winRate = totalOrders > 0 ? (double) wins / totalOrders * 100 : 0.0;

        // Print the analysis results
        System.err.println("Total Orders: " + totalOrders);
        System.err.println("Number of Wins: " + wins);
        System.err.println("Number of Losses: " + losses);
        System.err.printf("Win Rate: %.2f%%\n", winRate);
        System.err.printf("Account Balance: %.2f\n", Account.getInstance().getBalance());
    }

    /**
     * Clears the currently selected order and removes all orders from the collection.
     */
    public void clear() {
        selectedOrder = null;
        orders.clear();
    }

    public List<Order> getOrders() {
        return orders;
    }

    /**
     * Validates the specified index to ensure it is within the bounds of the order list.
     *
     * @param index The index to validate.
     * @return True if the index is valid, false otherwise.
     */
    private boolean isValidIndex(int index) {
        return index >= 0 && index < orders.size();
    }
}
