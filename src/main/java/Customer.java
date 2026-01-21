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

    private java.util.Map<String, Integer> ratingHistory = new java.util.HashMap<>();
    private java.util.List<String> reviewNotes = new java.util.ArrayList<>();

    public void submitMultipleRatings(String category1, int rating1, String category2, int rating2, String category3, int rating3, String category4, int rating4) {
        System.out.println("Customer " + firstName + " submitting ratings");
        ratingHistory.put(category1, rating1);
        ratingHistory.put(category2, rating2);
        ratingHistory.put(category3, rating3);
        ratingHistory.put(category4, rating4);
        System.out.println(category1 + ": " + rating1);
        System.out.println(category2 + ": " + rating2);
        System.out.println(category3 + ": " + rating3);
        System.out.println(category4 + ": " + rating4);
        this.complain("Ratings submitted");
    }

    public void trackOrderProgressAndNotify(String orderId, String status1, String status2, String status3, String status4, boolean sendNotifications) {
        System.out.println("Tracking order: " + orderId);
        System.out.println("Status 1: " + status1);
        reviewNotes.add(status1);
        System.out.println("Status 2: " + status2);
        reviewNotes.add(status2);
        System.out.println("Status 3: " + status3);
        reviewNotes.add(status3);
        System.out.println("Status 4: " + status4);
        reviewNotes.add(status4);
        if (sendNotifications) {
            this.complain("Status update: " + status1);
            this.complain("Status update: " + status2);
            this.complain("Status update: " + status3);
        }
    }

    public void recordPurchasePreferencesAndBehavior(String preference1, String preference2, String preference3, String frequency, String averageSpend, String preferredTime) {
        System.out.println("Recording purchase behavior for: " + firstName);
        preferenceList.add(preference1);
        preferenceList.add(preference2);
        preferenceList.add(preference3);
        System.out.println("Preference 1: " + preference1);
        System.out.println("Preference 2: " + preference2);
        System.out.println("Preference 3: " + preference3);
        System.out.println("Purchase Frequency: " + frequency);
        System.out.println("Average Spend: " + averageSpend);
        System.out.println("Preferred Time: " + preferredTime);
        this.visitCount++;
        for (String pref : preferenceList) {
            System.out.println("  - " + pref);
        }
    }

    public void generateComprehensiveCustomerProfile() {
        System.out.println("\n=== Customer Profile for " + firstName + " " + lastName + " ===");
        System.out.println("Contact: " + email + " | " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Loyalty Points: " + loyaltyPoints);
        System.out.println("Visit Count: " + visitCount);
        System.out.println("Ratings Submitted: " + ratingHistory.size());
        for (String category : ratingHistory.keySet()) {
            System.out.println("  " + category + ": " + ratingHistory.get(category));
        }
        System.out.println("Order History: " + orderHistory.size() + " orders");
        System.out.println("Complaint History: " + complaintHistory.size() + " complaints");
        System.out.println("Review Notes: " + reviewNotes.size() + " notes");
    }

    private java.util.Map<String, Double> subscriptionPlans = new java.util.HashMap<>();
    private java.util.List<String> subscriptionHistory = new java.util.ArrayList<>();

    public void enrollInSubscriptionPlans(String plan1, double cost1, String plan2, double cost2, String plan3, double cost3, boolean autoRenew) {
        System.out.println("Enrolling customer " + firstName + " in subscription plans");
        subscriptionPlans.put(plan1, cost1);
        subscriptionPlans.put(plan2, cost2);
        subscriptionPlans.put(plan3, cost3);
        subscriptionHistory.add(plan1);
        subscriptionHistory.add(plan2);
        subscriptionHistory.add(plan3);
        System.out.println("Plan 1: " + plan1 + " - Cost: " + cost1);
        System.out.println("Plan 2: " + plan2 + " - Cost: " + cost2);
        System.out.println("Plan 3: " + plan3 + " - Cost: " + cost3);
        System.out.println("Auto-Renew: " + autoRenew);
        this.loyaltyPoints += 50;
    }

    public void analyzeSubscriptionUsageAndValue(String timeframe, String mostUsedFeature, String leastUsedFeature, boolean isActive) {
        System.out.println("Analyzing subscription usage for: " + firstName);
        System.out.println("Timeframe: " + timeframe);
        System.out.println("Most Used Feature: " + mostUsedFeature);
        System.out.println("Least Used Feature: " + leastUsedFeature);
        System.out.println("Subscription Active: " + isActive);
        double totalSubscriptionCost = 0;
        for (Double cost : subscriptionPlans.values()) {
            totalSubscriptionCost += cost;
        }
        System.out.println("Total Subscription Cost: " + totalSubscriptionCost);
        for (String plan : subscriptionHistory) {
            System.out.println("  - " + plan);
        }
    }

    private java.util.List<String> notificationPreferences = new java.util.ArrayList<>();
    private java.util.Map<String, Boolean> communicationChannels = new java.util.HashMap<>();

    public void configureNotificationSettings(boolean emailNotifications, boolean smsNotifications, boolean pushNotifications, boolean phoneNotifications, String notificationFrequency, String quietHoursStart, String quietHoursEnd) {
        System.out.println("Configuring notification settings for: " + firstName);
        communicationChannels.put("Email", emailNotifications);
        communicationChannels.put("SMS", smsNotifications);
        communicationChannels.put("Push", pushNotifications);
        communicationChannels.put("Phone", phoneNotifications);
        System.out.println("Email Notifications: " + emailNotifications);
        System.out.println("SMS Notifications: " + smsNotifications);
        System.out.println("Push Notifications: " + pushNotifications);
        System.out.println("Phone Notifications: " + phoneNotifications);
        System.out.println("Notification Frequency: " + notificationFrequency);
        System.out.println("Quiet Hours: " + quietHoursStart + " - " + quietHoursEnd);
        notificationPreferences.add("Frequency: " + notificationFrequency);
        notificationPreferences.add("Quiet: " + quietHoursStart + "-" + quietHoursEnd);
    }

    public void submitDetailedProductReview(String productName, int rating, String reviewText, String pros, String cons, boolean wouldRecommend, String reviewTitle) {
        System.out.println("Product Review Submission for: " + firstName);
        System.out.println("Product: " + productName);
        System.out.println("Rating: " + rating);
        System.out.println("Review Title: " + reviewTitle);
        System.out.println("Review Text: " + reviewText);
        System.out.println("Pros: " + pros);
        System.out.println("Cons: " + cons);
        System.out.println("Would Recommend: " + wouldRecommend);
        this.complain(productName);
        this.complain(productName);
        reviewNotes.add(productName + ": " + reviewTitle);
        reviewNotes.add("Rating: " + rating);
        ratingHistory.put(productName, rating);
    }

    public void generateBehavioralInsightsReport() {
        System.out.println("\n=== Behavioral Insights for " + firstName + " ===");
        System.out.println("Total Loyalty Points: " + loyaltyPoints);
        System.out.println("Total Orders: " + orderHistory.size());
        System.out.println("Total Complaints: " + complaintHistory.size());
        System.out.println("Communication Channels Enabled:");
        for (String channel : communicationChannels.keySet()) {
            System.out.println("  " + channel + ": " + communicationChannels.get(channel));
        }
        System.out.println("Notification Preferences: " + notificationPreferences.size());
        for (String pref : notificationPreferences) {
            System.out.println("  - " + pref);
        }
        System.out.println("Preferences: " + preferenceList.size());
        for (int i = 0; i < preferenceList.size(); i++) {
            if (i < spendingHistory.size()) {
                System.out.println("  " + (i+1) + ". " + preferenceList.get(i) + " ($" + spendingHistory.get(i) + ")");
            }
        }
        double avgSpending = 0;
        if (spendingHistory.size() > 0) {
            double totalSpending = 0;
            for (Double spent : spendingHistory) {
                totalSpending += spent;
            }
            avgSpending = totalSpending / spendingHistory.size();
        }
        System.out.println("Average Spending: $" + avgSpending);
    }

    private java.util.Map<String, String> referralData = new java.util.HashMap<>();
    private java.util.List<String> referralHistory = new java.util.ArrayList<>();

    public void submitReferralAndTrackRewards(String referralsName1, String referralsEmail1, String referralsName2, String referralsEmail2, String referralsName3, String referralsEmail3, String referralCampaign) {
        System.out.println("Submitting referrals for: " + firstName);
        referralData.put(referralsName1, referralsEmail1);
        referralData.put(referralsName2, referralsEmail2);
        referralData.put(referralsName3, referralsEmail3);
        referralHistory.add(referralsName1);
        referralHistory.add(referralsName2);
        referralHistory.add(referralsName3);
        System.out.println("Referral 1: " + referralsName1 + " (" + referralsEmail1 + ")");
        System.out.println("Referral 2: " + referralsName2 + " (" + referralsEmail2 + ")");
        System.out.println("Referral 3: " + referralsName3 + " (" + referralsEmail3 + ")");
        System.out.println("Campaign: " + referralCampaign);
        this.loyaltyPoints += 25;
        System.out.println("Referral bonus: 25 loyalty points awarded");
    }

    public void updatePrivacyAndDataSharingPreferences(boolean shareWithPartners, boolean shareWithAdvertisers, boolean allowAnalytics, boolean allowProfiling, boolean allowCrossMarketing, String dataRetentionPeriod, String gdprStatus) {
        System.out.println("Updating privacy preferences for: " + firstName);
        System.out.println("Share with Partners: " + shareWithPartners);
        System.out.println("Share with Advertisers: " + shareWithAdvertisers);
        System.out.println("Allow Analytics: " + allowAnalytics);
        System.out.println("Allow Profiling: " + allowProfiling);
        System.out.println("Allow Cross-Marketing: " + allowCrossMarketing);
        System.out.println("Data Retention: " + dataRetentionPeriod);
        System.out.println("GDPR Status: " + gdprStatus);
        notificationPreferences.add("Privacy updated");
        this.complain("Privacy settings changed");
    }

    public void initiateLoyaltyTierUpgradeProcess(String currentTier, String targetTier, int pointsRequired, int pointsHave, String eligibilityStatus, boolean qualifies, String nextBenefits) {
        System.out.println("Initiating loyalty tier upgrade for: " + firstName);
        System.out.println("Current Tier: " + currentTier);
        System.out.println("Target Tier: " + targetTier);
        System.out.println("Points Required: " + pointsRequired);
        System.out.println("Points Have: " + pointsHave);
        System.out.println("Eligibility: " + eligibilityStatus);
        System.out.println("Qualifies: " + qualifies);
        if (qualifies) {
            System.out.println("Tier Upgrade Processing...");
            System.out.println("New Benefits: " + nextBenefits);
            this.loyaltyPoints = 0;
        } else {
            int pointsNeeded = pointsRequired - pointsHave;
            System.out.println("Points needed for upgrade: " + pointsNeeded);
        }
    }

    public void generateComprehensiveCustomerAnalyticsReport() {
        System.out.println("\n=== Comprehensive Customer Analytics for " + firstName + " ===");
        System.out.println("Customer ID: Generated from email hash");
        System.out.println("Registration Date: Not stored");
        System.out.println("Loyalty Points: " + loyaltyPoints);
        System.out.println("Total Orders: " + orderHistory.size());
        System.out.println("Total Complaints: " + complaintHistory.size());
        System.out.println("Average Order Value: $" + (spendingHistory.size() > 0 ? spendingHistory.stream().mapToDouble(Double::doubleValue).average().orElse(0) : 0));
        System.out.println("Referrals Made: " + referralHistory.size());
        System.out.println("Subscription Plans: " + subscriptionPlans.size());
        System.out.println("Communication Preferences:");
        for (String pref : notificationPreferences) {
            System.out.println("  - " + pref);
        }
        System.out.println("Behavior Profile: Generated from order patterns");
        for (int i = 0; i < preferenceList.size(); i++) {
            System.out.println("  Preference " + (i+1) + ": " + preferenceList.get(i));
        }
    }

    private java.util.Map<String, String> customizationOptions = new java.util.HashMap<>();
    private java.util.List<String> orderCustomizations = new java.util.ArrayList<>();

    public void configureAdvancedOrderCustomizations(String crustType, String sauceType, String cheeseAmount, String toppingSelection, String bakedGoodsAddOn, String drinkSelection, String dessertsSelection, String specialRequests) {
        System.out.println("Configuring advanced order customizations for: " + firstName);
        customizationOptions.put("Crust", crustType);
        customizationOptions.put("Sauce", sauceType);
        customizationOptions.put("Cheese", cheeseAmount);
        customizationOptions.put("Toppings", toppingSelection);
        customizationOptions.put("BakedGoods", bakedGoodsAddOn);
        customizationOptions.put("Drink", drinkSelection);
        customizationOptions.put("Desserts", dessertsSelection);
        System.out.println("Crust: " + crustType);
        System.out.println("Sauce: " + sauceType);
        System.out.println("Cheese: " + cheeseAmount);
        System.out.println("Toppings: " + toppingSelection);
        System.out.println("Add-ons: " + bakedGoodsAddOn);
        System.out.println("Drink: " + drinkSelection);
        System.out.println("Desserts: " + dessertsSelection);
        System.out.println("Special Requests: " + specialRequests);
        orderCustomizations.add(crustType + "-" + sauceType + "-" + toppingSelection);
    }

    public void submitLongDetailedSurveyResponse(String q1Response, String q2Response, String q3Response, String q4Response, String q5Response, String q6Response, int overallRating, String additionalComments) {
        System.out.println("Survey Response from: " + firstName);
        System.out.println("Q1: " + q1Response);
        System.out.println("Q2: " + q2Response);
        System.out.println("Q3: " + q3Response);
        System.out.println("Q4: " + q4Response);
        System.out.println("Q5: " + q5Response);
        System.out.println("Q6: " + q6Response);
        System.out.println("Overall Rating: " + overallRating);
        System.out.println("Additional Comments: " + additionalComments);
        reviewNotes.add("Q1: " + q1Response);
        reviewNotes.add("Q2: " + q2Response);
        reviewNotes.add("Rating: " + overallRating);
        ratingHistory.put("Survey", overallRating);
        this.complain("Survey submitted");
    }

    public void trackOrderDeliveryAndFeedback(String orderId, String deliveryTime, String carrierName, String estimatedDeliveryWindow, boolean deliveredOnTime, String packageCondition, String deliveryExperience) {
        System.out.println("Tracking delivery for order: " + orderId);
        System.out.println("Delivery Time: " + deliveryTime);
        System.out.println("Carrier: " + carrierName);
        System.out.println("Estimated Window: " + estimatedDeliveryWindow);
        System.out.println("On Time: " + deliveredOnTime);
        System.out.println("Package Condition: " + packageCondition);
        System.out.println("Delivery Experience: " + deliveryExperience);
        orderHistory.add(orderId);
        orderHistory.add(deliveryTime);
        reviewNotes.add("Delivery: " + orderId + " - " + deliveryExperience);
        if (!deliveredOnTime) {
            this.complain("Late delivery for order " + orderId);
        }
    }

    public void generateExtendedCustomerLifetimeValueAnalysis() {
        System.out.println("\n=== Extended Customer Lifetime Value Analysis ===");
        System.out.println("Customer: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Loyalty Points Balance: " + loyaltyPoints);
        System.out.println("Total Orders Placed: " + orderHistory.size());
        System.out.println("Total Order Customizations: " + orderCustomizations.size());
        double totalSpent = 0;
        for (Double amount : spendingHistory) {
            totalSpent += amount;
        }
        System.out.println("Lifetime Spending: $" + totalSpent);
        System.out.println("Average Order Value: $" + (orderHistory.size() > 0 ? totalSpent / orderHistory.size() : 0));
        System.out.println("Subscription Plans: " + subscriptionPlans.size());
        System.out.println("Active Subscriptions: " + subscriptionHistory.size());
        System.out.println("Referrals Generated: " + referralHistory.size());
        System.out.println("Support Complaints: " + complaintHistory.size());
        System.out.println("Customer Customizations:");
        for (String key : customizationOptions.keySet()) {
            System.out.println("  " + key + ": " + customizationOptions.get(key));
        }
    }

    private java.util.Map<String, String> accountSettings = new java.util.HashMap<>();
    private java.util.List<String> securityEvents = new java.util.ArrayList<>();

    public void configureAdvancedAccountSecuritySettings(String passwordPolicy, String twoFactorMethod, boolean biometricEnabled, String securityQuestion1, String securityAnswer1, String securityQuestion2, String securityAnswer2, String deviceFingerprint) {
        System.out.println("Configuring advanced security for: " + firstName);
        accountSettings.put("PasswordPolicy", passwordPolicy);
        accountSettings.put("2FAMethod", twoFactorMethod);
        accountSettings.put("Biometric", String.valueOf(biometricEnabled));
        accountSettings.put("SecurityQ1", securityQuestion1);
        accountSettings.put("DeviceFingerprint", deviceFingerprint);
        System.out.println("Password Policy: " + passwordPolicy);
        System.out.println("2FA Method: " + twoFactorMethod);
        System.out.println("Biometric Enabled: " + biometricEnabled);
        System.out.println("Security Q1: " + securityQuestion1);
        System.out.println("Security Q2: " + securityQuestion2);
        System.out.println("Device Fingerprint: " + deviceFingerprint);
        securityEvents.add("Security config updated");
    }

    public void submitComprehensiveProductFeedbackSurvey(String product1, int rating1, String feedback1, String product2, int rating2, String feedback2, String product3, int rating3, String feedback3, String overallComment) {
        System.out.println("Product Feedback Survey from: " + firstName);
        System.out.println("Product 1: " + product1 + " - Rating: " + rating1);
        System.out.println("Feedback: " + feedback1);
        System.out.println("Product 2: " + product2 + " - Rating: " + rating2);
        System.out.println("Feedback: " + feedback2);
        System.out.println("Product 3: " + product3 + " - Rating: " + rating3);
        System.out.println("Feedback: " + feedback3);
        System.out.println("Overall: " + overallComment);
        ratingHistory.put(product1, rating1);
        ratingHistory.put(product2, rating2);
        ratingHistory.put(product3, rating3);
        reviewNotes.add(feedback1);
        reviewNotes.add(feedback2);
        reviewNotes.add(feedback3);
    }

    public void trackWishlistAndNotifyOnAvailability(String item1, double price1, String item2, double price2, String item3, double price3, String item4, double price4, boolean priceDropNotification, boolean stockNotification) {
        System.out.println("Tracking wishlist for: " + firstName);
        preferenceList.add(item1);
        spendingHistory.add(price1);
        preferenceList.add(item2);
        spendingHistory.add(price2);
        preferenceList.add(item3);
        spendingHistory.add(price3);
        preferenceList.add(item4);
        spendingHistory.add(price4);
        System.out.println("Item 1: " + item1 + " - $" + price1);
        System.out.println("Item 2: " + item2 + " - $" + price2);
        System.out.println("Item 3: " + item3 + " - $" + price3);
        System.out.println("Item 4: " + item4 + " - $" + price4);
        System.out.println("Price Drop Notification: " + priceDropNotification);
        System.out.println("Stock Notification: " + stockNotification);
        notificationPreferences.add("Price Drop: " + priceDropNotification);
        notificationPreferences.add("Stock: " + stockNotification);
    }

    public void generateDetailedMarketingPreferenceProfile() {
        System.out.println("\n=== Marketing Preference Profile ===");
        System.out.println("Customer: " + firstName + " " + lastName);
        System.out.println("Account Settings: " + accountSettings.size() + " items");
        for (String key : accountSettings.keySet()) {
            System.out.println("  " + key + ": " + accountSettings.get(key));
        }
        System.out.println("Security Events: " + securityEvents.size());
        for (String event : securityEvents) {
            System.out.println("  - " + event);
        }
        System.out.println("Wishlist Items: " + preferenceList.size());
        for (int i = 0; i < preferenceList.size(); i++) {
            if (i < spendingHistory.size()) {
                System.out.println("  " + (i+1) + ". " + preferenceList.get(i) + " ($" + spendingHistory.get(i) + ")");
            }
        }
        System.out.println("Product Ratings: " + ratingHistory.size());
        System.out.println("Subscriptions Active: " + subscriptionPlans.size());
        System.out.println("Total Review Notes: " + reviewNotes.size());
        System.out.println("Notification Preferences: " + notificationPreferences.size());
    }

    private java.util.Map<String, String> deviceInformation = new java.util.HashMap<>();
    private java.util.List<String> loginActivity = new java.util.ArrayList<>();

    public void registerAndTrackDeviceForSecureAccess(String deviceId, String deviceName, String deviceType, String osVersion, String browserType, String ipAddress, boolean trustDevice, String locationCountry) {
        System.out.println("Registering device for: " + firstName);
        deviceInformation.put("DeviceID", deviceId);
        deviceInformation.put("DeviceName", deviceName);
        deviceInformation.put("Type", deviceType);
        deviceInformation.put("OS", osVersion);
        deviceInformation.put("Browser", browserType);
        deviceInformation.put("IP", ipAddress);
        deviceInformation.put("Location", locationCountry);
        System.out.println("Device ID: " + deviceId);
        System.out.println("Device Name: " + deviceName);
        System.out.println("Device Type: " + deviceType);
        System.out.println("OS Version: " + osVersion);
        System.out.println("Browser: " + browserType);
        System.out.println("IP Address: " + ipAddress);
        System.out.println("Trust Device: " + trustDevice);
        System.out.println("Location: " + locationCountry);
        loginActivity.add("Device registered: " + deviceId);
    }

    public void submitDetailedAccountActivityReport(String reportDate, int loginCount, int purchaseCount, int reviewCount, int complaintCount, int referralCount, String lastActivityType, String lastActivityDate, String suspiciousActivityDetected) {
        System.out.println("Account Activity Report for: " + firstName);
        System.out.println("Report Date: " + reportDate);
        System.out.println("Login Count: " + loginCount);
        System.out.println("Purchase Count: " + purchaseCount);
        System.out.println("Review Count: " + reviewCount);
        System.out.println("Complaint Count: " + complaintCount);
        System.out.println("Referral Count: " + referralCount);
        System.out.println("Last Activity: " + lastActivityType + " on " + lastActivityDate);
        System.out.println("Suspicious Activity: " + suspiciousActivityDetected);
        loginActivity.add("Activity report: " + reportDate);
        loginActivity.add("Last: " + lastActivityType);
        reviewNotes.add("Activity: " + lastActivityDate);
    }

    public void manageDynamicContentPersonalizationSettings(String recommendationEngine, String contentType1, boolean enable1, String contentType2, boolean enable2, String contentType3, boolean enable3, String personalizationLevel) {
        System.out.println("Configuring content personalization for: " + firstName);
        System.out.println("Recommendation Engine: " + recommendationEngine);
        System.out.println("Content Type 1 (" + contentType1 + "): " + enable1);
        System.out.println("Content Type 2 (" + contentType2 + "): " + enable2);
        System.out.println("Content Type 3 (" + contentType3 + "): " + enable3);
        System.out.println("Personalization Level: " + personalizationLevel);
        accountSettings.put("RecEngine", recommendationEngine);
        accountSettings.put("Content1", String.valueOf(enable1));
        accountSettings.put("Content2", String.valueOf(enable2));
        accountSettings.put("Content3", String.valueOf(enable3));
        accountSettings.put("PersonLevel", personalizationLevel);
        notificationPreferences.add("Personalization updated");
    }

    public void generateFinalComprehensiveCustomerDossier() {
        System.out.println("\n=== Final Comprehensive Customer Dossier ===");
        System.out.println("Customer: " + firstName + " " + lastName);
        System.out.println("Contact: " + email + " | " + phoneNumber);
        System.out.println("Loyalty Points: " + loyaltyPoints);
        System.out.println("Total Orders: " + orderHistory.size());
        System.out.println("Total Spent: " + spendingHistory.stream().mapToDouble(Double::doubleValue).sum());
        System.out.println("Device Information: " + deviceInformation.size() + " devices");
        for (String key : deviceInformation.keySet()) {
            System.out.println("  " + key + ": " + deviceInformation.get(key));
        }
        System.out.println("Login Activity: " + loginActivity.size() + " events");
        for (int i = 0; i < Math.min(5, loginActivity.size()); i++) {
            System.out.println("  " + loginActivity.get(i));
        }
        System.out.println("Account Settings: " + accountSettings.size() + " items");
        System.out.println("Preferences: " + preferenceList.size() + " items");
        System.out.println("Subscriptions: " + subscriptionPlans.size());
        System.out.println("Referrals: " + referralHistory.size());
        System.out.println("Wishlist Items: " + preferenceList.size());
        System.out.println("Product Ratings: " + ratingHistory.size());
        System.out.println("Order Customizations: " + orderCustomizations.size());
        System.out.println("Review Notes: " + reviewNotes.size());
    }

    private java.util.List<String> giftRegistry = new java.util.ArrayList<>();
    private java.util.Map<String, String> specialOccasions = new java.util.HashMap<>();

    public void createAndManageGiftRegistry(String registryName, String occasion, String occasionDate, String guestList, String registryDescription, int estimatedGuests, String shippingPreference, String giftReturnPolicy) {
        System.out.println("Creating gift registry for: " + firstName);
        System.out.println("Registry Name: " + registryName);
        System.out.println("Occasion: " + occasion);
        System.out.println("Occasion Date: " + occasionDate);
        System.out.println("Guest List: " + guestList);
        System.out.println("Description: " + registryDescription);
        System.out.println("Estimated Guests: " + estimatedGuests);
        System.out.println("Shipping Preference: " + shippingPreference);
        System.out.println("Return Policy: " + giftReturnPolicy);
        specialOccasions.put(occasion, occasionDate);
        giftRegistry.add(registryName);
        giftRegistry.add(occasion);
    }

    public void processBulkPreOrdersWithScheduling(String order1Item, int order1Qty, String order1Date, String order2Item, int order2Qty, String order2Date, String order3Item, int order3Qty, String order3Date, String fulfillmentPriority) {
        System.out.println("Processing bulk pre-orders for: " + firstName);
        System.out.println("Order 1: " + order1Qty + "x " + order1Item + " scheduled for " + order1Date);
        System.out.println("Order 2: " + order2Qty + "x " + order2Item + " scheduled for " + order2Date);
        System.out.println("Order 3: " + order3Qty + "x " + order3Item + " scheduled for " + order3Date);
        System.out.println("Fulfillment Priority: " + fulfillmentPriority);
        orderHistory.add(order1Item + ":" + order1Qty);
        orderHistory.add(order2Item + ":" + order2Qty);
        orderHistory.add(order3Item + ":" + order3Qty);
        this.orderPizza(order1Item);
        this.orderPizza(order2Item);
        this.orderPizza(order3Item);
    }

    public void configureAdvancedSocialSharingOptions(String facebookSharing, String instagramSharing, String twitterSharing, String linkedinSharing, String tiktokSharing, String pinterestSharing, boolean autoShare, String shareMessage) {
        System.out.println("Configuring social sharing for: " + firstName);
        System.out.println("Facebook: " + facebookSharing);
        System.out.println("Instagram: " + instagramSharing);
        System.out.println("Twitter: " + twitterSharing);
        System.out.println("LinkedIn: " + linkedinSharing);
        System.out.println("TikTok: " + tiktokSharing);
        System.out.println("Pinterest: " + pinterestSharing);
        System.out.println("Auto-Share: " + autoShare);
        System.out.println("Share Message: " + shareMessage);
        accountSettings.put("FB", facebookSharing);
        accountSettings.put("IG", instagramSharing);
        accountSettings.put("TW", twitterSharing);
        accountSettings.put("LI", linkedinSharing);
        accountSettings.put("TK", tiktokSharing);
        accountSettings.put("PIN", pinterestSharing);
        notificationPreferences.add("Social sharing configured");
    }

    public void generatePredictiveAnalyticsAndInsights() {
        System.out.println("\n=== Predictive Analytics & Insights ===");
        System.out.println("Customer: " + firstName + " " + lastName);
        System.out.println("Predictive Models Generated");
        double avgSpend = 0;
        if (spendingHistory.size() > 0) {
            avgSpend = spendingHistory.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        }
        System.out.println("Average Spend: $" + avgSpend);
        System.out.println("Predicted Annual Value: $" + (avgSpend * 12));
        System.out.println("Churn Risk: " + (complaintHistory.size() > 5 ? "HIGH" : "LOW"));
        System.out.println("Lifetime Value Score: " + (loyaltyPoints / 10.0));
        System.out.println("Recommended Products: ");
        for (int i = 0; i < Math.min(3, preferenceList.size()); i++) {
            System.out.println("  " + (i+1) + ". " + preferenceList.get(i));
        }
        System.out.println("Gift Registry Items: " + giftRegistry.size());
        System.out.println("Special Occasions: " + specialOccasions.size());
        System.out.println("Engagement Level: " + (loginActivity.size() > 10 ? "HIGH" : "MEDIUM"));
    }

    private java.util.Map<String, String> healthAndWellnessPreferences = new java.util.HashMap<>();
    private java.util.List<String> dietaryRestrictions = new java.util.ArrayList<>();

    public void configureHealthAndDietaryPreferences(String dietType, String allergies, String intolerance1, String intolerance2, String intolerance3, boolean vegetarian, boolean vegan, String healthGoals, String supplementNeeds) {
        System.out.println("Setting health preferences for: " + firstName);
        System.out.println("Diet Type: " + dietType);
        System.out.println("Allergies: " + allergies);
        System.out.println("Intolerance 1: " + intolerance1);
        System.out.println("Intolerance 2: " + intolerance2);
        System.out.println("Intolerance 3: " + intolerance3);
        System.out.println("Vegetarian: " + vegetarian);
        System.out.println("Vegan: " + vegan);
        System.out.println("Health Goals: " + healthGoals);
        System.out.println("Supplement Needs: " + supplementNeeds);
        healthAndWellnessPreferences.put("DietType", dietType);
        healthAndWellnessPreferences.put("Allergies", allergies);
        dietaryRestrictions.add(intolerance1);
        dietaryRestrictions.add(intolerance2);
        dietaryRestrictions.add(intolerance3);
    }

    public void processRecurringSubscriptionAndAutoRenew(String subscriptionType, double subscriptionPrice, String billingCycle, String startDate, String renewalDate, boolean autoRenew, String cancellationPolicy, int renewalCount, String paymentMethod) {
        System.out.println("Processing subscription for: " + firstName);
        System.out.println("Type: " + subscriptionType);
        System.out.println("Price: $" + subscriptionPrice);
        System.out.println("Billing Cycle: " + billingCycle);
        System.out.println("Start Date: " + startDate);
        System.out.println("Renewal Date: " + renewalDate);
        System.out.println("Auto-Renew: " + autoRenew);
        System.out.println("Cancellation Policy: " + cancellationPolicy);
        System.out.println("Renewal Count: " + renewalCount);
        System.out.println("Payment Method: " + paymentMethod);
        subscriptionPlans.put(subscriptionType, subscriptionPrice);
        subscriptionHistory.add(subscriptionType);
    }

    public void submitComprehensiveLifestyleAndInterestProfile(String interests1, String interests2, String interests3, String hobbies1, String hobbies2, String travelPreferences, String musicPreferences, String movieGenres, String sportPreferences) {
        System.out.println("Recording lifestyle profile for: " + firstName);
        System.out.println("Interests: " + interests1 + ", " + interests2 + ", " + interests3);
        System.out.println("Hobbies: " + hobbies1 + ", " + hobbies2);
        System.out.println("Travel Preferences: " + travelPreferences);
        System.out.println("Music: " + musicPreferences);
        System.out.println("Movies: " + movieGenres);
        System.out.println("Sports: " + sportPreferences);
        preferenceList.add(interests1);
        preferenceList.add(interests2);
        preferenceList.add(interests3);
        reviewNotes.add("Interests: " + interests1 + ", " + hobbies1);
        this.complain("Profile updated");
    }

    public void generateComprehensivePersonalizationAndRecommendationEngine() {
        System.out.println("\n=== Personalization & Recommendation Engine ===");
        System.out.println("Customer Profile: " + firstName + " " + lastName);
        System.out.println("Total Loyalty Points: " + loyaltyPoints);
        System.out.println("Lifetime Value: $" + (spendingHistory.size() > 0 ? spendingHistory.stream().mapToDouble(Double::doubleValue).sum() : 0));
        System.out.println("Purchase Frequency: " + (orderHistory.size() > 0 ? "High" : "Low"));
        System.out.println("Dietary Restrictions: " + dietaryRestrictions.size());
        for (String restriction : dietaryRestrictions) {
            System.out.println("  - " + restriction);
        }
        System.out.println("Health Preferences: " + healthAndWellnessPreferences.size());
        for (String key : healthAndWellnessPreferences.keySet()) {
            System.out.println("  " + key + ": " + healthAndWellnessPreferences.get(key));
        }
        System.out.println("Subscription Plans: " + subscriptionPlans.size());
        System.out.println("Total Preferences Tracked: " + preferenceList.size());
        System.out.println("Device Profiles: " + deviceInformation.size());
        System.out.println("Recommended Products:");
        for (int i = 0; i < Math.min(5, preferenceList.size()); i++) {
            System.out.println("  " + (i+1) + ". " + preferenceList.get(i));
        }
    }

    private java.util.Map<String, String> emergencyContactInfo = new java.util.HashMap<>();
    private java.util.List<String> dependentsList = new java.util.ArrayList<>();

    public void updateEmergencyContactsAndDependents(String emergencyName1, String emergencyPhone1, String emergencyRelation1, String emergencyName2, String emergencyPhone2, String emergencyRelation2, String dependent1Name, int dependent1Age, String dependent2Name, int dependent2Age) {
        System.out.println("Updating emergency contacts for: " + firstName);
        emergencyContactInfo.put("Name1", emergencyName1);
        emergencyContactInfo.put("Phone1", emergencyPhone1);
        emergencyContactInfo.put("Relation1", emergencyRelation1);
        emergencyContactInfo.put("Name2", emergencyName2);
        emergencyContactInfo.put("Phone2", emergencyPhone2);
        emergencyContactInfo.put("Relation2", emergencyRelation2);
        System.out.println("Emergency Contact 1: " + emergencyName1 + " (" + emergencyRelation1 + ") - " + emergencyPhone1);
        System.out.println("Emergency Contact 2: " + emergencyName2 + " (" + emergencyRelation2 + ") - " + emergencyPhone2);
        dependentsList.add(dependent1Name + " - Age: " + dependent1Age);
        dependentsList.add(dependent2Name + " - Age: " + dependent2Age);
        System.out.println("Dependent 1: " + dependent1Name + " (Age " + dependent1Age + ")");
        System.out.println("Dependent 2: " + dependent2Name + " (Age " + dependent2Age + ")");
    }

    public void processComplexCustomerLoyaltyMigration(String migrationType, String sourceProgram, String targetProgram, int sourcePoints, double conversionRate, boolean transferLocked, String lockupPeriod, String migrationFee, boolean processImmediately) {
        System.out.println("Processing loyalty migration for: " + firstName);
        System.out.println("Migration Type: " + migrationType);
        System.out.println("Source Program: " + sourceProgram);
        System.out.println("Target Program: " + targetProgram);
        System.out.println("Source Points: " + sourcePoints);
        int convertedPoints = (int)(sourcePoints * conversionRate);
        System.out.println("Converted Points: " + convertedPoints);
        System.out.println("Transfer Locked: " + transferLocked);
        if (transferLocked) {
            System.out.println("Lockup Period: " + lockupPeriod);
        }
        System.out.println("Migration Fee: " + migrationFee);
        System.out.println("Process Immediately: " + processImmediately);
        if (processImmediately) {
            loyaltyPoints = convertedPoints;
            System.out.println("Migration completed");
        }
    }

    public void generateFinalizedCustormerInsightReport() {
        System.out.println("\n=== Finalized Customer Insight Report ===");
        System.out.println("Customer Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Loyalty Status: " + (loyaltyPoints > 500 ? "VIP" : "Standard"));
        System.out.println("Total Loyalty Points: " + loyaltyPoints);
        System.out.println("Lifetime Value: $" + spendingHistory.stream().mapToDouble(Double::doubleValue).sum());
        System.out.println("Total Orders: " + orderHistory.size());
        System.out.println("Emergency Contacts: " + emergencyContactInfo.size());
        for (String key : emergencyContactInfo.keySet()) {
            System.out.println("  " + key + ": " + emergencyContactInfo.get(key));
        }
        System.out.println("Dependents: " + dependentsList.size());
        for (String dependent : dependentsList) {
            System.out.println("  - " + dependent);
        }
        System.out.println("Active Subscriptions: " + subscriptionPlans.size());
        System.out.println("Total Preferences: " + preferenceList.size());
        System.out.println("Communication Preferences Configured: " + communicationChannels.size());
        System.out.println("Health Preferences: " + healthAndWellnessPreferences.size());
        System.out.println("Device Profiles: " + deviceInformation.size());
        System.out.println("Account Settings: " + accountSettings.size());
    }

    private java.util.Map<String, String> educationHistory = new java.util.HashMap<>();
    private java.util.List<String> careerMilestones = new java.util.ArrayList<>();

    public void recordEducationalAndProfessionalBackground(String degree1, String institution1, int gradYear1, String degree2, String institution2, int gradYear2, String currentEmployer, String jobTitle, int yearsExperience, String industry) {
        System.out.println("Recording professional background for: " + firstName);
        System.out.println("Degree 1: " + degree1 + " - " + institution1 + " (" + gradYear1 + ")");
        System.out.println("Degree 2: " + degree2 + " - " + institution2 + " (" + gradYear2 + ")");
        educationHistory.put("Degree1", degree1);
        educationHistory.put("Institution1", institution1);
        educationHistory.put("Degree2", degree2);
        educationHistory.put("Institution2", institution2);
        System.out.println("Current Employer: " + currentEmployer);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Years Experience: " + yearsExperience);
        System.out.println("Industry: " + industry);
        careerMilestones.add(jobTitle + " at " + currentEmployer);
        accountSettings.put("Industry", industry);
    }

    public void configureCommunityAndSocialEngagementSettings(String forumParticipation, String communityRole, boolean publicProfile, boolean allowMessaging, boolean shareActivity, String privacyLevel, String contentModeration, String reportingPreference, String engagementLevel) {
        System.out.println("Configuring community settings for: " + firstName);
        System.out.println("Forum Participation: " + forumParticipation);
        System.out.println("Community Role: " + communityRole);
        System.out.println("Public Profile: " + publicProfile);
        System.out.println("Allow Messaging: " + allowMessaging);
        System.out.println("Share Activity: " + shareActivity);
        System.out.println("Privacy Level: " + privacyLevel);
        System.out.println("Content Moderation: " + contentModeration);
        System.out.println("Reporting Preference: " + reportingPreference);
        System.out.println("Engagement Level: " + engagementLevel);
        accountSettings.put("ForumRole", communityRole);
        accountSettings.put("PrivacyLevel", privacyLevel);
        accountSettings.put("EngagementLevel", engagementLevel);
        notificationPreferences.add("Community settings updated");
    }

    public void generateUltimateComprehensiveCustomerMasterProfile() {
        System.out.println("\n=== ULTIMATE COMPREHENSIVE CUSTOMER MASTER PROFILE ===");
        System.out.println("========================================================");
        System.out.println("Personal Information:");
        System.out.println("  Name: " + firstName + " " + lastName);
        System.out.println("  Email: " + email);
        System.out.println("  Phone: " + phoneNumber);
        System.out.println("  Address: " + address);
        System.out.println("\nFinancial Summary:");
        System.out.println("  Loyalty Points: " + loyaltyPoints);
        System.out.println("  Lifetime Spending: $" + spendingHistory.stream().mapToDouble(Double::doubleValue).sum());
        System.out.println("  Average Order Value: $" + (orderHistory.size() > 0 ? spendingHistory.stream().mapToDouble(Double::doubleValue).sum() / orderHistory.size() : 0));
        System.out.println("  Total Orders: " + orderHistory.size());
        System.out.println("\nEducation & Career:");
        for (String key : educationHistory.keySet()) {
            System.out.println("  " + key + ": " + educationHistory.get(key));
        }
        System.out.println("  Career Milestones: " + careerMilestones.size());
        System.out.println("\nPreferences & Settings:");
        System.out.println("  Preferences Tracked: " + preferenceList.size());
        System.out.println("  Health Preferences: " + healthAndWellnessPreferences.size());
        System.out.println("  Dietary Restrictions: " + dietaryRestrictions.size());
        System.out.println("  Account Settings: " + accountSettings.size());
        System.out.println("\nEngagement Metrics:");
        System.out.println("  Login Activity: " + loginActivity.size() + " events");
        System.out.println("  Review Notes: " + reviewNotes.size());
        System.out.println("  Complaints: " + complaintHistory.size());
        System.out.println("  Referrals: " + referralHistory.size());
        System.out.println("\nSubscriptions & Programs:");
        System.out.println("  Active Subscriptions: " + subscriptionPlans.size());
        System.out.println("  Subscription History: " + subscriptionHistory.size());
        System.out.println("  Gift Registry: " + giftRegistry.size());
        System.out.println("\nTechnical Profile:");
        System.out.println("  Device Profiles: " + deviceInformation.size());
        System.out.println("  Communication Channels: " + communicationChannels.size());
        System.out.println("  Notification Preferences: " + notificationPreferences.size());
        System.out.println("========================================================");
    }

    private java.util.Map<String, String> crisisManagementPlan = new java.util.HashMap<>();
    private java.util.List<String> incidentHistory = new java.util.ArrayList<>();

    public void configureCrisisResponseAndEscalation(String planId, String scenarioType, String severityLevel, String primaryContact, String backupContact, String responseWindow, boolean notifyAuthorities, String escalationPath, String customerReassuranceMessage) {
        System.out.println("Configuring crisis response for plan: " + planId);
        crisisManagementPlan.put("Scenario", scenarioType);
        crisisManagementPlan.put("Severity", severityLevel);
        crisisManagementPlan.put("Primary", primaryContact);
        crisisManagementPlan.put("Backup", backupContact);
        crisisManagementPlan.put("Window", responseWindow);
        crisisManagementPlan.put("Escalation", escalationPath);
        System.out.println("Notify Authorities: " + notifyAuthorities);
        System.out.println("Customer Reassurance: " + customerReassuranceMessage);
        incidentHistory.add(planId + ": " + scenarioType + " - " + severityLevel);
    }

    public void runComprehensiveCreditWorthinessSimulation(String incomeBracket, double declaredIncome, double liabilities, double assets, int missedPayments, String creditScoreBand, boolean hasCollateral, String collateralType, String riskAppetite) {
        System.out.println("Running credit worthiness simulation for: " + firstName);
        System.out.println("Income Bracket: " + incomeBracket);
        System.out.println("Declared Income: " + declaredIncome);
        System.out.println("Liabilities: " + liabilities);
        System.out.println("Assets: " + assets);
        System.out.println("Missed Payments: " + missedPayments);
        System.out.println("Credit Score Band: " + creditScoreBand);
        System.out.println("Has Collateral: " + hasCollateral + " - Type: " + collateralType);
        System.out.println("Risk Appetite: " + riskAppetite);
        double netWorth = assets - liabilities;
        System.out.println("Net Worth: " + netWorth);
        if (missedPayments > 3) {
            this.complain("High risk due to missed payments");
        }
    }

    public void generateMega360CustomerHeatmap() {
        System.out.println("\n=== MEGA 360 CUSTOMER HEATMAP ===");
        System.out.println("Incidents tracked: " + incidentHistory.size());
        for (String incident : incidentHistory) {
            System.out.println("  - " + incident);
        }
        System.out.println("Crisis Plans: " + crisisManagementPlan.size());
        System.out.println("Credit Simulations: " + (educationHistory.size() + careerMilestones.size()));
        System.out.println("Risk Signals: " + (complaintHistory.size() + missedComplaintsCounter()));
        System.out.println("Engagement Level: " + (loginActivity.size() > 15 ? "ULTRA" : "NORMAL"));
    }

    private int missedComplaintsCounter() {
        int extra = 0;
        for (String note : reviewNotes) {
            if (note.contains("complaint")) {
                extra++;
            }
        }
        return extra;
    }
}
