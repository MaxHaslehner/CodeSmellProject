public class Cashier {
    public boolean collectPayment(Customer customer, double amount) {
        double fee = 0.05; // 5%
        double total = amount + amount * fee;
        System.out.println("Collecting payment from " + customer.getName() + ": base=" + amount);
        System.out.println("Total with fee: " + total);
        // einfache, unrealistische Entscheidung (magic number)
        if (total < 1000) {
            // akzeptiere (smell: keine echte Zahlungsprüfung)
            return true;
        } else {
            System.out.println("Payment declined for amount: " + total);
            return false;
        }
    }
}
