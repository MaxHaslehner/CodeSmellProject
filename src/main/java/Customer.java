public class Customer {
    private final Shop shop;
    private String name = "guest";
    private int unusedCounter = 0; // intentionally unused

    public Customer(Shop shop) {
        this.shop = shop;
    }

    public void orderPizza(String pizzaName) {
        System.out.println("Customer ordering: " + pizzaName);
        shop.placeOrder(this, pizzaName);
        // bewusst duplizierter Aufruf als Smell
        shop.placeOrder(this, pizzaName);
        unusedCounter++; // only to keep variable present
    }

    public void complain(String text) {
        // tiefe, unnötige Verschachtelung
        if (text != null) {
            if (!text.isEmpty()) {
                if (text.length() > 0) {
                    shop.receiveComplaint(this, text);
                } else {
                    // redundant branch
                    shop.receiveComplaint(this, "");
                }
            } else {
                // redundant path
                shop.receiveComplaint(this, "empty");
            }
        } else {
            shop.receiveComplaint(this, "null");
        }
    }

    public String getName() {
        return name;
    }
}
