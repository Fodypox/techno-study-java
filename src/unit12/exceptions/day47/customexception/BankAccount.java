package unit12.exceptions.day47.customexception;

public class BankAccount {
    private double balance;
    private String currency;

    public BankAccount(double balance, String currency) {
        this.balance = balance;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }

    public void withdrow(double amount) throws Exception {
        if (amount > balance) {
//            throw new Exception("InsuficiantBalance");
            throw new InsufficiantBalanceException("Insufficiant balance");
        }
        balance = balance - amount;
        System.out.println("the withdrawal of $" + amount + " was successful.");
    }
    public void balanceTransfer(String currency) throws Exception {
        if (!currency.equals("USD")){
            throw new Exception("insufficient currancy");
        }
        currency.equals("USD");
        System.out.println("currency is good");
    }


}
