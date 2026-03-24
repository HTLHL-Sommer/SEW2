package at.htlhl.sew2.exceptions;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class ExceptionsDemo {
    void main() {
        int a = 2;
        int b = 0;
        
        try {
            IO.println(a / b);
        } catch (ArithmeticException aex) {
            IO.println("Falsche Eingabe!");
            IO.println("Fehlermeldung: " + aex.getLocalizedMessage());
        }
        Score score = new Score("score.txt");

        try {
            score.readScore();
        } catch (NoSuchFileException nsfex) {
            IO.println(String.format("Datei %s nicht gefunden!", score.getFilename()));
        } catch (IOException ioex) {
            ioex.printStackTrace();
        } finally {
            IO.println("Score gesetzt.");
        }


        IO.println(String.format("Current score %d", score.getCurrentScore()));

        try {
            score.setCurrentScore(-10);
        } catch (IllegalArgumentException iaex) {
            IO.println("Expection" + iaex.getLocalizedMessage());
        }
        IO.println(String.format("Current score %d", score.getCurrentScore()));
    }
}
