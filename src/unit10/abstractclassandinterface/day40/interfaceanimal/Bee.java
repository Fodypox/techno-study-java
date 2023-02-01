package unit10.abstractclassandinterface.day40.interfaceanimal;

public class Bee extends Animal implements Flyable{

    public Bee(String species) {
        super(species);
    }

    @Override
    public void animalSound() {
        System.out.println("zzzzzzzz");
    }

    @Override
    public void fly() {
        System.out.println("Bees are flying");
    }
}
