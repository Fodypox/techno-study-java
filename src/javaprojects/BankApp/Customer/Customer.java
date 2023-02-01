package javaprojects.BankApp.Customer;

import javaprojects.BankApp.Accounts.Account;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
    /*This class is an abstract class. - done
     * Create the fields below and their getters and setters
     *
     * private String customerNumber;
     * private String customerName;
     * private double creditLimit;
     * private List<Account> accounts
     *
     * Create a constructor with customerName parameter and assign it to customerName variable.*/
    private String customerNumber;
    private String customerName;
    private double creditLimit;
    private List<Account> accounts;

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String setCustomerNumber() {
        int max = 10000000;
        int min = 1000000;

        String accountNumber = Integer.toString((int) (Math.random() * (max - min + 1) + min));
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {

        this.customerName = customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int annualIncome, double creditLimit) {
        this.creditLimit = annualIncome*creditLimit;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Customer(String customerName) {
        this.customerName = customerName;
        this.customerNumber = setCustomerNumber();
        this.accounts = new ArrayList<>();
    }

    public abstract void openAccount(String accountType);

    public void deleteAccount(Account account) {
        if (account.getBalance()==0){
            this.accounts.remove(account);
            System.out.println("This account was successfully deleted");
        }else if (account.getBalance()<0){
            System.out.println("You cannot close credit account without paying your debt");
        }else {
            System.out.println("You have $"+account.getBalance()+" in your account. Withdraw your money first");
        }
    }

    /* This class is an abstract class. - done
     * Create the fields below and their getters and setters
     *
     * private String customerNumber;
     * private String customerName;
     * private double creditLimit;
     * private List<Account> accounts
     *
     * Create a constructor with customerName parameter and assign it to customerName variable.
     *
     * Assign a random number between 1000000-10000000 to customerNumber.
     * Create this number in setCustomerNumber method and return the number. Assign it to customerNumber in the constructor by
     * calling setCustomerNumber method.
     *
     * Initialize accounts list as an ArrayList in the constructor.
     *
     * Create an abstract openAccount method with a String accountType parameter.
     *
     * Create a non-abstract deleteAccount method with an Account parameter.
     * Delete this account from accounts list if its balance is 0.
     * If the balance is negative print "You cannot close credit account without paying your debt"
     * If the balance is positive print "You have $balance in your account. Withdraw your money first"
     *
     *
     *
     */
}

