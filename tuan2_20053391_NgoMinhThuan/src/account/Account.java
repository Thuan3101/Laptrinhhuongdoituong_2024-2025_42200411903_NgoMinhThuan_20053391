package account;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long accountNumber;
    private String name;
    private double balance;
    private final double RATE = 0.035;

    public Account() {
        this.accountNumber = 999999;
        this.name = "chưa xác định";
        this.balance = 50000;
    }

    public Account(long accountNumber, String name, double balance) {
        if (accountNumber > 0 && !name.isEmpty() && balance >= 50000) {
            this.accountNumber = accountNumber;
            this.name = name;
            this.balance = balance;
        } else {
            this.accountNumber = 999999;
            this.name = "chưa xác định";
            this.balance = 50000;
        }
    }

    public Account(long accountNumber, String name) {
        this(accountNumber, name, 50000);
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount, double fee) {
        if (amount > 0 && amount + fee <= balance) {
            balance -= (amount + fee);
            return true;
        }
        return false;
    }

    public void addInterest() {
        balance += balance * RATE;
    }

    public boolean transfer(Account acc2, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            acc2.deposit(amount);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        Locale locale = new Locale("vi", "VN");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        return "Số tài khoản: " + accountNumber + "\nTên tài khoản: " + name + "\nSố dư: " + formatter.format(balance);
    }
}

