package at.htlhl.sew2.array2d.classroom;

import java.util.ArrayList;

public class ClassRoom {
    private final int row;
    private final int col;
    private final Student[][] seats;
    private final ArrayList<Student> students;

    public ClassRoom(int row, int col) {
        this.row = row;
        this.col = col;

        this.seats = new Student[row][col];
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        } else {
            IO.println("Fehler: " + student.getFullName() + " bereits in Klassenliste!");
        }

    }

    public Student findStudentAtIndex(int pos) {
        if (pos < 0 || pos >= students.size()) { return null; }
        return students.get(pos);
    }

    public void assignSeat(Student student, int row, int col) {
        // TODO 9: Implementiere die folgenden "early return" Punkte wie angegeben.
        // 1. Ist der Student in der Klassenliste eingetragen?
        //    Wenn nicht, dann soll der nachfolgende Text auf der Konsole ausgegeben und
        //      die Methode mit return beendet werden.
        //    "Fehler: <full name> gehört nicht zu dieser Klasse"
        



        // 2. Sind die Sitzplatzkooridanten gültig?
        //    Wenn nicht, dann soll der nachfolgende Text auf der Konsole ausgegeben und
        //      die Methode mit return beendet werden.
        //    "Fehler: Ungültige Koordinaten [<row>][<col>]."
        



        // 3. Ist der Sitzplatz verfügbar?
        //    Wenn nicht, dann soll der nachfolgende Text auf der Konsole ausgegeben und
        //      die Methode mit return beendet werden.
        //    "Fehler: Platz [<row>][<col>] bereits durch <full name> besetzt!"
        



        // TODO 10: Weise den übergebenen Studenten dem gewählten Sitzplatz zu.
        

        IO.println(student.getFullName() + " wurde auf [" + row + "][" + col + "] gesetzt.");
    }

    // Hilfsmethode für bessere Lesbarkeit
    private boolean isCoordinateValid(int r, int c) {
        return r >= 0 && r < this.row && c >= 0 && c < this.col;
    }

    public void showSeats() {
        IO.println("\n--- Aktueller Sitzplan ---");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (seats[i][j] == null) {
                    IO.print("[ Leer ] ");
                } else {
                    IO.print("[" + seats[i][j].getFullName() + "] ");
                }
            }
            IO.println();
        }
    }
}