package javaprojects.interfaceclass;

public abstract class Vehicle implements Drivable{
    public abstract void maxSpeed();

    public void driveRules(){
        System.out.println("don't obey the rule");
    }
}
