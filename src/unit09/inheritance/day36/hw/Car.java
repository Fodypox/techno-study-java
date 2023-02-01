package unit09.inheritance.day36.hw;

public class Car extends Vehicle{
    private int numOfPassengers;

    public Car(String color, int numOfPassengers) {
        super(color);
        this.numOfPassengers = numOfPassengers;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("You can ride with "+numOfPassengers+" passengers");
    }
}
