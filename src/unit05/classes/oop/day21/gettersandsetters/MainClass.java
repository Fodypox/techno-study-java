package unit05.classes.oop.day21.gettersandsetters;

public class MainClass {
    public static void main(String[] args) {
        Student student1 = new Student("jhkdf","John Doe",3.52);
        System.out.println(student1.getGpa());
        System.out.println(student1.getId());
        System.out.println(student1.getName());
        student1.setId("ksdjhfks");
        student1.setGpa(3.98);
        student1.setName("Aslanbek");
        System.out.println(student1);


        Car car1 = new Car("red", 2015, 16000);
        System.out.println(car1.getMileage());
        System.out.println(car1.getColor());
        System.out.println(car1.getYear());
        car1.setColor("black");
        car1.setMileage(150000);
        System.out.println(car1);

        House house1 = new House("white","176 Millburn",650000);
        System.out.println(house1);
        house1.setPrice(750000);
        System.out.println(house1);
        System.out.println(house1.getPrice());
    }
}
