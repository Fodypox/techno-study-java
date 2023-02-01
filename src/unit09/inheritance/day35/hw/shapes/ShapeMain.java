package unit09.inheritance.day35.hw.shapes;

public class ShapeMain {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        shape1.printArea();
        Rectangle rec = new Rectangle();
        rec.printArea();
        Circle circle1 = new Circle();
        circle1.printArea();
    }
}
