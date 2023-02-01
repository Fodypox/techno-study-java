package unit06.array.day25.foreach;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car(1000);
        Car car2 = new Car(6000);
        Car car3 = new Car(100000);
        Car car4 = new Car(2000);

        Car[] cars = {car1,car2,car3,car4};

        for (Car car :
                cars) {
            System.out.println(car.getMileage());
        }

        for (Car car :
                cars) {
            if(car.getMileage()<5000){
            System.out.println(car);
            }
        }
    }
}
