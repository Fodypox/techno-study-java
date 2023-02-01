package unit07.arraylist.day31.collectionsutilitymethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortReverseBinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(23,34,56,34,56,23,789,7,674,654,94,22));
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
        System.out.println(Collections.binarySearch(numbers,790));
    }
}
