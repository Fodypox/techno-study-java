package unit07.arraylist.day29.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class TraversingArrayList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("New York","Sydney","Bangkok","Tashkent"));
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }
        System.out.println();
        int i = 0;
        while (i<cities.size())
        {
            System.out.println(cities.get(i));
            i++;
        }
        System.out.println();
        for (String word :
                cities) {
            System.out.println(word);
        }
    }


}
