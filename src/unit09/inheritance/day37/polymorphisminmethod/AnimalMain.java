package unit09.inheritance.day37.polymorphisminmethod;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {

        ArrayList<Animal> farm = new ArrayList<>(List.of(new Animal(),new Bird(),new Cat(),new Pig(),new Dog()));
        for (Animal animal1:farm) {
            animal1.animalSound();
            if(animal1 instanceof Bird){
                ((Bird) animal1).fly();
            }
        }


    }
}
