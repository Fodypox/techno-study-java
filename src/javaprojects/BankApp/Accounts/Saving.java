package javaprojects.BankApp.Accounts;

public class Saving extends Account {
    private double interestRate;

    public Saving() {
        super("saving");
        this.interestRate = 0.015;
    }



    /*In addMoney method add amount to balance variable if it is equal or greater than 0, otherwise print "You cannot add negative amount"*/
    @Override
    public void addMoney(double amount) {
        if (amount >= 0) {
            setBalance(getBalance() + amount);
        } else {
            System.out.println("You cannot add negative amount");
        }
    }

    /*In withdrawMoney method subtract amount plus a fee of 0.01 of the amount from balance if the balance is bigger than total amount, otherwise
     * print "Insufficient balance"*/
    @Override
    public void withdrawMoney(double amount) {
        if (getBalance() >= (amount*1.01)) {
            setBalance(getBalance() - (amount*1.01));
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public void applyInterest(){
        setBalance(getBalance()*(1+this.interestRate));
    }
    /* This class inherits from Account class. It has extra private double interestRate variable. - done
     * Create a constructor without any variables. Pass "saving" string to super constructor. - done
     * assign %1.5 to interest rate in the constructor. - done
     *
     * Implement necessary methods. - done
     *
     * In addMoney method add amount to balance variable if it is equal or greater than 0, otherwise print "You cannot add negative amount" - done
     *
     * In withdrawMoney method subtract amount plus a fee of 0.01 of the amount from balance if the balance is bigger than total amount, otherwise
     * print "Insufficient balance" - done
     *
     * There is another method in this class, name applyInterest. In applyInterest method increase the balance by interestRate times itself. - done
     *
     * */
}

