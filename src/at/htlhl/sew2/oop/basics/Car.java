package at.htlhl.sew2.oop.basics;

public class Car implements Comparable<Car> {
    private String brand;
    private int maxSpeed;

    public static boolean invertSortOrder = false;

    public Car() {
        this.brand = "Default Brand";
        this.maxSpeed = 0;
    }

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return(String.format("%s: %d", this.brand, this.maxSpeed));
    }

    @Override
    public int compareTo(Car other) {
        int diff = this.brand.compareTo(other.brand);
        if (diff == 0) {
            diff = Integer.compare(this.maxSpeed, other.maxSpeed);
        }

        return diff * (invertSortOrder ? -1 : 1);
    }

    static void main() {
        Car c1 = new Car("Citroen", 1);
        Car c2 = new Car("BMW", 250);
        Car c3 = new Car("Audi", 240);
        Car c4 = new Car("Skoda", 220);

        Car[] myCars = {c1, c2, c3, c4};
        Car[] cars = new Car[4];
        cars[0] = c1;
        cars[1] = c2;
        cars[2] = c3;
        cars[3] = c4;

        float sumMaxSpeed = 0f;
        for (Car item : cars) {
            sumMaxSpeed += item.maxSpeed;
        }
        System.out.println(sumMaxSpeed);
    }
}
