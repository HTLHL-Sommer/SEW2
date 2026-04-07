package at.htlhl.sew2.exceptions;

public class ExceptionSimulator {
    static void main() {
        IO.println(readNumber());
    }

    static int readNumber() {
        String input = IO.readln("Zahl eingeben: ");

        int number = Integer.MIN_VALUE;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException nfex) {
            IO.println("Eingabe nicht parsable!");
        }
        return number;
    }
}
