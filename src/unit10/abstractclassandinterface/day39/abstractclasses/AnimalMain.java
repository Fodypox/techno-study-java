package unit10.abstractclassandinterface.day39.abstractclasses;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        ArrayList<AnimalAbstract> farList = new ArrayList<>(List.of(new Dog(), new Cat(), new Cow(), new Pig()));
        for (AnimalAbstract animal:farList) {
            animal.hello();
            animal.makeSound();
        }

    }


}
