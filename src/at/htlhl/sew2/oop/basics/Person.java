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
