package unit09.inheritance.day35.overridingmethods;

import unit05.classes.oop.day20.constractors.Employees;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        ElectricVehicle ev = new ElectricVehicle();
        SportsCar sc = new SportsCar(220);


        /*System.out.println(car.drive());
        System.out.println(sc.drive());*/
        System.out.println(ev.fill());
        System.out.println(sc.fill());
        /*System.out.println(ev.drive());*/

    }
}
