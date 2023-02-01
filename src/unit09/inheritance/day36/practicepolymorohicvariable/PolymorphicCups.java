package unit09.inheritance.day36.practicepolymorohicvariable;

import java.util.ArrayList;

public class PolymorphicCups {
    public static void main(String[] args) {
        ArrayList<Cup> cups = new ArrayList<>();
        cups.add(new MorokkonCoffeeCup());
        cups.add(new TeaCup());
        cups.add(new Cup());
        cups.add(new CoffeeCup());
        cups.add(new TurkishCoffeeCup());
        for (Cup cup:cups) {
            System.out.println(cup.getClass().getSimpleName());
        }
        Cup[] cups1 = new Cup[5];
        cups1[0] = new TurkishCoffeeCup();
        cups1[1] = new MorokkonCoffeeCup();
        cups1[2] = new Cup();
        cups1[3] = new TeaCup();
        cups1[4] = new CoffeeCup();
        for (Cup cup:cups1) {
            System.out.println(cup.getClass().getSimpleName());
        }
    }
}
