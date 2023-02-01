package unit09.inheritance.day36.hw;

import java.util.ArrayList;
import java.util.List;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Yellow", 2);
        car.info();

        ArrayList<Vehicle> vehicles = new ArrayList<>(List.of(new Vehicle("yellow"), new Car("red", 7), car,
                new Car("green", 4), new Vehicle("gray")));

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getClass().getSimpleName().equals("Car")) {
                vehicle.info();
            }
        }
    }
}
