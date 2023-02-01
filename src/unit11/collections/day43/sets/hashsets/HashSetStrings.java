package unit11.collections.day43.sets.hashsets;

import java.util.HashSet;
import java.util.Set;

public class HashSetStrings {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        System.out.println(stringSet.add("Moscow"));
        System.out.println(stringSet);
        System.out.println(stringSet.add("New York"));
        System.out.println(stringSet);
        System.out.println(stringSet.add("Malibu"));
        System.out.println(stringSet);
        System.out.println("-".repeat(10));
    }
}
