package unit10.abstractclassandinterface.day40.interfaceanimal;

public class Duck extends Bird implements Swimmer{
    public Duck(String species) {
        super(species);
    }

    @Override
    public void animalSound() {
        System.out.println("Quack quack.");
    }

    @Override
    public void fly() {
        System.out.println("The Duck is flying in the sky.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming in the water");
    }
}
