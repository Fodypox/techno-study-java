package unit09.inheritance.day36.polymorphicvariable;

public class PolymorphicVariableList {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[5];
        Fruit fruit1 = new Fruit();
        fruits[0] = fruit1;
        fruits[1] = new Apple();
        fruits[2] = new Grape();
        fruits[3] = new RedGrapes();
        fruits[4] = new YellowGrape();

        for (Fruit fruit:fruits) {
            System.out.println(fruit.getClass().getSimpleName());
        }

        Grape[] grapes = new Grape[4];
        grapes[0] = new YellowGrape();
        grapes[1] = new Grape();
        grapes[2] = new RedGrapes();
        grapes[3] = new Grape();

        for (Grape grape:grapes) {
            System.out.println(grape.getClass().getSimpleName());
        }

    }
}
