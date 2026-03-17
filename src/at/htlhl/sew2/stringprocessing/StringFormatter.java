package at.htlhl.sew2.stringprocessing;

import java.util.Locale;

public class StringFormatter {

    void main() {
        importantFormats();
        /*

        String name = "Maxi";
        int age = 5;

        IO.println("Person: " + name + ", " + age + " Jahre.");

        String personFormatted = String.format("Person: %s, %d Jahre.", name, age);
        IO.println(personFormatted);

        IO.println(String.format("Hallo %S", name));

        IO.println(String.format("Hallo %S", name));
        IO.println(String.format("%b", 2==3));
        IO.println(String.format("%B", 2==3));

        IO.println(String.format("%X", 14));

        IO.println(String.format("PI: %f", 3.1415926f));
        IO.println(String.format("PI: %.2f", 3.1415926f));

        IO.println(String.format("%8d", 1234));
        IO.println(String.format("%8d", 12345678));

        IO.println(String.format("%8s", "2AHITS"));

        IO.println(String.format(">%08.2f<", 3.1415926));

        IO.println(String.format(">%08d<", 3)); // mit 0 statt Leerzeichen auffüllen

        IO.println(String.format(">%-8d<", 3)); // linksbündig

        IO.println(String.format("%+d", 3)); // Vorzeichen immer anzeigen

        IO.println(String.format(Locale.GERMANY, "%+d", 3)); // DE Formatierung (3,14)
        IO.println(String.format(Locale.US, "%+d", 3)); // US Formatierung (3.14)
         */
    }

    void importantFormats() {
        IO.println("Ganze Zahlen:");
        IO.println(String.format(Locale.GERMANY, "Zahl: %,9d!", 9_999_999));
        IO.println(String.format("Zahl: %+9d!", 99));
        IO.println(String.format("Zahl: %09d!", -7899));
        IO.println(String.format("Zahl: %09d!", 0));

        IO.println("Texte:");
        IO.println(String.format("Text: %s!", "HaLlO".toUpperCase()));
        IO.println(String.format("Text: %S!", "HaLlO"));
        IO.println(String.format("Text: %10s!", "HaLlO"));
        IO.println(String.format("Text: %10s!", "HaLlOHaLlOHaLlO"));
        IO.println(String.format("Text: %-10s!", "HaLlO2A"));
        IO.println(String.format("Text: %-10s!", "HaLlOHTL"));

        IO.println("3. Fließkommazahlen:");
        IO.println(String.format("Zahl: %.3f!", 99.98));
        IO.println(String.format("Zahl: %10.3f!", 99.98));
        IO.println("Zahl: 1234567890");
        IO.println(String.format("Zahl: %8.3f!", 12399.98));
        IO.println(String.format("Zahl: %8.3f!", 1299.98));
        IO.println(String.format("Zahl: %08.3f!", 99.98));
        IO.println(String.format("Zahl: %+8.3f!", -99.98));
    }
}
