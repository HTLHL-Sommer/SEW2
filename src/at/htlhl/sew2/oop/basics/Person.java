package at.htlhl.sew2.oop.basics;

import java.time.LocalDate;

public class Person {
    private final String firstname;
    private final String lastname;
    private final LocalDate dob;
    private final Gender gender;

    public Person(String firstname, String lastname, LocalDate dob, Gender gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.gender = gender;
    }

    public static Person valueOf(String input, String separator) {
        String[] parts = input.split(separator);
        return new Person(parts[0], parts[1], LocalDate.parse(parts[2]), Gender.valueOf(parts[3]));
    }

    public String toString() {
        return String.format("Name: %s %s, Date of Birth: %s, Gender: %s", this.firstname, this.lastname, this.dob.toString(), this.gender);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Gender getGender() {
        return gender;
    }
}