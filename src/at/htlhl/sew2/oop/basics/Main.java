package at.htlhl.sew2.oop.basics;

import java.time.LocalDate;

public class Main {
    static void main() {
        BankAccount accOfGojko = new BankAccount(123789, AccountType.GIRO, new Person("","", LocalDate.now(),Gender.MALE));
        accOfGojko.deposit(220f);
        System.out.println("Actual balance(Gojko): " + accOfGojko.getBalance());

        BankAccount accOfFlorian = new BankAccount(456000, AccountType.GIRO, new Person("","", LocalDate.now(),Gender.MALE));

        System.out.println("Actual balance(Florian): " + accOfFlorian.getBalance());


        System.out.println();
        System.out.println("Transfer Test");
        BankAccount ba1 = new BankAccount(777777, AccountType.GIRO, new Person("","", LocalDate.now(),Gender.MALE));
        BankAccount ba2 = new BankAccount(555555, AccountType.GIRO, new Person("","", LocalDate.now(),Gender.MALE));

        ba1.transfer(ba2, 100f);
        System.out.println("Balance (ba1): " + ba1.getBalance());
        System.out.println("Balance (ba2): " + ba2.getBalance());

        ba1.transfer(ba2, 500f);
        System.out.println("Balance (ba1): " + ba1.getBalance());
        System.out.println("Balance (ba2): " + ba2.getBalance());
    }
}
