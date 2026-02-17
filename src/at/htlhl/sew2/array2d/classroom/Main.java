package at.htlhl.sew2.array2d.classroom;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    void main() throws IOException {
        ClassRoom classRoom = new ClassRoom(3, 8);

        readStudentsFromFile(classRoom);

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
