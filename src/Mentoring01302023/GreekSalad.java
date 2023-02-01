package Mentoring01302023;

public class GreekSalad extends Salad{

    public GreekSalad() {
        setIngredients("Feta", "lettuce", "tomato", "cucumber", "olives");
        setName("Greek Salad");
    }

    @Override
    public void madeIn() {
        System.out.println("Made in Greece");
    }
}
