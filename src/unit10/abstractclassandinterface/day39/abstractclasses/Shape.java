package unit10.abstractclassandinterface.day39.abstractclasses;

public abstract class Shape {
    private int xCoordinates;
    private int yCoordinates;

    public Shape(int xCoordinates, int yCoordinates) {
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
    }

    public int getxCoordinates() {
        return xCoordinates;
    }

    public int getyCoordinates() {
        return yCoordinates;
    }

    public void moveTo(int newXCoordinates, int newYCoordinates){
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
    }
    public abstract double getArea();
    public void draw(){
        System.out.println("A "+this.getClass().getSimpleName()+" is drawn at x:"+getxCoordinates()+" and y:"+getyCoordinates()+" coordinates and have area of "+getArea());
    }
}
class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(int xCoordinates, int yCoordinates, double width, double height) {
        super(xCoordinates, yCoordinates);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    /*@Override
    public void draw() {
        System.out.println("A "+this.getClass().getSimpleName()+" is drawn at x:"+getxCoordinates()+" and y:"+getyCoordinates()+" coordinates and have area of "+getArea());

    }*/
}
class Circle extends Shape{
    private double radius;

    public Circle(int xCoordinates, int yCoordinates, double radius) {
        super(xCoordinates, yCoordinates);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

   /* @Override
    public void draw() {
        System.out.println("A circle is drawn at x:"+getxCoordinates()+" and y:"+getyCoordinates()+" coordinates and have area of "+getArea());

    }*/
}
