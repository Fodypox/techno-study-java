package javaprojects.abstractclasses;

public class BMW extends Car{
    @Override
    void carBreaks() {
        System.out.println("I can stop");

    }

    @Override
    void carDrive() {
        System.out.println("I can drive");
    }
}
