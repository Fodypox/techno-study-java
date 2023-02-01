package javaprojects.abstractclasses;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new BMW();
        car.carDrive();
        ((Car)car).fourWheels();
        Vehicle bike = new Bike();
        ((Car)bike).fourWheels();
    }
}
