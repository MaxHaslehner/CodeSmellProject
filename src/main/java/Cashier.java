/*
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
*/


public class Cashier {
    private Chef chef;
    private boolean frequentCustomerDiscount;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private String tempDiscountCode;
    private String tempOrderNote;

    public Cashier(Chef chef) {
        this.chef = chef;
        this.frequentCustomerDiscount = false;
    }

    public Chef getChef() {
        return this.chef;
    }

    public void takeOrder(String pizzaType) {
        System.out.println("Cashier is taking order for " + pizzaType + " pizza.");
        this.chef.bakePizza(pizzaType);
    }

    public void hurryUpChef() {
        System.out.println("Cashier is hurrying up the chef.");
        this.chef.hurryUp();
    }

    public void calmCustomerDown() {
        System.out.println("Cashier is calming the customer down.");
        this.chef.cleanKitchen();
    }

    public void deliverPizzaToCustomer() {
        System.out.println("Cashier is delivering pizza to the customer.");
    }

    public void askForReceipt() {
        System.out.println("Customer is asking for a receipt.");
    }

    public void anotherUnusedMethod() {
    }

    public void longMethod() {
        System.out.println("Cashier is handling many tasks in a single method");
        this.takeOrder("Cheese");
        this.hurryUpChef();
        this.calmCustomerDown();
        this.deliverPizzaToCustomer();
        this.askForReceipt();
    }

    public void duplicateMethod() {
        this.takeOrder("Cheese");
        this.takeOrder("Cheese");
    }

    public void chainOfMethods() {
        System.out.println("Cashier is initiating a message chain");
        this.chef.cleanKitchen();
    }

    public void middlemanMethod() {
        System.out.println("Cashier is calling a middleman method");
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

    public void processPayment(double amount, String cardNumber, String cvv, String expiryDate) {
        System.out.println("Processing payment of " + amount);
        if (cardNumber.length() == 16 && cvv.length() == 3) {
            System.out.println("Payment accepted from card: " + cardNumber);
            this.takeOrder("DefaultPizza");
            this.askForReceipt();
            System.out.println("Transaction completed");
        } else {
            System.out.println("Invalid card details");
        }
    }

    public void processRefund(double amount, String cardNumber, String reason, String notes, String authorizedBy) {
        System.out.println("Processing refund of " + amount + " for reason: " + reason);
        if (cardNumber != null && cardNumber.length() == 16) {
            System.out.println("Refund initiated to card: " + cardNumber);
            System.out.println("Authorized by: " + authorizedBy);
            System.out.println("Additional notes: " + notes);
            double refundAmount = amount - (amount * 0.05);
            System.out.println("Final refund amount after fees: " + refundAmount);
            System.out.println("Refund processing complete");
        }
    }

    public void handleComplexOrderWithDiscount(String pizzaType, double basePrice, boolean isFrequentCustomer, int loyaltyPoints, String discountCode, String specialInstructions) {
        System.out.println("Handling order for " + pizzaType + " at base price " + basePrice);
        double finalPrice = basePrice;
        if (isFrequentCustomer) {
            finalPrice = finalPrice * 0.9;
            System.out.println("Applied frequent customer discount");
        }
        if (loyaltyPoints > 100) {
            finalPrice = finalPrice * 0.85;
            System.out.println("Applied loyalty points discount");
        }
        if (discountCode != null && !discountCode.isEmpty()) {
            finalPrice = finalPrice * 0.8;
            System.out.println("Applied discount code: " + discountCode);
        }
        System.out.println("Special instructions: " + specialInstructions);
        System.out.println("Final price: " + finalPrice);
        this.takeOrder(pizzaType);
    }

    public void handleComplaint(String complaint) {
        if (complaint.equals("cold pizza")) {
            this.calmCustomerDown();
        } else if (complaint.equals("late delivery")) {
            this.calmCustomerDown();
        } else if (complaint.equals("wrong order")) {
            this.calmCustomerDown();
        } else {
            this.calmCustomerDown();
        }
    }

    public void refusedBequest() {
    }

    public void accessInternalDetails() {
        System.out.println("Accessing internal details of Chef: " + chef.isBusy());
    }

    private java.util.List<String> transactionHistory = new java.util.ArrayList<>();
    private int totalTransactions = 0;
    private double totalCashProcessed = 0;

    public void processBulkPayments(String cust1, double amt1, String cust2, double amt2, String cust3, double amt3, String cust4, double amt4) {
        System.out.println("Processing bulk payments");
        this.processPaymentForCustomer(cust1, amt1);
        this.processPaymentForCustomer(cust2, amt2);
        this.processPaymentForCustomer(cust3, amt3);
        this.processPaymentForCustomer(cust4, amt4);
        System.out.println("Bulk processing complete");
    }

    public void processPaymentForCustomer(String customerName, double amount) {
        System.out.println("Processing payment for " + customerName + ": " + amount);
        this.transactionHistory.add(customerName + ": " + amount);
        this.totalTransactions++;
        this.totalCashProcessed += amount;
        this.takeOrder("ProcessedOrder");
        System.out.println("Transaction recorded");
    }

    public void applyMultipleDiscountsSequentially(String customerId, double orderAmount, boolean memberDiscount, boolean seasonalDiscount, boolean referralDiscount, boolean flashSaleDiscount) {
        System.out.println("Applying discounts for customer: " + customerId);
        double discountedAmount = orderAmount;
        if (memberDiscount) {
            discountedAmount = discountedAmount * 0.95;
            System.out.println("Member discount applied");
        }
        if (seasonalDiscount) {
            discountedAmount = discountedAmount * 0.90;
            System.out.println("Seasonal discount applied");
        }
        if (referralDiscount) {
            discountedAmount = discountedAmount * 0.85;
            System.out.println("Referral discount applied");
        }
        if (flashSaleDiscount) {
            discountedAmount = discountedAmount * 0.75;
            System.out.println("Flash sale discount applied");
        }
        System.out.println("Original: " + orderAmount + ", Final: " + discountedAmount);
    }

    public void generateTransactionReport() {
        System.out.println("\n=== Transaction Report ===");
        System.out.println("Total Transactions: " + totalTransactions);
        System.out.println("Total Cash Processed: " + totalCashProcessed);
        System.out.println("Average Transaction: " + (totalTransactions > 0 ? totalCashProcessed / totalTransactions : 0));
        for (int i = 0; i < transactionHistory.size(); i++) {
            System.out.println("  Transaction " + (i+1) + ": " + transactionHistory.get(i));
        }
    }

    private java.util.Map<String, Double> customerBalances = new java.util.HashMap<>();
    private java.util.Map<String, String> paymentMethods = new java.util.HashMap<>();

    public void updateCustomerBalance(String customerId, double amount, String paymentMethod, String status, boolean processImmediately) {
        System.out.println("Updating balance for customer: " + customerId);
        if (customerBalances.containsKey(customerId)) {
            double currentBalance = customerBalances.get(customerId);
            double newBalance = currentBalance + amount;
            customerBalances.put(customerId, newBalance);
            System.out.println("Previous balance: " + currentBalance + ", New balance: " + newBalance);
        } else {
            customerBalances.put(customerId, amount);
        }
        paymentMethods.put(customerId, paymentMethod);
        System.out.println("Status: " + status);
        if (processImmediately) {
            this.processPaymentForCustomer(customerId, amount);
            System.out.println("Payment processed immediately");
        }
    }

    public void validateAndProcessLargeTransaction(String customerId, double amount, String cardType, String cardLastFour, String expiryMonth, String expiryYear, String cvv, String billingZip) {
        System.out.println("Validating large transaction for: " + customerId + " Amount: " + amount);
        if (amount > 1000) {
            System.out.println("High value transaction detected");
            this.processRefund(amount, cardLastFour, "Verification pending", "Transaction under review", "Manager");
            System.out.println("Card Type: " + cardType);
            System.out.println("Last Four: " + cardLastFour);
            System.out.println("Expiry: " + expiryMonth + "/" + expiryYear);
            System.out.println("Billing Zip: " + billingZip);
            System.out.println("Verification complete");
        } else {
            this.processPaymentForCustomer(customerId, amount);
        }
    }

    public void generateDetailedCustomerReport(String customerId) {
        System.out.println("\n=== Customer Report for " + customerId + " ===");
        if (customerBalances.containsKey(customerId)) {
            System.out.println("Balance: " + customerBalances.get(customerId));
            System.out.println("Payment Method: " + paymentMethods.get(customerId));
            System.out.println("Transaction Count: " + totalTransactions);
            System.out.println("Total Processed: " + totalCashProcessed);
            for (String trans : transactionHistory) {
                if (trans.contains(customerId)) {
                    System.out.println("  " + trans);
                }
            }
        } else {
            System.out.println("Customer not found");
        }
    }

    private java.util.List<String> pendingOrders = new java.util.ArrayList<>();
    private java.util.Map<String, String> orderStatuses = new java.util.HashMap<>();

    public void managePendingOrdersWithPriority(String order1, String priority1, String order2, String priority2, String order3, String priority3, boolean expedited) {
        System.out.println("Managing pending orders with priority");
        pendingOrders.add(order1);
        orderStatuses.put(order1, priority1);
        pendingOrders.add(order2);
        orderStatuses.put(order2, priority2);
        pendingOrders.add(order3);
        orderStatuses.put(order3, priority3);
        System.out.println("Order 1: " + order1 + " - Priority: " + priority1);
        System.out.println("Order 2: " + order2 + " - Priority: " + priority2);
        System.out.println("Order 3: " + order3 + " - Priority: " + priority3);
        if (expedited) {
            System.out.println("Expedited processing enabled");
            this.takeOrder("Expedited");
        }
    }

    public void reconcileAccountsAndGenerateStatement(String accountId, double openingBalance, double deposits, double withdrawals, double fees, String statementPeriod) {
        System.out.println("Reconciling account: " + accountId);
        System.out.println("Statement Period: " + statementPeriod);
        System.out.println("Opening Balance: " + openingBalance);
        System.out.println("Deposits: " + deposits);
        System.out.println("Withdrawals: " + withdrawals);
        System.out.println("Fees: " + fees);
        double closingBalance = openingBalance + deposits - withdrawals - fees;
        System.out.println("Closing Balance: " + closingBalance);
        System.out.println("Account reconciliation complete");
    }

    private java.util.List<String> auditLog = new java.util.ArrayList<>();
    private java.util.Map<String, Integer> suspiciousActivityCount = new java.util.HashMap<>();

    public void flagAndInvestigateSuspiciousActivity(String customerId, String activityType, String description, double amount, boolean isHighRisk, String investigationStatus) {
        System.out.println("Flagging suspicious activity for: " + customerId);
        System.out.println("Activity Type: " + activityType);
        System.out.println("Description: " + description);
        System.out.println("Amount: " + amount);
        System.out.println("High Risk: " + isHighRisk);
        auditLog.add(customerId + ": " + activityType + " - " + description);
        if (suspiciousActivityCount.containsKey(customerId)) {
            int count = suspiciousActivityCount.get(customerId);
            suspiciousActivityCount.put(customerId, count + 1);
        } else {
            suspiciousActivityCount.put(customerId, 1);
        }
        System.out.println("Investigation Status: " + investigationStatus);
        if (isHighRisk) {
            System.out.println("ALERT: High risk activity detected - blocking transaction");
        }
    }

    public void processMultipleRefundsWithReason(String cust1RefundId, double cust1Amount, String cust1Reason, String cust2RefundId, double cust2Amount, String cust2Reason, String cust3RefundId, double cust3Amount, String cust3Reason) {
        System.out.println("Processing multiple refunds");
        this.processRefund(cust1Amount, cust1RefundId, cust1Reason, "Pending", "Processor");
        this.processRefund(cust2Amount, cust2RefundId, cust2Reason, "Pending", "Processor");
        this.processRefund(cust3Amount, cust3RefundId, cust3Reason, "Pending", "Processor");
        System.out.println("All refunds submitted for processing");
    }

    public void generateMonthlyPerformanceReport(int month, int year, double targetRevenue, double actualRevenue, int targetTransactions, int actualTransactions, String performanceRating) {
        System.out.println("\n=== Monthly Performance Report ===");
        System.out.println("Month: " + month + "/" + year);
        System.out.println("Target Revenue: " + targetRevenue);
        System.out.println("Actual Revenue: " + actualRevenue);
        double revenueVariance = actualRevenue - targetRevenue;
        System.out.println("Revenue Variance: " + revenueVariance);
        System.out.println("Target Transactions: " + targetTransactions);
        System.out.println("Actual Transactions: " + actualTransactions);
        int transactionVariance = actualTransactions - targetTransactions;
        System.out.println("Transaction Variance: " + transactionVariance);
        System.out.println("Performance Rating: " + performanceRating);
        System.out.println("Audit Log Entries: " + auditLog.size());
        for (int i = 0; i < Math.min(5, auditLog.size()); i++) {
            System.out.println("  " + auditLog.get(i));
        }
    }
}
