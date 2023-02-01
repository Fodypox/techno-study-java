package unit07.arraylist.day28.arraylistcreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListMethod {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>(Arrays.asList(100,200,300,400));
        System.out.println(numbers);
        Integer[] nums = {1,2,3,4};
        ArrayList<Integer> numbers2= new ArrayList<>(Arrays.asList(nums));
        System.out.println(numbers2);
        ArrayList<String> words = new ArrayList<>(List.of("hi","bye"));
        System.out.println(words);
    }
}
