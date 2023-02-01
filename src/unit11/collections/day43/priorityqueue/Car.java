package unit11.collections.day43.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Car {
    private String make;
    private int year;

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", year=" + year +
                '}';
    }
}
class CarMain{
    public static void main(String[] args) {
        Queue<Car> carList = new PriorityQueue<>(Comparator.comparing(Car::getYear).reversed());
        carList.offer(new Car("BMW",2013));
        carList.offer(new Car("Toyota",2023));
        carList.offer(new Car("Honda",1999));
        carList.offer(new Car("Mazda",2021));
        carList.offer(new Car("Jeep",2023));
        System.out.println(carList);
    }
}
