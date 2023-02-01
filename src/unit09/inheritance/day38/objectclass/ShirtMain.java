package unit09.inheritance.day38.objectclass;

public class ShirtMain {
    public static void main(String[] args) {
        Shirt shirt1 = new Shirt(8,"red");
        Shirt shirt2 = new Shirt(8,"blue");
        Shirt shirt3 = new Shirt(8,"blue");
        Shirt jersey1 = new Jersey(8,"white","soccer");
        Shirt jersey2 = new Jersey(8,"white","hockey");
        Shirt jersey3 = new Jersey(8,"white","soccer");

        System.out.println(shirt1.equals(shirt2));
        System.out.println(shirt1.equals(shirt3));
        System.out.println(shirt3.equals(shirt2));
        System.out.println(jersey1.equals(jersey2));
        System.out.println(jersey1.equals(jersey3));
        System.out.println(jersey3.equals(jersey2));
    }
}
