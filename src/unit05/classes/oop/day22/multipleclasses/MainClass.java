package unit05.classes.oop.day22.multipleclasses;

public class MainClass {
    public static void main(String[] args) {
        Address address1 = new Address("4 main ave", "Brooklyn", "NY", "00457");
        Address address2 = new Address("4 main ave", "Brooklyn", "NY", "00457");
        Student student1 = new Student("John", 4.0, address1);
        System.out.println(student1.getAddress());

        System.out.println(student1.isSameState(address2));
    }
}
