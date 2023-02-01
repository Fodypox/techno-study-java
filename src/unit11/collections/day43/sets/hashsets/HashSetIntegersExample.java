package unit11.collections.day43.sets.hashsets;

import java.util.HashSet;
import java.util.Set;

public class HashSetIntegersExample {
    public static void main(String[] args) {
        /*Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < 1000; i++) {
            integerSet.add((int) (Math.random()*1000));
        }
        System.out.println(integerSet);*/
        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(5);
        System.out.println(integerHashSet);
    }
}
