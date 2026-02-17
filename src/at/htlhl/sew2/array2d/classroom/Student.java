package at.htlhl.sew2.array2d.classroom;

import java.time.LocalDate;

public class Student {
    private static int numberOfStudents = 0;
    private final int number;
    private final String firstname;
    private final String lastname;
    private final char gender; // M ... male, F ... female, D ... diverse
    private final LocalDate dateOfBirth;

    public Student(String firstname, String lastname, char gender, String dob) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.dateOfBirth = LocalDate.parse(dob);

        this.number = numberOfStudents + 1;
        numberOfStudents++;
    }

    @Override
    public String toString() {
        return String.format("(%i) %s %s(%c), geboren %s", number, firstname, lastname, gender, dateOfBirth);
    }

    public String getFullName() {
        return String.format("%s %s(%d)", firstname, lastname, number);
    }

    public static Student valueOf(String input) {
        // TODO 5: Implementiere die valueOf() Methode. Der "delimiter" des Input-Strings ist der Strichpunkt.
        //         Achtung: Die Katalognummer wird im Konstruktor vergeben!
        

        return null; // ersetzen!
    }

    @Override
    public boolean equals(Object obj) {
        // TODO 6: Implementiere die equals()-Methode wie im SEW2 Unterricht im 1. Semester gezeigt.
        //         Student:innen sind dann gleich, wenn sowohl Vorname, Nachname und das Geburtdatum gleich sind.
        



        return false; // ersetzen!
    }
}
