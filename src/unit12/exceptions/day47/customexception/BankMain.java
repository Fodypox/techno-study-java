package unit12.exceptions.day47.customexception;

public class BankMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100,"USD");
        System.out.println(bankAccount);
        try {
            bankAccount.withdrow(80);
            bankAccount.withdrow(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(bankAccount);
        try {
            bankAccount.balanceTransfer("EUR");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
