public class Drink {
    private String name;
    private double price;
    private double unusedPriceCopy = 0.0; // unused

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
        this.unusedPriceCopy = price; // redundant assignment
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // unnötiger doppelter Getter
    public double price() {
        return price;
    }
}
