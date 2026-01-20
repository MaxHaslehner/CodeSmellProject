public class Pizza {
    private final String name;
    private final double price;
    private String unusedNote = "note"; // unused field

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String s = "Pizza: " + name + " (€" + price + ")";
        // duplizierte Zuweisung als Smell
        if (price > 0) {
            s = "Pizza: " + name + " (€" + price + ")";
        } else {
            s = "Pizza: " + name + " (free)";
        }
        return s;
    }
}
