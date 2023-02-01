package javaprojects.BankApp.Accounts;

public abstract class Account {
    /*This class is an abstract class. - done
     * Create the fields below and their getters and setters - done
     *
     * private String accountNumber; - done
     * private double balance; - done
     * private String accountType; - done*/

    private String accountNumber;
    private double balance;
    private String accountType;

    public String getAccountNumber() {
        return accountNumber;
    }

    /* Assign a random number between 1000000-10000000 to accountNumber. - done
     * Create this number in setAccountNumber method and return the number. Assign it to accountNumber in the constructor by
     * calling setAccountNumber method.*/
    public String setAccountNumber() {

        int max = 10000000;
        int min = 1000000;

        String accountNumber = Integer.toString((int) (Math.random() * (max - min + 1) + min));
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public String getAccountType() {
        return accountType;
    }
    /* In the setAccountType method change the return type to String and pass the String accountType parameter that you are getting by the constructor to this method
     * and make it all uppercase and assign it to object's accountType variable. - done*/
    public String setAccountType(String accountType) {
        return accountType.toUpperCase();
    }

    /* Create a constructor with a String accountType parameter. - done
     * Set balance to 0 in the constructor - done*/
    public Account(String accountType) {
        this.accountType = setAccountType(accountType);
        this.balance = 0;
        this.accountNumber = setAccountNumber();
    }
    /*

     * Create 2 public abstract methods, names are addMoney and withdrawMoney. - done
     * addMoney and withdrawMoney have double amount parameter. - done
     *
     * */
    public abstract void addMoney(double amount);
    public abstract void withdrawMoney(double amount);

}
