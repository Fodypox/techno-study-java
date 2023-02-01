package javaprojects.BankApp;

import javaprojects.BankApp.Customer.Customer;
import javaprojects.BankApp.Accounts.Account;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private List<Customer> customers;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public void deleteCustomer(Customer customer) {
        boolean isAccountBalanced = true;
        for (Account account : customer.getAccounts()) {
            if (account.getBalance() != 0) {
                isAccountBalanced = false;
                break;
            }
        }
        if (isAccountBalanced) {
            customers.remove(customer);
            System.out.println("Customer has been deleted successfully");
        } else {
            System.out.println("This customer has either money or debt in one of his/her accounts.");
        }
    }

    /* This class has two private variables.  String bankName and List<Customer> customers.
     *
     * Create getters and setters of these variables.
     *
     * Create a constructor with bankName variable and assign it to bank name.
     * Initialize customers list as an ArrayList.
     *
     * Create addCustomer method with a Customer parameter and add this customer to the customers list
     *
     * Create deleteCustomer method with a Customer parameter.
     * If balance of all accounts of the customer are 0 delete user and print "Customer has been deleted successfully"
     * otherwise print "This customer has either money or debt in one of his/her accounts."
     *
     * */
}
