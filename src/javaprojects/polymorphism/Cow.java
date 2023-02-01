package javaprojects.polymorphism;

public class Cow extends Animal{
    @Override
    public String animalSound() {
        return "moo moo";
    }
    public void cowMethod(){
        System.out.println("cows give milk");
    }
}
