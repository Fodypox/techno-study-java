package Mentoring01302023;

public class Baklava extends Dessert{

    public Baklava(String filling) {  // pistachio, sugar, flour, vinegar, baking powder
        setIngredients(filling, "sugar", "flour", "vinegar", "baking powder");
        setName("Baklava");
    }

    @Override
    public void madeIn() {
        System.out.println("Made in Turkey");
    }






}
