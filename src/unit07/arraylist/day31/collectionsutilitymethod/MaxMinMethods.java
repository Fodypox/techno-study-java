package unit07.arraylist.day31.collectionsutilitymethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MaxMinMethods {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(23,34,56,34,56,23,789,7,674,654,94,22));
        System.out.println(numbers);
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
    }
}
