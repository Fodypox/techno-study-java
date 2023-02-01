package unit10.abstractclassandinterface.day40.interfaceintro;

public class FifaWorldCup2022 implements GameController{
    @Override
    public void triangleButton() {
        System.out.println("Pass through.");
    }

    @Override
    public void squareButton() {
        System.out.println("Shot on Goal");
    }

    @Override
    public void circleButton() {
        System.out.println("Cross Pass");
    }

    @Override
    public void xButton() {
        System.out.println("Ground Pass");
    }
}
