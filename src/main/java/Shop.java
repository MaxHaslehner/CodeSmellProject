import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final List<Pizza> menu = new ArrayList<>();
    private final Chef chef = new Chef();
    private final Cashier cashier = new Cashier();
    private final SmellyShopService service = new SmellyShopService();

    public Shop() {
        // Basismenu (magische Zahlen)
        menu.add(new Pizza("Cheese", 5.0));
        menu.add(new Pizza("Margherita", 6.5));
        menu.add(new Pizza("Pepperoni", 7.2));
    }

    public Pizza findPizzaByName(String name) {
        // ineffiziente Suche, duplizierter Rückgabecode
        for (Pizza p : menu) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        // fallback: erstelle eine Standard‑Pizza (magic price)
        Pizza fallback = new Pizza(name, 9.99);
        return fallback;
    }

    public void placeOrder(Customer customer, String pizzaName) {
        // tief verschachtelt und duplizierte Logik
        Pizza pizza = findPizzaByName(pizzaName);
        if (pizza != null) {
            boolean paid = cashier.collectPayment(customer, pizza.getPrice());
            if (paid) {
                Pizza cooked = chef.cookPizza(pizza);
                if (cooked != null) {
                    service.deliverToCustomer(customer, cooked);
                } else {
                    service.handleFailure("cooking failed");
                }
            } else {
                service.handleFailure("payment failed");
            }
        } else {
            service.handleFailure("no pizza");
        }
    }

    public void receiveComplaint(Customer customer, String text) {
        // einfache Weiterleitung mit extra Logging (dupliziert)
        System.out.println("Shop received complaint: " + text);
        service.logComplaint(customer, text);
        // extra duplicate log
        System.out.println("Shop logged complaint: " + text);
    }
}
