package unit13.dateandtimeapi.day48.enumtopic;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String make;
    private Color color;

    public enum Color {
        YELLOW, WHITE, RED, BLUE, MAROON, BLACK, GREEN
    }

    public Car(String make, Color color) {
        this.make = make;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", color=" + color +
                '}';
    }
}

class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", Car.Color.WHITE);
        Car car2 = new Car("Honda", Car.Color.BLACK);
        Car car3 = new Car("Mazda", Car.Color.BLUE);
        Car car4 = new Car("Acura", Car.Color.RED);
        List<Car> cars = new ArrayList<>(List.of(car1,car2,car3,car4));
        System.out.println(cars);
        for (Car car:cars) {
            if (car.getColor().equals(Car.Color.BLACK)){
                System.out.println(car);
            }
        }

    }
}
