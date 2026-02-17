package at.htlhl.sew2.array2d.classroom;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
   TODO 1:
   Prompt: "Erstelle eine csv Datei, welche 24 Schüler und Schülerinnen enthält.
   Die Werte pro Schüler bzw. Schülerin sind Katalognummer, Vorname, Nachname, Gender (M, F oder D) und
   das Geburtsdatum (zweite Hälfte 2009 und erste Hälfte 2010) im Format yyyy-MM-dd.
   Die Werte sollen durch Strichpunkte getrennt sein und zum Download bereitgestellt werden.
   Sortiere die Einträge zuerst nach dem Nachnamen, wenn die Nachnamen gleich sind
   dann zusätzlich nach dem Vornamen und wenn die Vornamen auch gleich sind auch
   noch nach dem Geburtsdatum."

   Speichere diese csv-Datei im Ordner von SeasonProject ab.

   Kopiere den Namen mit deiner Katalognummer ans Ende und passe die Katalognummer von diesem Eintrag
   an (= Katalognummer 25).
 */

public class Main {
    void main() throws IOException {
        ClassRoom classRoom = new ClassRoom(3, 8);

        readStudentsFromFile(classRoom);

        // TODO 2: Weise dem Namen mit deiner Katalognummer einen Platz in der 2. Reihe zu
        //         Achtung: Hier muss der Indexwert verwendet werden, welcher Katalognummer - 1 ist.
        classRoom.assignSeat(classRoom.findStudentAtIndex(20), 1, 5);

        // TODO 3: Weise weiteren zwei Namen einen Platz in der ersten Reihe zu und
        //         zwei anderen Namen einen Platz in der dritten Reihe.

        classRoom.showSeats();
    }

    private static void readStudentsFromFile(ClassRoom classRoom) throws IOException {
        String fileName = IO.readln("Welche Schülerliste willst du einlesen? ");
        for (String line: Files.readAllLines(Paths.get(fileName))) {
            // wenn die Datei "korrupte" Daten enthält, dann wird das Programm abgebrochen!
            classRoom.addStudent(Student.valueOf(line));
        }
    }
}
