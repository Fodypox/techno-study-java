package javaprojects.ragip;

public class SavingAccount extends Account{
    private double interest;
    public SavingAccount(int a, double interest, Bank bank) {
        super(a);
        this.interest=interest;
        bank.addAccount(this);
    }

    public double getInterest() {
        return interest;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public double getAccountNumber() {
        return super.getAccountNumber();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
