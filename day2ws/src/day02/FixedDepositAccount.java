package day02;

public class FixedDepositAccount extends BankAccount {
    private float interest = 3; // Default interest
    private int duration = 6; // Default duration
    private boolean interestSet = false; // Flag for interest being set
    private boolean durationSet = false; // Flag for duration being set

    public FixedDepositAccount(String name, int i) {
        super(name, i);
    }

    public FixedDepositAccount(String name, Float balance, Float interest) {
        super(name, balance);
        this.interest = interest; // Set interest
    }

    public FixedDepositAccount(String name, Float balance, Float interest, Integer duration) {
        super(name, balance);
        this.interest = interest; // Set interest
        this.duration = duration; // Set duration
    }

    @Override
    public void deposit(float amount) {
        // No operation
    }

    @Override
    public void withdraw(float amount) {
        // No operation
    }

    @Override
    public float getAccountBalance() {
        return super.getAccountBalance() + interest; // Return balance plus interest
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        if (interestSet) {
            throw new IllegalArgumentException("Interest can only be set once.");
        }
        this.interest = interest;
        interestSet = true;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (durationSet) {
            throw new IllegalArgumentException("Duration can only be set once.");
        }
        this.duration = duration;
        durationSet = true;
    }
}
