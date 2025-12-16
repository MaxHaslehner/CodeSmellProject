
import java.util.ArrayList;
import java.util.List;

/**
 * This class intentionally violates multiple PMD rules
 * for evaluation and demonstration purposes.
 */
public class SmellyOrderService {

    // PMD: TooManyFields, UnusedPrivateField
    private String serviceName = "OrderService";
    private String environment = "PROD";
    private int maxOrders = 1000;
    private boolean debugMode = false;
    private String unusedConfigValue = "NOT_USED";

    // PMD: AvoidFieldNameMatchingMethodName
    private List<String> orders = new ArrayList<>();

    // PMD: LongMethod, CyclomaticComplexity, CognitiveComplexity
    public void processOrder(String orderType, int quantity, boolean priority, boolean notifyUser) {

        if (orderType == null || orderType.isEmpty()) {
            System.out.println("Invalid order type");
            return;
        }

        if (quantity < 0) {
            System.out.println("Invalid quantity");
            return;
        }

        if (orderType.equals("STANDARD")) {
            if (quantity > 100) {
                System.out.println("Large standard order");
            } else {
                System.out.println("Small standard order");
            }
        } else if (orderType.equals("EXPRESS")) {
            if (priority) {
                System.out.println("Priority express order");
            } else {
                System.out.println("Normal express order");
            }
        } else if (orderType.equals("INTERNATIONAL")) {
            if (quantity > 50 && priority) {
                System.out.println("Priority international order");
            } else if (quantity > 50) {
                System.out.println("Large international order");
            } else {
                System.out.println("Standard international order");
            }
        } else {
            System.out.println("Unknown order type");
        }

        if (notifyUser) {
            System.out.println("User notified");
        }
    }

    // PMD: AvoidDuplicateLiterals, UseStringBufferForStringAppends
    public String buildOrderSummary(String customerName, String product) {
        String result = "";
        result += "Customer: " + customerName + "\n";
        result += "Product: " + product + "\n";
        result += "Status: CREATED\n";
        result += "Status: CREATED\n";
        return result;
    }

    // PMD: GodClass, ExcessiveMethodLength, DataClass
    public void handleEverything(String input) {
        validateInput(input);
        saveOrder(input);
        sendNotification(input);
        logOrder(input);
    }

    // PMD: AvoidUnusedParameters
    private void validateInput(String input) {
        System.out.println("Validating input");
    }

    // PMD: SystemPrintln, AvoidDuplicateLiterals
    private void saveOrder(String input) {
        System.out.println("Saving order");
        System.out.println("Saving order");
    }

    // PMD: BooleanGetMethodName
    public boolean getIsActive() {
        return true;
    }

    // PMD: EmptyCatchBlock
    public void riskyOperation() {
        try {
            int x = 10 / 0;
        } catch (Exception e) {
        }
    }

    // PMD: AvoidDeeplyNestedIfStmts
    public void nestedLogic(int a, int b, int c) {
        if (a > 0) {
            if (b > 0) {
                if (c > 0) {
                    System.out.println("All positive");
                }
            }
        }
    }

    private void sendNotification(String input) {
        System.out.println("Sending notification");
    }

    private void logOrder(String input) {
        System.out.println("Logging order");
    }
}
