package javaprojects.interfaceclass;

public class Car extends Vehicle{
    @Override
    public void drive() {
        System.out.println("I drive a car");
    }

    @Override
    public void maxSpeed() {
        System.out.println("do not rush");
    }


}
