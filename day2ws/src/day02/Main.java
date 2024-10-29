package day02;
public class Main {
    public static void main(String[] args) {
        // Create an instance of BankAccount
        BankAccount account = new BankAccount("Alice");
        account.deposit(100);
        
        // Display account balance
        System.out.println("Account Balance: " + account.getAccountBalance());
        
        // Create an instance of FixedDepositAccount
        FixedDepositAccount fixedAccount = new FixedDepositAccount("Bob", 1000);
        System.out.println("Fixed Account Balance with Interest: " + fixedAccount.getAccountBalance());
    }
}