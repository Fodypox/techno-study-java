package unit11.collections.day41.sorting;

import java.util.*;

public class SortIntegerString {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(23,34,56,34,56,23,789,7,674,654,94,22));
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        List<String> strings = new ArrayList<>(List.of("hello","interface","collections"));
        System.out.println(strings);
        Collections.sort(strings);
        System.out.println(strings);
        numbers.sort(Comparator.naturalOrder());
        numbers.sort(Comparator.reverseOrder());
    }
}
