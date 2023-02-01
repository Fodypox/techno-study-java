package unit11.collections.day42.sortinglist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Car implements Comparable<Car>{
    private int maxSpeed;
    private String make;

    public Car(int maxSpeed, String make) {
        this.maxSpeed = maxSpeed;
        this.make = make;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", make='" + make + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car that) {
        return this.maxSpeed - that.maxSpeed;
    }
}
class CarMain{
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(new Car(180,"Honda"),new Car(170,"Hyundai"),new Car(160,"Kia"),new Car(200, "BMW"),new Car(220,"Porsche")));
        System.out.println(cars);
        cars.sort(Comparator.naturalOrder());
        System.out.println(cars);
    }
}
