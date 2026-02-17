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
        String[] split = input.split(";");
        if (!(split.length == 5)) return null;
        else return new Student(split[1], split[2], split[3].toCharArray()[0], split[4]);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return false;
        if (!(obj instanceof Student)) return false;
        Student k = (Student) obj;
        return this.firstname.equals(k.firstname) && this.lastname.equals(k.lastname) && this.dateOfBirth.equals(k.dateOfBirth);
    }
}
