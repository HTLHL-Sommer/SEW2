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
        if (students.contains(student)) {
            IO.println("Fehler: " + student.getFullName() + " bereits in Klassenliste!");
            return;
        }
        students.add(student);
    }

    public Student findStudentAtIndex(int pos) {
        if (pos < 0 || pos >= students.size()) { return null; }
        return students.get(pos);
    }

    public void assignSeat(Student student, int row, int col) {
        if (students.contains(student)) {
            IO.println("Fehler: " + student.getFullName() + " gehört nicht zu dieser Klasse");
            return;
        }

        if (!isCoordinateValid(row, col)) {
            IO.println("Fehler: Ungültige Koordinaten [" + row + "][" + col + "].");
            return;
        }

        if (seats[row][col] != null) {
            // IO.println("Fehler: Platz [" + row + "][" + col + "] bereits durch " + seats[row][col].getFullName() + " besetzt!");
            throw new IllegalArgumentException(student.getFullName() + " gehört nicht zu dieser Klasse");
        }

        seats[row][col] = student;
        

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