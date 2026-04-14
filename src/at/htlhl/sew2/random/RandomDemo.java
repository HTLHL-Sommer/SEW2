package at.htlhl.sew2.random;

import java.util.Random;

public class RandomDemo {
    void main() {
        IO.println("Einfache Zufallszahlen (ganzzahlig) mit der Klasse Random.");
        Random random = new Random();

        // Zufallszahl im Zahlenraum von int
        int number1 = random.nextInt();
        IO.println("Number1: " + number1);
        IO.println(String.format("Kleinste Zahl: %d, größte Zahl: %d", Integer.MIN_VALUE, Integer.MAX_VALUE));

        // Zufallszahl im Zahlenraum 0 bis obere Grenze
        int number2 = random.nextInt(5);
        IO.println("Number2: " + number2);

        // Zwei Varianten für Zufallszahl in einem definierten Zahlenbereich
        int start = 20;
        int end = 50;
        int number3 = random.nextInt(end - start + 1) + start;
        IO.println("Number3: " + number3);

        int number4 = random.nextInt(start, end + 1);
        IO.println("Number4: " + number4);
    }
}
