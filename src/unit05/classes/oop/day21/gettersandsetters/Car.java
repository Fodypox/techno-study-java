package unit05.classes.oop.day21.gettersandsetters;

public class Car {
    private String color;
    private int year;
    private double mileage;

    public Car(String color, int year, double milage) {
        this.color = color;
        this.year = year;
        this.mileage = milage;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMileage(double mileage){
        this.mileage = mileage;
    }

    public String getColor(){
        return color;
    }

    public int getYear(){
        return year;
    }

    public double getMileage(){
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }


}
