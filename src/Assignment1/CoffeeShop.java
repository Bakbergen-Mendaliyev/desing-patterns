package Assignment1;

import java.util.ArrayList;
import java.util.List;

// CoffeeShop.java
public class CoffeeShop {
    private static CoffeeShop instance;
    private List<CoffeeOrder> orders;

    private CoffeeShop() {
        orders = new ArrayList<>();
    }

    public static synchronized CoffeeShop getInstance() {
        if (instance == null) {
            instance = new CoffeeShop();
        }
        return instance;
    }

    public void addOrder(CoffeeOrder order) {
        orders.add(order);
        System.out.println("Добавлен новый заказ: " + order);
    }

    public void processOrders() {
        for (CoffeeOrder order : orders) {
            order.prepare();
        }
        orders.clear();
    }
}

