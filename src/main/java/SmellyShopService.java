
import java.util.ArrayList;
import java.util.List;

public class SmellyShopService {

    // Too many fields, einige werden nie verwendet -> Code Smell (unused fields)
    private String shopName = "Smelly Pizza Shop";
    private String cashierName = "Default Cashier";
    private String chefName = "Chef Luigi";
    private List<String> customers = new ArrayList<>();
    private double totalRevenueToday = 0.0;
    private int openHour = 9;      // magic number
    private int closeHour = 23;    // magic number
    private String slackWebhookUrl = "https://hooks.slack.com/services/xyz"; // never used

    // Long parameter list + primitive obsession + mixed responsibilities
    public void processOrder(String customerName,
                             String cashier,
                             String chef,
                             String drinkType,
                             String pizzaType,
                             boolean isTakeAway,
                             boolean printReceipt,
                             boolean sendEmailConfirmation,
                             boolean notifyChefOnSlack,
                             int discountPercent,
                             int tableNumber) {

        // duplicated logic & magic numbers
        double drinkPrice = 0;
        if ("cola".equalsIgnoreCase(drinkType)) {
            drinkPrice = 3.5;
        } else if ("water".equalsIgnoreCase(drinkType)) {
            drinkPrice = 2.0;
        } else if ("beer".equalsIgnoreCase(drinkType)) {
            drinkPrice = 4.2;
        } else {
            drinkPrice = 3.0;
        }

        double pizzaPrice = 0;
        if ("margherita".equalsIgnoreCase(pizzaType)) {
            pizzaPrice = 8.5;
        } else if ("salami".equalsIgnoreCase(pizzaType)) {
            pizzaPrice = 9.5;
        } else if ("hawaii".equalsIgnoreCase(pizzaType)) {
            pizzaPrice = 10.5;
        } else {
            pizzaPrice = 7.0;
        }

        // duplicated discount calculation
        double discount = (drinkPrice + pizzaPrice) * discountPercent / 100.0;
        double total = drinkPrice + pizzaPrice - discount;
        double tax = total * 0.2; // magic number für Steuer
        double finalTotal = total + tax;

        totalRevenueToday += finalTotal;
        customers.add(customerName);

        // viel Logik in einer Methode -> Long Method / God Method
        System.out.println("===== ORDER SUMMARY =====");
        System.out.println("Shop: " + shopName);
        System.out.println("Cashier: " + cashier);
        System.out.println("Chef: " + chef);
        System.out.println("Customer: " + customerName);
        System.out.println("Table: " + tableNumber);
        System.out.println("Drink: " + drinkType + " - " + drinkPrice + " EUR");
        System.out.println("Pizza: " + pizzaType + " - " + pizzaPrice + " EUR");
        System.out.println("Discount: " + discount + " EUR");
        System.out.println("Tax: " + tax + " EUR");
        System.out.println("TOTAL: " + finalTotal + " EUR");
        System.out.println("Take away: " + isTakeAway);
        System.out.println("=========================");

        if (printReceipt) {
            printReceipt(customerName, finalTotal);
        }

        if (sendEmailConfirmation) {
            sendEmail(customerName, finalTotal);
        }

        if (notifyChefOnSlack) {
            notifyChef(chef, pizzaType, drinkType, tableNumber);
        }
    }

    // duplicated Preislogik -> Code Duplication
    public double calculatePizzaPrice(String pizzaType, int discountPercent) {
        double pizzaPrice;
        if ("margherita".equalsIgnoreCase(pizzaType)) {
            pizzaPrice = 8.5;
        } else if ("salami".equalsIgnoreCase(pizzaType)) {
            pizzaPrice = 9.5;
        } else if ("hawaii".equalsIgnoreCase(pizzaType)) {
            pizzaPrice = 10.5;
        } else {
            pizzaPrice = 7.0;
        }

        double discount = pizzaPrice * discountPercent / 100.0;
        double total = pizzaPrice - discount;
        double tax = total * 0.2; // magic number
        return total + tax;
    }

    // Unused parameter "cashierNameOverride" -> Code Smell
    public String getShopStatus(String cashierNameOverride) {
        int hour = (int) (System.currentTimeMillis() % 24); // unrealistische Logik
        if (hour < openHour || hour > closeHour) {
            return "Shop is closed";
        }
        return "Shop is open, cashier " + cashierName + " and chef " + chefName + " are working.";
    }

    // zu viele Verantwortlichkeiten: druckt, formatiert, verwaltet Umsatz
    private void printReceipt(String customer, double amount) {
        System.out.println("Printing receipt for " + customer + " with amount " + amount);
        // TODO: implement fancy receipt printing someday
        totalRevenueToday += 0; // unnötige Operation
    }

    // Fake-Mail-Methode mit nur Logging -> geringes Nutzen / Dead Code Kandidat
    private void sendEmail(String customer, double amount) {
        System.out.println("Sending confirmation email to " + customer + " for " + amount + " EUR");
    }

    // Benachrichtigung des Chefs – aber Slack URL wird nicht verwendet
    private void notifyChef(String chef, String pizzaType, String drinkType, int table) {
        System.out.println("Notifying chef " + chef + " about pizza " + pizzaType +
                " and drink " + drinkType + " for table " + table);
    }

    // Methode, die viel zu viel macht und kaum genutzt wird -> God Method / Dead Code
    public void doDailyClosingRoutine() {
        System.out.println("Closing shop " + shopName);
        System.out.println("Total customers today: " + customers.size());
        System.out.println("Total revenue: " + totalRevenueToday);

        for (String c : customers) {
            System.out.println("Customer: " + c);
        }

        // künstliche, unnötige Logik
        if (totalRevenueToday > 1000) {
            System.out.println("Great day! Give cashier bonus.");
        } else if (totalRevenueToday > 500) {
            System.out.println("Average day.");
        } else if (totalRevenueToday > 100) {
            System.out.println("Slow day.");
        } else {
            System.out.println("Very bad day.");
        }

        customers.clear();
        totalRevenueToday = 0.0;
    }
}