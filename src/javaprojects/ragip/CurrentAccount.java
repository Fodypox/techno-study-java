package javaprojects.ragip;

public class CurrentAccount extends Account{
    private double overdraftLimit;
    public CurrentAccount(int a, double overdraftLimit, Bank bank) {
        super(a);
        this.overdraftLimit=overdraftLimit;
        bank.addAccount(this);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
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
