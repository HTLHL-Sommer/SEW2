package at.htlhl.sew2.oop.bicycle;

public class Bicycle implements Comparable<Bicycle> {
    private String brand;
    private BicycleType type;
    private double mileage;

    private static boolean sortByBrand = false;
    private static boolean shortOutput = true;

    public Bicycle(String brand, BicycleType type, double mileage) {
        this.brand = brand;
        this.type = type;
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Bicycle)) return false;
        Bicycle oth = (Bicycle) obj;
        return this.brand.equals(oth.brand) && this.type == oth.type && this.mileage == oth.mileage;
    }

    @Override
    public int compareTo(Bicycle oth) {
        if (sortByBrand) return this.brand.compareTo(oth.brand);
        return Double.compare(this.mileage, oth.mileage);
    }

    @Override
    public String toString() {
        if (shortOutput) return String.format("Brand: %s (%f)", this.brand, this.mileage);
        return String.format("Brand: %s, Milage: %f, BicycleType: %s", this.brand, this.mileage, this.type);
    }

    public static void setShortOutput(boolean state) {
        shortOutput = state;
    }
}
