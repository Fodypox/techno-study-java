package unit09.inheritance.day37.polymorphisminmethod;

public class Animal {
    public void animalSound(){
        /*Animal => animalSound()
Cat => override animalSound()
Dog => override animalSound()
Pig => override animalSound()
Bird => override animalSound()*/
        System.out.println("Animals make different sounds");
    }
}
class Cat extends Animal{
    @Override
    public void animalSound() {
        System.out.println(this.getClass().getSimpleName()+" miyaus");
    }
}
class Dog extends Animal{
    @Override
    public void animalSound() {
        System.out.println(this.getClass().getSimpleName()+" barks");
    }
}
class Pig extends Animal{
    @Override
    public void animalSound() {
        System.out.println(this.getClass().getSimpleName()+" oinks");
    }
}
class Bird extends Animal{
    @Override
    public void animalSound() {
        System.out.println(this.getClass().getSimpleName()+" twits");
    }
    public void fly(){
        System.out.println("flying");
    }
}