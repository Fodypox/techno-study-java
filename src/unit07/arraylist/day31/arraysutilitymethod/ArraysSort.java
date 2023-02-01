package unit07.arraylist.day31.arraysutilitymethod;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[] numbers = {-34,23,43,12,43,565,675,324,12,1,-78};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] words = {"jdsfh","alddawl","lokek","lkvvlkdj","wdskjhc"};
        System.out.println(Arrays.toString(words));
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
    }
}
