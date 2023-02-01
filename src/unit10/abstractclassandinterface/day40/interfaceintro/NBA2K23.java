package unit10.abstractclassandinterface.day40.interfaceintro;

public class NBA2K23 implements GameController{
    @Override
    public void triangleButton() {
        System.out.println("short pass");
    }

    @Override
    public void squareButton() {
        System.out.println("dunk");
    }

    @Override
    public void circleButton() {
        System.out.println("long pass");
    }

    @Override
    public void xButton() {
        System.out.println("score");
    }
}
