import java.util.*;

/**
 * Noch "smelliger" als vorher – bewusst mit vielen Code Smells für Demo-/Tool-Tests.
 */
public class UltraSmellyShopService {

    // Too many fields / God Class + Primitive Obsession + Magic Numbers + Unused
    private String shopName = "Ultra Smelly Pizza Shop";
    private String ownerName = "Boss Mario";
    private String cashierName = "Cashier Anna";
    private String chefName = "Chef Luigi";
    private String street = "Main Street 1";
    private String city = "Vienna";
    private String country = "AT";
    private String currency = "EUR";
    private boolean isOpen = true;

    private int openHour = 9;          // magic number
    private int closeHour = 23;        // magic number
    private double taxRate = 0.2;      // magic number
    private double serviceFee = 1.99;  // magic number

    private double totalRevenueToday = 0.0;
    private double totalRevenueWeek = 0.0;
    private int ordersToday = 0;
    private int ordersWeek = 0;

    private List<String> customers = new ArrayList<>();
    private Map<String, Integer> pizzaCounts = new HashMap<>();
    private Map<String, Integer> drinkCounts = new HashMap<>();

    private String slackWebhookUrl = "https://hooks.slack.com/services/xyz"; // never used
    private String smtpServer = "mail.example.com"; // never used
    private String apiKey = "SUPER_SECRET_KEY";     // hardcoded credential smell
    private String lastError = "";                  // poor error handling
    private Object mutex = new Object();            // questionable synchronization
    private Random random = new Random();           // used for business logic randomness

    // Long parameter list + Feature Envy + Mixed responsibilities
    public void processOrder(
            String customerName,
            String cashier,
            String chef,
            String drinkType,
            String pizzaType,
            boolean isTakeAway,
            boolean printReceipt,
            boolean sendEmailConfirmation,
            boolean notifyChefOnSlack,
            boolean alsoNotifyOwner,
            int discountPercent,
            int tableNumber,
            String notes,
            String phoneNumber,
            String email,
            String paymentType,
            int tipPercent,
            boolean applyServiceFee,
            String couponCode
    ) {
        // Data clumps / Primitive obsession (Strings for types)
        if (customerName == null || customerName.trim().isEmpty()) {
            // poor error handling: side effects + magic string
            lastError = "Customer invalid";
            System.out.println("ERROR: customer invalid");
            return;
        }

        // Duplicated logic: drink pricing
        double drinkPrice = 0;
        if ("cola".equalsIgnoreCase(drinkType)) {
            drinkPrice = 3.5;
        } else if ("water".equalsIgnoreCase(drinkType)) {
            drinkPrice = 2.0;
        } else if ("beer".equalsIgnoreCase(drinkType)) {
            drinkPrice = 4.2;
        } else if ("wine".equalsIgnoreCase(drinkType)) {
            drinkPrice = 5.9;
        } else {
            drinkPrice = 3.0;
        }

        // Duplicated logic: pizza pricing
        double pizzaPrice = 0;
        if ("margherita".equalsIgnoreCase(pizzaType)) {
            pizzaPrice = 8.5;
        } else if ("salami".equalsIgnoreCase(pizzaType)) {
            pizzaPrice = 9.5;
        } else if ("hawaii".equalsIgnoreCase(pizzaType)) {
            pizzaPrice = 10.5;
        } else if ("diavola".equalsIgnoreCase(pizzaType)) {
            pizzaPrice = 11.2;
        } else {
            pizzaPrice = 7.0;
        }

        // Dead code / meaningless branch
        if ("FREE".equalsIgnoreCase(couponCode)) {
            // unrealistic coupon: makes pizza negative later
            pizzaPrice = pizzaPrice - 999;
        }

        // Shotgun surgery candidate: discount/tax repeated everywhere
        double subtotal = drinkPrice + pizzaPrice;

        // magic number thresholds + suspicious business randomness
        if (subtotal > 50) {
            discountPercent = discountPercent + random.nextInt(5); // unpredictable pricing smell
        }

        double discount = subtotal * discountPercent / 100.0;
        double afterDiscount = subtotal - discount;

        if (applyServiceFee) {
            afterDiscount += serviceFee;
        }

        double tip = afterDiscount * tipPercent / 100.0; // tip on top of service fee
        double tax = afterDiscount * taxRate;
        double finalTotal = afterDiscount + tax + tip;

        // Poor validation
        if (finalTotal < 0) {
            System.out.println("TOTAL IS NEGATIVE BUT WE CONTINUE ANYWAY: " + finalTotal);
        }

        // Concurrency smell: useless lock for single-threaded demo
        synchronized (mutex) {
            totalRevenueToday += finalTotal;
            totalRevenueWeek += finalTotal;
            ordersToday++;
            ordersWeek++;
            customers.add(customerName);
        }

        // Duplicated counting logic + potential NPE
        pizzaCounts.put(pizzaType, pizzaCounts.get(pizzaType) == null ? 1 : pizzaCounts.get(pizzaType) + 1);
        drinkCounts.put(drinkType, drinkCounts.get(drinkType) == null ? 1 : drinkCounts.get(drinkType) + 1);

        // Long method / God method: does printing, reporting, payment checks, notifications
        System.out.println("===== ORDER SUMMARY =====");
        System.out.println("Shop: " + shopName + " (" + street + ", " + city + ", " + country + ")");
        System.out.println("Cashier: " + cashier + " | Chef: " + chef);
        System.out.println("Customer: " + customerName + " | Table: " + tableNumber);
        System.out.println("Drink: " + drinkType + " - " + drinkPrice + " " + currency);
        System.out.println("Pizza: " + pizzaType + " - " + pizzaPrice + " " + currency);
        System.out.println("Notes: " + notes);
        System.out.println("Payment: " + paymentType + " | Phone: " + phoneNumber + " | Email: " + email);
        System.out.println("Discount: " + discount + " " + currency + " (" + discountPercent + "%)");
        if (applyServiceFee) {
            System.out.println("Service fee: " + serviceFee + " " + currency);
        }
        System.out.println("Tax: " + tax + " " + currency + " (" + (taxRate * 100) + "%)");
        System.out.println("Tip: " + tip + " " + currency + " (" + tipPercent + "%)");
        System.out.println("TOTAL: " + finalTotal + " " + currency);
        System.out.println("Take away: " + isTakeAway);
        System.out.println("=========================");

        // Payment handling: fake + mixed responsibilities
        if ("cash".equalsIgnoreCase(paymentType)) {
            System.out.println("Cash payment accepted.");
        } else if ("card".equalsIgnoreCase(paymentType)) {
            System.out.println("Card payment accepted.");
        } else if ("crypto".equalsIgnoreCase(paymentType)) {
            System.out.println("Crypto payment accepted (lol).");
        } else {
            System.out.println("Unknown payment type. Still accepted because why not.");
        }

        if (printReceipt) {
            printReceipt(customerName, finalTotal, tableNumber, notes); // too many params
        }

        if (sendEmailConfirmation) {
            sendEmail(customerName, email, finalTotal); // fake email
        }

        if (notifyChefOnSlack) {
            notifyChef(chef, pizzaType, drinkType, tableNumber); // Slack URL still unused
        }

        if (alsoNotifyOwner) {
            notifyOwner(ownerName, customerName, finalTotal); // extra responsibility
        }
    }

    // Duplicated pizza pricing + switch missing default consistency + magic numbers
    public double calculatePizzaPrice(String pizzaType, int discountPercent, boolean includeTax) {
        double pizzaPrice = 0;
        if ("margherita".equalsIgnoreCase(pizzaType)) {
            pizzaPrice = 8.5;
        } else if ("salami".equalsIgnoreCase(pizzaType)) {
            pizzaPrice = 9.5;
        } else if ("hawaii".equalsIgnoreCase(pizzaType)) {
            pizzaPrice = 10.5;
        } else if ("diavola".equalsIgnoreCase(pizzaType)) {
            pizzaPrice = 11.2;
        } else {
            pizzaPrice = 7.0;
        }

        double discount = pizzaPrice * discountPercent / 100.0;
        double total = pizzaPrice - discount;

        if (includeTax) {
            total += total * 0.2; // magic number duplicate
        }
        return total;
    }

    // Unused parameters + strange time logic
    public String getShopStatus(String cashierNameOverride, String timezone, boolean verbose) {
        int hour = (int) (System.nanoTime() % 24); // nonsense time logic
        if (hour < openHour || hour > closeHour || !isOpen) {
            if (verbose) {
                return "Shop is closed. Reason: hour=" + hour + ", openHour=" + openHour + ", closeHour=" + closeHour;
            }
            return "Shop is closed";
        }
        return "Shop is open, cashier " + cashierName + " and chef " + chefName + " are working.";
    }

    // Copy/paste receipt formatting + side effects
    private void printReceipt(String customer, double amount, int table, String notes) {
        System.out.println("---- RECEIPT ----");
        System.out.println("Customer: " + customer);
        System.out.println("Table: " + table);
        System.out.println("Notes: " + notes);
        System.out.println("Amount: " + amount + " " + currency);
        System.out.println("-----------------");
        totalRevenueToday += 0; // pointless
    }

    // Fake mail method + ignores SMTP config
    private void sendEmail(String customer, String email, double amount) {
        if (email == null) {
            System.out.println("No email set, but we say it's sent anyway.");
        }
        System.out.println("Sending confirmation email to " + customer + " at " + email + " for " + amount + " " + currency);
    }

    // Misleading method name (doesn't use Slack), still prints only
    private void notifyChef(String chef, String pizzaType, String drinkType, int table) {
        System.out.println("Notifying chef " + chef + " about pizza " + pizzaType +
                " and drink " + drinkType + " for table " + table);
    }

    // Another responsibility added
    private void notifyOwner(String owner, String customer, double total) {
        System.out.println("Notifying owner " + owner + " about customer " + customer + " total " + total);
    }

    // God method + nested conditionals + feature envy + data dump
    public void doDailyClosingRoutine(boolean weeklyAlso, boolean printCustomerList, boolean resetCounts) {
        System.out.println("Closing shop " + shopName);
        System.out.println("Total customers today: " + customers.size());
        System.out.println("Orders today: " + ordersToday);
        System.out.println("Revenue today: " + totalRevenueToday);

        if (printCustomerList) {
            for (String c : customers) {
                System.out.println("Customer: " + c);
            }
        }

        // Deep nesting + magic thresholds
        if (totalRevenueToday > 2000) {
            System.out.println("Amazing day! Give cashier bonus AND chef bonus.");
        } else {
            if (totalRevenueToday > 1000) {
                System.out.println("Great day! Give cashier bonus.");
            } else {
                if (totalRevenueToday > 500) {
                    System.out.println("Average day.");
                } else {
                    if (totalRevenueToday > 100) {
                        System.out.println("Slow day.");
                    } else {
                        System.out.println("Very bad day.");
                    }
                }
            }
        }

        // Print counts (might be huge)
        System.out.println("Pizza counts: " + pizzaCounts);
        System.out.println("Drink counts: " + drinkCounts);

        if (weeklyAlso) {
            System.out.println("=== WEEKLY SUMMARY ===");
            System.out.println("Orders week: " + ordersWeek);
            System.out.println("Revenue week: " + totalRevenueWeek);
        }

        // "resetCounts" toggles too much behavior (flag argument smell)
        if (resetCounts) {
            customers.clear();
            pizzaCounts.clear();
            drinkCounts.clear();
            totalRevenueToday = 0.0;
            ordersToday = 0;
        }

        // Hidden side effect even when resetCounts=false
        lastError = "";
    }

    // Dead code candidate + overly generic util + wrong abstraction
    public Object doEverything(Object a, Object b, Object c) {
        System.out.println("Doing everything with " + a + ", " + b + ", " + c);
        if (a == null) return b;
        if (b == null) return a;
        if (c == null) return "oops";
        return a.toString() + b.toString() + c.toString();
    }

    // Exposes internal state (encapsulation smell)
    public List<String> getCustomers() {
        return customers; // returns mutable list directly
    }
}
