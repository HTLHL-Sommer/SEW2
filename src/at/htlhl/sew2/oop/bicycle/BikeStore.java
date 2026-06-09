package at.htlhl.sew2.oop.bicycle;

public class BikeStore {
    static void main() {
        Bicycle b1 = new Bicycle("Cube", BicycleType.MTB, 1200);
        Bicycle b2 = new Bicycle("KTM", BicycleType.ROAD, 800);
        Bicycle b3 = new Bicycle("2", BicycleType.ROAD, 2000);
        Bicycle b4 = new Bicycle("7", BicycleType.ROAD, 200);
        Bicycle b5 = new Bicycle("1", BicycleType.ROAD, 100);

        Bicycle[] bikes = {b1, b2, b3, b4, b5};

        sortBikes(bikes);
        for (int i = 0; i < bikes.length; i++) {
            IO.println(bikes[i].toString());
        }
    }

    private static void switchIntArrayValues(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void sortInteger(int[] array) {
        boolean switched;
        for (int x = 1; x < array.length; x++) {
            switched = false;
            for (int i = 0; i < array.length - x; i++) {
                if (array[i] > array[i + 1]) {
                    switchIntArrayValues(array, i, i + 1);
                    switched = true;
                }
            }
            if (!switched) break;
        }
    }

    private static void switchBicycleArrayValues(Bicycle[] array, int index1, int index2) {
        Bicycle temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void sortBikes(Bicycle[] array) {
        boolean switched;
        for (int x = 1; x < array.length; x++) {
            switched = false;
            for (int i = 0; i < array.length - x; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    switchBicycleArrayValues(array, i, i + 1);
                    switched = true;
                }
            }
            if (!switched) break;
        }
    }
}
