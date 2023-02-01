package javaprojects.polymorphism;

public class Dog extends Animal{
    @Override
    public String animalSound() {
        System.out.println(super.animalSound());
        return "woof woof";
    }
    public void dogMethod(){
        System.out.println("dogs are friends");
    }
}
