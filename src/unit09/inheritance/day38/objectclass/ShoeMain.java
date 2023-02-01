package unit09.inheritance.day38.objectclass;

import org.w3c.dom.ls.LSOutput;

public class ShoeMain {
    public static void main(String[] args) {
        Shoe shoe1 = new Shoe(8,"Blue");
        Shoe shoe2 = new Shoe(9,"Red");
        Shoe shoe3 = new Shoe(8,"Blue");
        System.out.println(shoe1.equals(shoe2));
        System.out.println(shoe3.equals(shoe2));
        System.out.println(shoe3.equals(shoe1));

        Shoe sportsShoe1 = new SportShoes(8,"White","Soccer");
        Shoe sportsShoe2 = new SportShoes(8,"White","Basketball");
        Shoe sportsShoe3 = new SportShoes(8,"White","Soccer");
        System.out.println(sportsShoe1.equals(sportsShoe3));

    }

}
