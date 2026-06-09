package at.htlhl.sew2.oop.basics;

public class BankAccount {
    public static final String SEPARATOR = ";";

    private static int currentAccountNumber = 1000;

    private final int id;
    private double balance;
    private AccountType accountType;
    private Person owner;

    public BankAccount(double balance, AccountType accountType, Person owner) {
        this.id = ++currentAccountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.owner = owner;
    }

    public BankAccount(AccountType accountType, Person owner) {
        this(0, accountType, owner);
    }

    public static BankAccount valueOf(String input) {
        return valueOf(input, SEPARATOR);
    }

    public static BankAccount valueOf(String data, String separator) {
        String[] parts = data.split(separator);
        double balance = Double.parseDouble(parts[1]);
        AccountType accountType = AccountType.valueOf(parts[2]);
        Person owner = Person.valueOf(parts[3], separator);
        return new BankAccount(balance, accountType, owner);
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public Person getOwner() {
        return this.owner;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("deposit() could not get executed because of an invalid amount!");
            throw new IllegalArgumentException();
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > this.balance) {
            System.out.println("withdraw() could not get executed because of insufficient funds or invalid amount!");
            return false;
        }
        this.balance -= amount;
        return true;
    }

    public void transfer(BankAccount target, double amount) {
        boolean success = this.withdraw(amount);
        if (success) {
            target.deposit(amount);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" + "id=" + id + ", balance=" + balance + "}";
    }
}