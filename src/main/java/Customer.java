/*
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
*/


public class Customer {
    private Shop pizzaShop;
    private boolean frequentCustomerDiscount;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private String tempDiscountCode;
    private String tempOrderNote;

    public Customer(Shop pizzaShop) {
        this.pizzaShop = pizzaShop;
        this.frequentCustomerDiscount = false;
    }

    public void orderPizza(String pizzaType) {
        System.out.println("Customer is placing an order for " + pizzaType + " pizza.");
        this.pizzaShop.receiveOrder(pizzaType);
    }

    public void complain(String complaint) {
        System.out.println("Customer is complaining: " + complaint);
        this.pizzaShop.getCashier().calmCustomerDown();
    }

    public void askForReceipt() {
        System.out.println("Customer is asking for a receipt.");
    }

    public void anotherUnusedMethod() {
    }

    public void longComplaintMethod() {
        System.out.println("Customer is complaining about many things");
        this.complain("Pizza is cold");
        this.complain("Pizza is late");
        this.complain("Wrong pizza delivered");
        this.complain("Pizza is burnt");
        this.complain("Too little cheese");
        this.complain("Pizza is undercooked");
        this.askForReceipt();
    }

    public void orderWithUnnecessaryDetails(String pizzaType, String size, String crustType, String toppings, boolean extraCheese, String discountCode) {
        System.out.println("Placing a detailed order for " + pizzaType + " pizza with " + size + ", " + crustType + ", " + toppings + ", extra cheese: " + extraCheese + ", discount code: " + discountCode);
        this.orderPizza(pizzaType);
    }

    public void duplicateComplaint() {
        System.out.println("Customer is complaining about duplicate issues");
        this.complain("Pizza is cold");
        this.complain("Pizza is cold");
        this.complain("Pizza is late");
        this.complain("Pizza is late");
    }

    public void chainOfMethods() {
        System.out.println("Customer is initiating a message chain");
        this.pizzaShop.getCashier().getChef().cleanKitchen();
    }

    public void middlemanMethod() {
        System.out.println("Customer is calling a middleman method");
        this.middleMethod();
    }

    public void middleMethod() {
        System.out.println("Middleman method delegating to another method");
        this.realMethod();
    }

    public void realMethod() {
        System.out.println("Real method doing the actual work");
    }

    public void updateContactInfo(String firstName, String lastName, String address, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void updateName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void updateAddress(String address) {
        this.address = address;
    }

    private int loyaltyPoints = 0;
    private java.util.List<String> orderHistory = new java.util.ArrayList<>();
    private java.util.List<String> complaintHistory = new java.util.ArrayList<>();

    public void placeOrderWithLoyaltyTracking(String pizzaType, double price) {
        System.out.println("Customer " + firstName + " ordering " + pizzaType + " for " + price);
        this.orderPizza(pizzaType);
        this.orderHistory.add(pizzaType);
        int pointsEarned = (int)(price * 10);
        this.loyaltyPoints += pointsEarned;
        System.out.println("Earned " + pointsEarned + " loyalty points. Total: " + loyaltyPoints);
    }

    public void reorderFavoritePizza() {
        if (!orderHistory.isEmpty()) {
            String lastOrder = orderHistory.get(orderHistory.size() - 1);
            System.out.println("Reordering favorite: " + lastOrder);
            this.orderPizza(lastOrder);
            this.orderHistory.add(lastOrder);
            this.orderHistory.add(lastOrder);
        }
    }

    public void viewOrderHistoryAndComplain() {
        System.out.println("Order history for customer " + firstName + ":");
        for (String order : orderHistory) {
            System.out.println("  - " + order);
        }
        if (complaintHistory.size() > 3) {
            System.out.println("This customer has many complaints");
            this.complain("Generally unsatisfied with service");
        }
    }

    public void reportIssueWithTracking(String issue, String severity, String description) {
        System.out.println("Customer reporting issue - Severity: " + severity);
        System.out.println("Issue: " + issue);
        System.out.println("Description: " + description);
        this.complaintHistory.add(issue);
        this.complain(issue);
        if (severity.equals("CRITICAL")) {
            this.complain("CRITICAL ISSUE: " + issue);
            this.complain("CRITICAL ISSUE: " + issue);
        }
    }

    public void updatePhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void updateEmail(String email) {
        this.email = email;
    }

    public void notifyForPromotion() {
        System.out.println("Notifying customer for promotion");
    }

    public void notifyForDiscount() {
        System.out.println("Notifying customer for discount");
    }

    public void notifyForNewArrivals() {
        System.out.println("Notifying customer for new arrivals");
    }

    public void applyDiscount() {
        System.out.println("Applying discount for customer");
    }

    public void applyLoyaltyPoints() {
        System.out.println("Applying loyalty points for customer");
    }

    public void handleComplaint(String complaint) {
        if (complaint.equals("cold pizza")) {
            System.out.println("Handling complaint: Pizza is cold");
        } else if (complaint.equals("late delivery")) {
            System.out.println("Handling complaint: Pizza is late");
        } else if (complaint.equals("wrong order")) {
            System.out.println("Handling complaint: Wrong pizza delivered");
        } else {
            System.out.println("Handling complaint: General complaint");
        }
    }

    public void refusedBequest() {
    }

    public void accessInternalDetails() {
        System.out.println("Accessing internal details of PizzaShop: " + pizzaShop.getCashier().getChef().isBusy());
    }

    private java.util.List<String> preferenceList = new java.util.ArrayList<>();
    private java.util.List<Double> spendingHistory = new java.util.ArrayList<>();
    private int visitCount = 0;

    public void provideDetailedFeedback(String pizzaQuality, String serviceQuality, String deliveryQuality, String valueForMoney, String overallExperience, String wouldRecommend) {
        System.out.println("Customer feedback received");
        System.out.println("Pizza Quality: " + pizzaQuality);
        System.out.println("Service Quality: " + serviceQuality);
        System.out.println("Delivery Quality: " + deliveryQuality);
        System.out.println("Value for Money: " + valueForMoney);
        System.out.println("Overall Experience: " + overallExperience);
        System.out.println("Would Recommend: " + wouldRecommend);
        this.complain("Feedback submitted");
    }

    public void trackSpendingAndPreferences(String item1, double spent1, String item2, double spent2, String item3, double spent3) {
        System.out.println("Tracking customer spending and preferences");
        this.preferenceList.add(item1);
        this.spendingHistory.add(spent1);
        this.preferenceList.add(item2);
        this.spendingHistory.add(spent2);
        this.preferenceList.add(item3);
        this.spendingHistory.add(spent3);
        this.orderPizza(item1);
        this.orderPizza(item2);
        this.orderPizza(item3);
        this.visitCount++;
    }

    public void analyzeCustomerBehavior() {
        System.out.println("Analyzing customer behavior");
        System.out.println("Customer: " + firstName + " " + lastName);
        System.out.println("Total Visits: " + visitCount);
        double totalSpending = 0;
        for (Double spent : spendingHistory) {
            totalSpending += spent;
        }
        System.out.println("Total Spending: " + totalSpending);
        System.out.println("Average Spending: " + (spendingHistory.size() > 0 ? totalSpending / spendingHistory.size() : 0));
        System.out.println("Preferences: ");
        for (int i = 0; i < preferenceList.size(); i++) {
            System.out.println("  " + (i+1) + ". " + preferenceList.get(i) + " - Spent: " + spendingHistory.get(i));
        }
    }

    public void submitLongComplaintWithDetails(String mainIssue, String detail1, String detail2, String detail3, String detail4, String desiredResolution) {
        System.out.println("Customer " + firstName + " submitting detailed complaint");
        System.out.println("Main Issue: " + mainIssue);
        System.out.println("Detail 1: " + detail1);
        System.out.println("Detail 2: " + detail2);
        System.out.println("Detail 3: " + detail3);
        System.out.println("Detail 4: " + detail4);
        System.out.println("Desired Resolution: " + desiredResolution);
        this.complain(mainIssue);
        this.complain(mainIssue);
        this.complaintHistory.add(mainIssue);
        this.complaintHistory.add(detail1);
    }
}
