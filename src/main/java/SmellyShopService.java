public class SmellyShopService {
    public void deliverToCustomer(Customer c, Pizza p) {
        // direkter System.out statt eines echten Delivery-Mechanismus
        System.out.println("Delivering " + p.getName() + " to " + c.getName());
        // duplizierte Nachricht
        System.out.println("Delivering " + p.getName() + " to " + c.getName());
    }

    public void handleFailure(String reason) {
        // generische Fehlerbehandlung (smell)
        System.out.println("Failure: " + reason);
        // übertriebene Wiederholung
        System.out.println("Failure logged: " + reason);
    }

    public void logComplaint(Customer c, String text) {
        // schlechte Logging-Implementierung, tiefe Bedingungen
        if (c != null) {
            if (text != null) {
                if (!text.isEmpty()) {
                    System.out.println("Complaint from " + c.getName() + ": " + text);
                } else {
                    System.out.println("Empty complaint");
                }
            } else {
                System.out.println("Null complaint");
            }
        } else {
            System.out.println("Unknown customer complaint");
        }
    }
}
