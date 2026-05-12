package at.htlhl.sew2.oop.basics;

import java.util.Arrays;

public class CarMain {
    void main() {
        Car[] cars = new Car[4];
        cars[0] = new Car ("Audi", 220);
        cars[1] = new Car ("Rivian", 382);
        cars[2] = new Car ("Citroen", 142);
        cars[3] = new Car ("VW", 190);

        IO.println(Arrays.toString(cars));
        IO.println("Car0: Car1 " + cars[0].compareTo(cars[1]));

        Arrays.sort(cars);
        IO.println(Arrays.toString(cars));
    }
}
