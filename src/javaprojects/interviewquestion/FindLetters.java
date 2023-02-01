package javaprojects.interviewquestion;

import java.awt.*;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;

public class FindLetters {
    // Write method that gets a String and returns
    // number of each letter and the letter alphabetically.
    // input: "baabccbccdccdefeeffaa"
    // output: "4a3b6c2d3e3f"
    public static void main(String[] args) {
        String input = "baabccbccdccdefeeffaa";
        System.out.println(letterCount(input));
    }
    public static String letterCount(String input){
        String output = "";
        String[] letters = input.split("");
        Set<String> newSet = new TreeSet<>(List.of(letters));
        for (String out:newSet) {
            int count = 0;
            for (String in:letters) {
            if (out.equals(in)){
                count++;
            }
            }
            output = output+count+out;
        }

        return output;
    }
}
