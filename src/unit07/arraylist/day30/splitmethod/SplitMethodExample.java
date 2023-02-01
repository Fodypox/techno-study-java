package unit07.arraylist.day30.splitmethod;

import java.util.Arrays;

public class SplitMethodExample {
    public static void main(String[] args) {
        String sentence = "Testing and development goes hand by hand";
        String[] words = sentence.split(" ");
        System.out.println(words.length);
        System.out.println(Arrays.toString(words));
        for (String word :
                words) {
            System.out.print(word + " ");
        }
    }
}
