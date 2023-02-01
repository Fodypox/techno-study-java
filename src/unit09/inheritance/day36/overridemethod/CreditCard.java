package unit09.inheritance.day36.overridemethod;

public class CreditCard {
    /*CreditCard class
private double balance
transaction(double amount) -> increases the balance by the amount*/
    private double balance;

    public CreditCard(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double transaction(double amount){
        balance += amount;
        return amount;
    }

    public void info(){
        System.out.println("Your balance: "+balance);
    }
}
