package Mentoring01302023;

public class CesarSalad extends Salad{

    public CesarSalad() {
        setIngredients("lettuce","parmesan cheese","dressing");
        setName("Cesar Salad");
    }

    @Override
    public void madeIn() {
        System.out.println("Made in the Mediterranean");
    }
}
