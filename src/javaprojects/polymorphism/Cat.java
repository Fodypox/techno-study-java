package javaprojects.polymorphism;

public class Cat extends Animal{
    @Override
    public String animalSound() {
        return "myaw myaw";
    }
    public void catMethod(){
        System.out.println("cats catch mouse");
    }
}
