package unit07.arraylist.day30.linearsearch;

public class Car {
    private String make;

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Car(String make) {
        this.make = make;
    }



}
