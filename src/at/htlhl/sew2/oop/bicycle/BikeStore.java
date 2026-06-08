package at.htlhl.sew2.oop.bicycle;

public class BikeStore {
    static void main() {
        Bicycle b1 = new Bicycle("Cube", BicycleType.MTB, 1200);
        Bicycle b2 = new Bicycle("KTM", BicycleType.ROAD, 800);

        boolean result = b1.equals(b2);

        IO.println(b1.toString());
        Bicycle.setShortOutput(false);
        IO.println(b1.toString());
    }
}
