package unit07.arraylist.day31.arraysutilitymethod;

import java.util.Arrays;

public class BinarySearchMethod {
    public static void main(String[] args) {
        int[] numbers = {-34,23,43,12,43,565,675,324,12,1,-78};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers,43));
        System.out.println(Arrays.binarySearch(numbers,2));
    }
}
