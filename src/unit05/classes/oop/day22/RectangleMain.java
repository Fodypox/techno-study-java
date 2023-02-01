package unit05.classes.oop.day22;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(3, 2);
        System.out.println(rect1.getArea());
        Rectangle rect2 = new Rectangle(2,2);
        System.out.println(rect2.isSquare());
        System.out.println(rect1.isSquare());
        System.out.println(rect1.calsculateArea(10,10));
        rect1.printInfo();
    }
}
