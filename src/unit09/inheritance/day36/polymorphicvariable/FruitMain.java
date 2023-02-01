package unit09.inheritance.day36.polymorphicvariable;

public class FruitMain {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Apple apple = new Apple();
        Grape grape = new Grape();
        RedGrapes redGrape = new RedGrapes();
        YellowGrape yellowGrape = new YellowGrape();

        Fruit polyapple = new Apple();
        Fruit polygrape = new Grape();
        Fruit polyRedGrape = new RedGrapes();
        Grape yellow = new YellowGrape();
//        Apple polymorphicApple = new Fruit();

        System.out.println(polyRedGrape instanceof Fruit);
        System.out.println(polyapple instanceof Grape);
        System.out.println(polyapple instanceof Apple);
    }
}
