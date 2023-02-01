package javaprojects.interfaceclass;

public interface Drivable {
    void drive();

    default void wheels(){
        System.out.println("check the wheel");
    }
}
