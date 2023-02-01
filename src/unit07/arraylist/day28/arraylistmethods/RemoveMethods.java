package unit07.arraylist.day28.arraylistmethods;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveMethods {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Tokyo","London","Toronto"));
        System.out.println(cities);
        System.out.println(cities.remove(0));
        System.out.println(cities);
        System.out.println(cities.remove("London"));
        System.out.println(cities.remove("London"));
        System.out.println(cities);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(numbers);
        numbers.remove(0);
        System.out.println(numbers);
        numbers.remove(Integer.valueOf(7));
        System.out.println(numbers);

        numbers.removeAll(Arrays.asList(1,3,5,7,9));
        System.out.println(numbers);
    }
}
