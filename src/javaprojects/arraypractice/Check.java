package javaprojects.arraypractice;

import java.util.Locale;

public class Check {
    public static void main(String[] args) {
        String sentence = "Java is an object oriented programming language";
        String[] words = sentence.split(" ");
        for (String word:words) {
            System.out.println(word.substring(0,1).toUpperCase()+word.substring(1));
        }
    }
}
