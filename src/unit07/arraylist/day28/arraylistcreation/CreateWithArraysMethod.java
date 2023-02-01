package unit07.arraylist.day28.arraylistcreation;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateWithArraysMethod {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(numbers);
        ArrayList<Integer> numbers2= new ArrayList<>(Arrays.asList(10,20,30));
        System.out.println(numbers2);
        ArrayList<Integer> numbers3= new ArrayList<>(numbers2);
        System.out.println(numbers3);
        String[] names = {"james","john","james"};
        ArrayList<String> names2 = new ArrayList<>(Arrays.asList(names));
        System.out.println(names2);
    }
}
