package unit10.abstractclassandinterface.day39.abstractclasses;

public class ShapeMain {
    public static void main(String[] args) {
        Shape rectangle1 = new Rectangle(10,8,5,3);
        rectangle1.draw();
        System.out.println(rectangle1.getArea());
        Shape circle1 = new Circle(3,4,6);
        circle1.draw();
        System.out.println(circle1.getArea());
    }
}
