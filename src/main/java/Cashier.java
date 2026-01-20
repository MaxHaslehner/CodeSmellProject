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

    private java.util.List<String> settlementRecords = new java.util.ArrayList<>();
    private java.util.Map<String, Double> dailyTotals = new java.util.HashMap<>();

    public void processEndOfDaySettlement(String settlementDate, double cashOnHand, double expectedAmount, double discrepancy, String discrepancyReason, boolean requiresApproval, String approverName) {
        System.out.println("Processing End of Day Settlement for: " + settlementDate);
        System.out.println("Cash On Hand: " + cashOnHand);
        System.out.println("Expected Amount: " + expectedAmount);
        System.out.println("Discrepancy: " + discrepancy);
        System.out.println("Reason: " + discrepancyReason);
        if (requiresApproval) {
            System.out.println("Approval Required: " + approverName);
        }
        settlementRecords.add(settlementDate + ": " + discrepancy);
        dailyTotals.put(settlementDate, cashOnHand);
        System.out.println("Settlement record created");
    }

    public void handleSpecialPromotionsAndDiscounts(String promo1Code, double promo1Discount, int promo1MinPurchase, String promo2Code, double promo2Discount, int promo2MinPurchase, String promo3Code, double promo3Discount, int promo3MinPurchase, boolean stackable) {
        System.out.println("Handling special promotions");
        System.out.println("Promotion 1: " + promo1Code + " - " + promo1Discount + "% off (min: $" + promo1MinPurchase + ")");
        System.out.println("Promotion 2: " + promo2Code + " - " + promo2Discount + "% off (min: $" + promo2MinPurchase + ")");
        System.out.println("Promotion 3: " + promo3Code + " - " + promo3Discount + "% off (min: $" + promo3MinPurchase + ")");
        System.out.println("Stackable: " + stackable);
        if (stackable) {
            double totalDiscount = promo1Discount + promo2Discount + promo3Discount;
            System.out.println("Total Discount if Stacked: " + totalDiscount + "%");
        }
    }

    public void validateAndProcessCashierBalance(String cashierId, double openingBalance, double totalSalesProcessed, double totalRefunds, double totalDiscounts, double expectedClosingBalance, boolean balanceMatches) {
        System.out.println("Validating cashier balance for: " + cashierId);
        System.out.println("Opening Balance: " + openingBalance);
        System.out.println("Total Sales: " + totalSalesProcessed);
        System.out.println("Total Refunds: " + totalRefunds);
        System.out.println("Total Discounts: " + totalDiscounts);
        double calculatedClosing = openingBalance + totalSalesProcessed - totalRefunds - totalDiscounts;
        System.out.println("Expected Closing: " + expectedClosingBalance);
        System.out.println("Calculated Closing: " + calculatedClosing);
        System.out.println("Balance Matches: " + balanceMatches);
        if (!balanceMatches) {
            System.out.println("ALERT: Cashier balance discrepancy detected!");
        }
    }

    public void executeComplexOrderBatch(String batch1Orders, String batch2Orders, String batch3Orders, String batch4Orders, boolean parallelProcessing, String priority, int timeoutSeconds) {
        System.out.println("Executing complex order batch");
        System.out.println("Batch 1: " + batch1Orders);
        System.out.println("Batch 2: " + batch2Orders);
        System.out.println("Batch 3: " + batch3Orders);
        System.out.println("Batch 4: " + batch4Orders);
        System.out.println("Parallel Processing: " + parallelProcessing);
        System.out.println("Priority: " + priority);
        System.out.println("Timeout: " + timeoutSeconds + " seconds");
        this.takeOrder(batch1Orders);
        this.takeOrder(batch2Orders);
        this.takeOrder(batch3Orders);
        this.takeOrder(batch4Orders);
        System.out.println("Batch execution initiated");
    }

    private java.util.Map<String, java.util.List<String>> customerTransactionLog = new java.util.HashMap<>();
    private java.util.Map<String, String> paymentGateways = new java.util.HashMap<>();

    public void integrateMultiplePaymentGateways(String gateway1Name, String gateway1ApiKey, boolean gateway1Active, String gateway2Name, String gateway2ApiKey, boolean gateway2Active, String gateway3Name, String gateway3ApiKey, boolean gateway3Active) {
        System.out.println("Integrating multiple payment gateways");
        paymentGateways.put(gateway1Name, gateway1ApiKey);
        paymentGateways.put(gateway2Name, gateway2ApiKey);
        paymentGateways.put(gateway3Name, gateway3ApiKey);
        System.out.println("Gateway 1: " + gateway1Name + " - Active: " + gateway1Active);
        System.out.println("Gateway 2: " + gateway2Name + " - Active: " + gateway2Active);
        System.out.println("Gateway 3: " + gateway3Name + " - Active: " + gateway3Active);
        if (gateway1Active) this.processPayment(0, gateway1Name, "", "");
        if (gateway2Active) this.processPayment(0, gateway2Name, "", "");
        if (gateway3Active) this.processPayment(0, gateway3Name, "", "");
    }

    public void processComplexCustomerReturnRequest(String customerId, String orderId, String itemsReturned, double refundAmount, String reason, boolean restockItems, String returnWindowExpiry, String approvalStatus) {
        System.out.println("Processing return for customer: " + customerId);
        System.out.println("Order ID: " + orderId);
        System.out.println("Items Returned: " + itemsReturned);
        System.out.println("Refund Amount: " + refundAmount);
        System.out.println("Reason: " + reason);
        System.out.println("Restock Items: " + restockItems);
        System.out.println("Return Window Expiry: " + returnWindowExpiry);
        System.out.println("Approval Status: " + approvalStatus);
        if (customerTransactionLog.containsKey(customerId)) {
            java.util.List<String> logs = customerTransactionLog.get(customerId);
            logs.add("Return: " + orderId);
        } else {
            java.util.List<String> logs = new java.util.ArrayList<>();
            logs.add("Return: " + orderId);
            customerTransactionLog.put(customerId, logs);
        }
        this.processRefund(refundAmount, orderId, reason, "Pending", "System");
    }

    public void generateDetailedSalesAnalyticsReport(String startDate, String endDate, double totalRevenue, int totalTransactions, double avgTransactionValue, String topProduct, int topProductCount, String worstProduct, int worstProductCount) {
        System.out.println("\n=== Detailed Sales Analytics Report ===");
        System.out.println("Period: " + startDate + " to " + endDate);
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.println("Total Transactions: " + totalTransactions);
        System.out.println("Average Transaction Value: $" + avgTransactionValue);
        System.out.println("Top Product: " + topProduct + " (" + topProductCount + " sold)");
        System.out.println("Worst Product: " + worstProduct + " (" + worstProductCount + " sold)");
        System.out.println("Payment Gateways Configured: " + paymentGateways.size());
        for (String gateway : paymentGateways.keySet()) {
            System.out.println("  - " + gateway);
        }
        System.out.println("Customer Transactions Logged: " + customerTransactionLog.size());
        System.out.println("Settlement Records: " + settlementRecords.size());
    }

    public void handleComplexDiscountCombinations(String customerId, boolean loyaltyMemberDiscount, boolean firstTimeDiscount, boolean bundleDiscount, boolean seasonalDiscount, double baseAmount, String combinationStrategy) {
        System.out.println("Calculating complex discount combinations for: " + customerId);
        double finalAmount = baseAmount;
        if (loyaltyMemberDiscount) {
            finalAmount = finalAmount * 0.95;
            System.out.println("Loyalty Member: -5%");
        }
        if (firstTimeDiscount) {
            finalAmount = finalAmount * 0.90;
            System.out.println("First Time: -10%");
        }
        if (bundleDiscount) {
            finalAmount = finalAmount * 0.85;
            System.out.println("Bundle: -15%");
        }
        if (seasonalDiscount) {
            finalAmount = finalAmount * 0.80;
            System.out.println("Seasonal: -20%");
        }
        System.out.println("Strategy: " + combinationStrategy);
        System.out.println("Original: $" + baseAmount + " -> Final: $" + finalAmount);
    }

    private java.util.List<String> invoiceRecords = new java.util.ArrayList<>();
    private java.util.Map<String, Double> customerCreditLimits = new java.util.HashMap<>();

    public void generateAndSendInvoiceWithTaxCalculation(String invoiceId, String customerId, double subtotal, double taxRate, double shippingCost, double insuranceCost, String invoiceDate, String dueDate, String paymentTerms) {
        System.out.println("Generating invoice: " + invoiceId);
        System.out.println("Customer: " + customerId);
        System.out.println("Subtotal: $" + subtotal);
        double taxAmount = subtotal * (taxRate / 100.0);
        System.out.println("Tax (" + taxRate + "%): $" + taxAmount);
        System.out.println("Shipping: $" + shippingCost);
        System.out.println("Insurance: $" + insuranceCost);
        double total = subtotal + taxAmount + shippingCost + insuranceCost;
        System.out.println("Total: $" + total);
        System.out.println("Invoice Date: " + invoiceDate);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Payment Terms: " + paymentTerms);
        invoiceRecords.add(invoiceId + ": " + total);
    }

    public void validateCreditLimitAndAuthorizeTransaction(String customerId, double transactionAmount, double currentCreditBalance, double creditLimit, String creditRating, boolean automaticApproval, String manualReviewRequired) {
        System.out.println("Validating credit limit for: " + customerId);
        System.out.println("Transaction Amount: $" + transactionAmount);
        System.out.println("Current Credit Balance: $" + currentCreditBalance);
        System.out.println("Credit Limit: $" + creditLimit);
        System.out.println("Credit Rating: " + creditRating);
        double availableCredit = creditLimit - currentCreditBalance;
        System.out.println("Available Credit: $" + availableCredit);
        customerCreditLimits.put(customerId, availableCredit);
        if (automaticApproval) {
            System.out.println("Transaction APPROVED");
            this.processPayment(transactionAmount, customerId, "", "");
        } else {
            System.out.println("Manual Review Required: " + manualReviewRequired);
        }
    }

    public void processVolumeDiscountTiering(String tierId, int orderQuantity, double unitPrice, double tier1Threshold, double tier1Discount, double tier2Threshold, double tier2Discount, double tier3Threshold, double tier3Discount) {
        System.out.println("Processing volume discount tier: " + tierId);
        System.out.println("Order Quantity: " + orderQuantity);
        System.out.println("Unit Price: $" + unitPrice);
        double totalPrice = orderQuantity * unitPrice;
        System.out.println("Subtotal: $" + totalPrice);
        if (orderQuantity >= tier3Threshold) {
            totalPrice = totalPrice * (1 - tier3Discount / 100.0);
            System.out.println("Tier 3 Discount Applied: " + tier3Discount + "%");
        } else if (orderQuantity >= tier2Threshold) {
            totalPrice = totalPrice * (1 - tier2Discount / 100.0);
            System.out.println("Tier 2 Discount Applied: " + tier2Discount + "%");
        } else if (orderQuantity >= tier1Threshold) {
            totalPrice = totalPrice * (1 - tier1Discount / 100.0);
            System.out.println("Tier 1 Discount Applied: " + tier1Discount + "%");
        }
        System.out.println("Final Total: $" + totalPrice);
    }

    public void auditAndReconcileMultiplePaymentMethods(String method1, double amount1, String method2, double amount2, String method3, double amount3, String reconciliationDate, boolean balanced) {
        System.out.println("Auditing payment methods for: " + reconciliationDate);
        System.out.println("Method 1 (" + method1 + "): $" + amount1);
        System.out.println("Method 2 (" + method2 + "): $" + amount2);
        System.out.println("Method 3 (" + method3 + "): $" + amount3);
        double totalAmount = amount1 + amount2 + amount3;
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Balanced: " + balanced);
        if (!balanced) {
            System.out.println("ALERT: Payment reconciliation discrepancy detected!");
        }
        auditLog.add("Reconciliation: " + reconciliationDate + " - " + totalAmount);
    }

    private java.util.Map<String, String> complianceChecklist = new java.util.HashMap<>();
    private java.util.List<String> auditTrail = new java.util.ArrayList<>();

    public void executeComplianceCheckAndReport(String checkDate, boolean kycCompleted, boolean amlCompleted, boolean fatcaCompleted, boolean gdprCompleted, boolean pciCompleted, String complianceOfficer, String approvalStatus) {
        System.out.println("Executing compliance check for: " + checkDate);
        System.out.println("KYC Completed: " + kycCompleted);
        System.out.println("AML Completed: " + amlCompleted);
        System.out.println("FATCA Completed: " + fatcaCompleted);
        System.out.println("GDPR Completed: " + gdprCompleted);
        System.out.println("PCI Completed: " + pciCompleted);
        System.out.println("Compliance Officer: " + complianceOfficer);
        complianceChecklist.put("KYC", String.valueOf(kycCompleted));
        complianceChecklist.put("AML", String.valueOf(amlCompleted));
        complianceChecklist.put("FATCA", String.valueOf(fatcaCompleted));
        complianceChecklist.put("GDPR", String.valueOf(gdprCompleted));
        complianceChecklist.put("PCI", String.valueOf(pciCompleted));
        System.out.println("Approval Status: " + approvalStatus);
        auditTrail.add(checkDate + ": " + approvalStatus);
    }

    public void handleComplexOrderManagementWorkflow(String orderId, String customerId, String productItems, int quantity, double totalAmount, String shippingAddress, String billingAddress, boolean expressShipping, String trackingPreference) {
        System.out.println("Processing complex order: " + orderId);
        System.out.println("Customer: " + customerId);
        System.out.println("Products: " + productItems);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: $" + totalAmount);
        System.out.println("Shipping Address: " + shippingAddress);
        System.out.println("Billing Address: " + billingAddress);
        System.out.println("Express Shipping: " + expressShipping);
        System.out.println("Tracking Preference: " + trackingPreference);
        if (expressShipping) {
            double totalWithExpedite = totalAmount * 1.15;
            System.out.println("Expedited Total: $" + totalWithExpedite);
        }
        this.takeOrder(productItems);
        this.takeOrder(productItems);
    }

    public void processMonthlyRevenueReconciliationAndForecasting(String month, String year, double projectedRevenue, double actualRevenue, double expensesBudget, double actualExpenses, double profitMargin, boolean meetsTarget, String forecastForNextMonth) {
        System.out.println("\n=== Monthly Revenue Reconciliation ===");
        System.out.println("Period: " + month + "/" + year);
        System.out.println("Projected Revenue: $" + projectedRevenue);
        System.out.println("Actual Revenue: $" + actualRevenue);
        double variancePercent = ((actualRevenue - projectedRevenue) / projectedRevenue) * 100;
        System.out.println("Variance: " + variancePercent + "%");
        System.out.println("Expenses Budget: $" + expensesBudget);
        System.out.println("Actual Expenses: $" + actualExpenses);
        System.out.println("Profit Margin: " + profitMargin + "%");
        System.out.println("Meets Target: " + meetsTarget);
        System.out.println("Next Month Forecast: " + forecastForNextMonth);
        settlementRecords.add("Month " + month + ": Revenue=$" + actualRevenue + ", Expenses=$" + actualExpenses);
    }

    public void initializeCashierSessionAndValidateFunds(String cashierId, String sessionId, double expectedOpeningBalance, double actualOpeningBalance, boolean balanceVerified, String shiftType, String supervisor) {
        System.out.println("Initializing cashier session: " + sessionId);
        System.out.println("Cashier: " + cashierId);
        System.out.println("Expected Opening: $" + expectedOpeningBalance);
        System.out.println("Actual Opening: $" + actualOpeningBalance);
        if (expectedOpeningBalance != actualOpeningBalance) {
            System.out.println("WARNING: Opening balance discrepancy detected!");
        }
        System.out.println("Verified: " + balanceVerified);
        System.out.println("Shift Type: " + shiftType);
        System.out.println("Supervisor: " + supervisor);
        auditTrail.add("Session " + sessionId + " started by " + cashierId);
    }
}
