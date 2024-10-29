package day02;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class BankAccount {
    private final String accountHolderName;
    private final String accountNumber;
    private float accountBalance;
    private List<String> transactions;
    private boolean closed;
    private Date accountCreationDate;
    private Date accountClosingDate;

    // Constructor with account holder's name
    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = generateAccountNumber();
        this.accountBalance = 0;
        this.transactions = new ArrayList<>();
        this.closed = false;
        this.accountCreationDate = new Date();
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public Date getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(Date accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public Date getAccountClosingDate() {
        return accountClosingDate;
    }

    public void setAccountClosingDate(Date accountClosingDate) {
        this.accountClosingDate = accountClosingDate;
    }

    // Constructor with account holder's name and initial balance
    public BankAccount(String accountHolderName, float initialBalance) {
        this(accountHolderName);
        deposit(initialBalance);
    }

    // Method to generate a random account number
    private String generateAccountNumber() {
        Random random = new Random();
        int accountNum = 100000 + random.nextInt(900000); // Generates a number between 100000 and 999999
        return String.valueOf(accountNum);
    }

    // Deposit method
    public void deposit(float amount) {
        if (amount <= 0 || closed) {
            throw new IllegalArgumentException("Invalid deposit amount or account is closed.");
        }
        accountBalance += amount;
        transactions.add("Deposit $" + amount + " at " + new Date());
    }

    // Withdraw method
    public void withdraw(float amount) {
        if (amount <= 0 || closed || amount > accountBalance) {
            throw new IllegalArgumentException("Invalid withdraw amount or account is closed.");
        }
        accountBalance -= amount;
        transactions.add("Withdraw $" + amount + " at " + new Date());
    }

}
