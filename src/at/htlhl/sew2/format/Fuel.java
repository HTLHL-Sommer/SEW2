package at.htlhl.sew2.format;

public class Fuel {
    private final String name;
    private final double price;

    Fuel(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
