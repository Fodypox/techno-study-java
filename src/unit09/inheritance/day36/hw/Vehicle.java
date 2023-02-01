package unit09.inheritance.day36.hw;

public class Vehicle {
    /*Vehicle => color ---- create a constructor with color
Car => numOfPassengers ---- create a constructor with color and numOfPassengers
info() method for Vehicle
info() will be overridden in Car class
ArrayList<Vehicle> with vehicle and car objects.
We will call the info() method in the ArrayList Loop.
if you want to work on it...*/
    private String color;

    public Vehicle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void info(){
        System.out.println(this.getClass().getSimpleName() + " is " + color);
    }
}
