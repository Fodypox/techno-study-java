package unit10.abstractclassandinterface.day40.interfaceanimal;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        Duck ducky = new Duck("Water specy");
        Dog dog = new Dog("Pekin", "Husky");
        Plane plane = new Plane();
        Bee bee = new Bee("insect");
        ArrayList<Flyable> flyables = new ArrayList<>(List.of(bee,ducky,plane));
        ArrayList<Swimmer> swimmers = new ArrayList<>(List.of(ducky,dog));

        for (Flyable flayable:flyables) {
            flayable.fly();
        }
        for (Swimmer swimmer:swimmers) {
            swimmer.swim();
        }

    }
}
