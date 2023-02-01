package unit10.abstractclassandinterface.day40.interfaceanimal;

public class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Pilot is flying the plane");
    }
}
