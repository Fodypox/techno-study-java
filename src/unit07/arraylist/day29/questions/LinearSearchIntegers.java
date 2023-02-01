package unit07.arraylist.day29.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearchIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(-34, 45, 23, 78, 90, 13, 33, -12, 45));
        System.out.println(returnIndex(numbers1,90));
        System.out.println(numbers1.indexOf(30));

    }
    public static int returnIndex(ArrayList<Integer> arr, int key){
        int index = -1;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)==key){
                return i;
            }
        }


        return index;
    }
}
