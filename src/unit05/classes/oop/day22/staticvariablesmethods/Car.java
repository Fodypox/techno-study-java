package unit05.classes.oop.day22.staticvariablesmethods;

public class Car {
    private String model;
    private double mileage;
    private int year;

    private static int numberOfCars = 0;

    public Car(String model, double mileage, int year) {
        this.model = model;
        this.mileage = mileage;
        this.year = year;
        numberOfCars++;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", mileage=" + mileage +
                ", year=" + year +
                '}';
    }
}
