package unit10.abstractclassandinterface.day39.abstractclasses;

public abstract class AnimalAbstract {
    public abstract void makeSound();
    public void hello(){
        System.out.println("hello "+getClass().getSimpleName());
    }
}
class Cat extends AnimalAbstract{

    @Override
    public void makeSound() {
        System.out.println("Meow, meow...");
    }
}
class Dog extends AnimalAbstract{

    @Override
    public void makeSound() {
        System.out.println("Woof, woof...");
    }
}
class Cow extends AnimalAbstract{

    @Override
    public void makeSound() {
        System.out.println("Mooo, mooo...");
    }
}
class Pig extends AnimalAbstract{

    @Override
    public void makeSound() {
        System.out.println("Oink, oink...");
    }
}