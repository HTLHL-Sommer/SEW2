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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Fuel)) return false;
        Fuel oth = (Fuel) obj;
        return this.name.equals(oth.name) && this.price == oth.price;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(this.name, this.price);
    }
}
