package unit05.classes.oop.day22;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    /*Return the area*/
    public double getArea(){
        return width * height;
    }

    public boolean isSquare(){
        if (width==height){
            return true;
        }else{
            return false;
        }
        /*aternative return is
        return width==height;*/
    }

    public double calsculateArea(double w, double h){
        return w*h;
    }

    public void printInfo(){
        System.out.println("height = " + height);
        System.out.println("width = " + width);
        System.out.println("suare: " + isSquare());
        System.out.println("area: " + getArea());
    }
}
