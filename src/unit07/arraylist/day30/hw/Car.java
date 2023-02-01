package unit07.arraylist.day30.hw;

public class Car {
    private String make;
    private int year;
    private double mileage;

    /*add car*/


    public Car(String make, int year, double mileage) {
        this.make = make;
        this.year = year;
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
