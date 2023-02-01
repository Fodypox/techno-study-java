package javaprojects.BankApp.Customer;

import javaprojects.BankApp.Accounts.Account;
import javaprojects.BankApp.Accounts.Checking;
import javaprojects.BankApp.Accounts.Credit;
import javaprojects.BankApp.Accounts.Saving;

public class Business extends Customer{
    private int annualIncome;

    public int getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(int annualIncome) {
        this.annualIncome = annualIncome;
    }

    public Business(String customerName, int annualIncome) {
        super(customerName);
        this.annualIncome = annualIncome;
        setCreditLimit(this.annualIncome,0.3);
    }


    @Override
    public void openAccount(String accountType) {
        Account account;
        if (accountType.equalsIgnoreCase("checking")){
            account = new Checking();
            getAccounts().add(account);
            System.out.println("Checking account was successfully opened");
        }else if (accountType.equalsIgnoreCase("saving")){
            System.out.println("Business customers cannot have saving accounts");
        }else if (accountType.equalsIgnoreCase("credit")){
            account = new Credit(getCreditLimit());
            getAccounts().add(account);
            System.out.println("Credit account was successfully opened");
        }
    }

    /* This class inherits from Customer class. It has private int annualIncome variable.
    * Create a constructor with parameters String customerName and int annualNetIncome.
    * Assign annualIncome to annualIncome.
    *
    * Create a setCreditLimit method with an int annualIncome parameter. Return type is double.
    * Set creditLimit to %30 of annualIncome setCreditLimit and assign it to creditLimit variable in the constructor.
    *
    * Implement all necessary methods.
    *
    * In openAccount method
    *           if accountType is checking, create a checking account and add it to the accounts list.
    *           if accountType is saving, print "Business customers cannot have saving accounts"
    *           if accountType is credit, create a credit account and add it to the accounts list.
    */
}
