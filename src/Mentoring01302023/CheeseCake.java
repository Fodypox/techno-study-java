package Mentoring01302023;

public class CheeseCake extends Dessert{

    public CheeseCake() {
        setIngredients("Cream cheese", "sugar", "vanilla", "flavor");
        setName("Cheese Cake");
    }

    @Override
    public void madeIn() {
        System.out.println("Made in the US");
    }
}
