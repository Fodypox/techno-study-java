package javaprojects.polymorphism;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog1 = new Dog();
        Dog dog2 = new Dog();
        Animal cow1 = new Cow();
        Animal cat1 = new Cat();
        Animal huskey1 = new Huskey();
        Dog huskey2 = new Huskey();
        Huskey huskey3 = new Huskey();
        Cat cat2 = new Cat();
//        System.out.println(animal.animalSound());
//        System.out.println(dog1.animalSound());

        ArrayList<Animal> animals =
                new ArrayList<>(List.of(animal, dog2, dog1, cat1, cat2, cow1, huskey1, huskey2, huskey3));


        /*Animal[] animalFarm2 = {animal,dog1,huskey3,cat2};
        for (Animal animalFarm:animalFarm2) {
            System.out.println(animalFarm.animalSound());
        }*/
        if (cat1 instanceof Huskey){
            ((Huskey) cat1).dogMethod();
        }
        ((Dog)huskey1).dogMethod();

    }
}
