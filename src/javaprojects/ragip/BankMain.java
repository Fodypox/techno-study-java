package javaprojects.ragip;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account = new Account(createAccountNumber());
        SavingAccount savingAccount = new SavingAccount(createAccountNumber(),2.5,bank);
        CurrentAccount currentAccount = new CurrentAccount(createAccountNumber(),1000,bank);
        bank.accounts.add(account);
        bank.accounts.add(savingAccount);
        bank.accounts.add(savingAccount);

        System.out.println(account.toString());
        System.out.println(savingAccount.toString());
        System.out.println(currentAccount.toString());
        System.out.println(bank.accounts.get(0).toString());
    }
    public static int createAccountNumber(){
        return (int) (Math.random()*10);
    }
}
