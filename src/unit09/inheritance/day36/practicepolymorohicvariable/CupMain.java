package unit09.inheritance.day36.practicepolymorohicvariable;

public class CupMain {
    public static void main(String[] args) {
        Cup teacup = new TeaCup();
        CoffeeCup turkishTea = new TurkishCoffeeCup();
        Cup morokkonCup = new MorokkonCoffeeCup();
        System.out.println(morokkonCup instanceof Cup);
        System.out.println(morokkonCup instanceof TeaCup);
        System.out.println(teacup instanceof MorokkonCoffeeCup);
    }
}
