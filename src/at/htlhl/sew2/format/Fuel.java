package at.htlhl.sew2.format;

public class Fuel {
    private final String name;
    private final double price;

    public Fuel(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public static Fuel valueOf(String input) {
        String[] parts = input.split(";");
        return new Fuel(parts[0], Double.parseDouble(parts[1]));
    }

    @Override
    public String toString() {
        return String.format("Name: %-15s Price: %6.3f €", this.name, this.price);
    }
}
