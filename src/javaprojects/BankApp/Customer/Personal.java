package javaprojects.BankApp.Customer;

import javaprojects.BankApp.Accounts.Account;
import javaprojects.BankApp.Accounts.Checking;
import javaprojects.BankApp.Accounts.Credit;
import javaprojects.BankApp.Accounts.Saving;

public class Personal extends Customer{
    private int annualSalary;

    public Personal(String customerName, int annualSalary) {
        super(customerName);
        this.annualSalary = annualSalary;
        setCreditLimit(this.annualSalary,0.1);
    }
    /*public double setCreditLimit(int annualSalary){
        double creditLimit = this.annualSalary*0.1;
        return creditLimit;
    }*/

    public int getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public void openAccount(String accountType) {
        Account account;
        if (accountType.equalsIgnoreCase("checking")){
            account = new Checking();
            getAccounts().add(account);
            System.out.println("Checking account was successfully opened");
        }else if (accountType.equalsIgnoreCase("saving")){
            account = new Saving();
            getAccounts().add(account);
            System.out.println("Saving account was successfully opened");
        }else if (accountType.equalsIgnoreCase("credit")){
            account = new Credit(getCreditLimit());
            getAccounts().add(account);
            System.out.println("Credit account was successfully opened");
        }
    }
    /* This class inherits from Customer class. It has private int annualSalary variable.
     * Create a constructor with parameters String customerName and int annualSalary.
     * Assign annualSalary to annualSalary.
     *
     * Create a setCreditLimit method with an int annualSalary parameter. Return type is double.
     * Set creditLimit to  %10 of annualSalary in setCreditLimit and assign it to creditLimit variable in the constructor.
     *
     * Implement all necessary methods.
     *
     * In openAccount method
     *           if accountType is checking, create a checking account and add it to the accounts list.
     *           if accountType is saving, create a saving account and add it to the accounts list.
     *           if accountType is credit, create a credit account and add it to the accounts list.
     */
}
