package javaprojects.BankApp.Accounts;

public class Credit extends Account{
    private double creditLimit;
    private double transactionFee;

    public Credit(double creditLimit) {
        super("credit");
        this.creditLimit = creditLimit;
        this.transactionFee = 0.03;
    }



    @Override
    public void addMoney(double amount) {
        if (amount>=0){
            setBalance(getBalance()+(amount-(amount*this.transactionFee)));
        }else {
            System.out.println("You cannot add negative amount");
        }
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount<=getBalance()+this.creditLimit){
            setBalance(getBalance()-(amount+(amount*this.transactionFee)));
        }else {
            System.out.println("Insufficient balance");
        }
    }

    /* This class inherits from Account class. It has private double creditLimit and private double transactionFee variables. - done
    * Create a constructor with creditLimit parameter. Pass "credit" value to the super. assign creditLimit coming from the constructor to the creditLimit variable - done
    * and set the transactionFee to %3 - done
    *
    * Implement all necessary methods. - done
    *
    * In addMoney method decrease the amount by %transactionFee and add it to the balance if the amount is equal or bigger than 0,
    * otherwise print "You cannot add negative amount". - done
    *
    * In withdrawMoney method decrease balance by amount and %transactionFee of the amount if balance is equal or greater than the total amount,
    * otherwise print "Insufficient balance" - done
    * */
}

