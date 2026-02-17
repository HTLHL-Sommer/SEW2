package at.htlhl.sew2.array2d.classroom;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    void main() throws IOException {
        ClassRoom classRoom = new ClassRoom(3, 8);

        readStudentsFromFile(classRoom);

        classRoom.assignSeat(classRoom.findStudentAtIndex(20), 1, 5);

        classRoom.assignSeat(classRoom.findStudentAtIndex(15), 0, 0);
        classRoom.assignSeat(classRoom.findStudentAtIndex(1), 0, 1);
        classRoom.assignSeat(classRoom.findStudentAtIndex(23), 0, 2);

        classRoom.assignSeat(classRoom.findStudentAtIndex(5), 2, 5);
        classRoom.assignSeat(classRoom.findStudentAtIndex(18), 2, 6);

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
