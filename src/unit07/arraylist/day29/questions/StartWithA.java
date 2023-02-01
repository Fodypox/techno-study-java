package unit07.arraylist.day29.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class StartWithA {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Almaty","Melburn","Moscow","Ankara"));
        System.out.println(startWithA(cities));

    }

    public static int startWithA(ArrayList<String> name){
        int count = 0;
        for (String city :
                name) {
            if(city.startsWith("A")){
                count++;
            }
        }


        return count;
    }
}
