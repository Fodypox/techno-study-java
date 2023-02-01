package unit09.inheritance.day36.overridemethod;

public class RewartCard extends CreditCard{
    /*RewardCard extended CreditCard
double rewardRate
double rewardBalance
transaction(double amount)-> increases the balance by the amount. and increases the rewardBalance by the amount*rewardRate
Don't forget the constructors and getters, setters.*/
    private double rewordRate;
    private double rewardBalance;

    public RewartCard(double balance, double rewordRate, double rewardBalance) {
        super(balance);
        this.rewordRate = rewordRate;
        this.rewardBalance = rewardBalance;
    }

    public double getRewordRate() {
        return rewordRate;
    }

    public void setRewordRate(double rewordRate) {
        this.rewordRate = rewordRate;
    }

    public double getRewardBalance() {
        return rewardBalance;
    }

    public void setRewardBalance(double rewardBalance) {
        this.rewardBalance = rewardBalance;
    }

    @Override
    public double transaction(double amount) {
        super.transaction(amount);
        rewardBalance+=amount*rewordRate;
        return rewardBalance;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Your reward balance: "+rewardBalance);
    }
}
