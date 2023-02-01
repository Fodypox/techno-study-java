package unit07.arraylist.day28.arraylistmethods;

import java.util.ArrayList;
import java.util.Arrays;

public class SizeMethod {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Hi","Bye","Why"));
        System.out.println(words.size());
    }
}
