package unit11.collections.day45.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapInterviewStyleQuestion {
    public static void main(String[] args) {
        String sentence = "rainy and sunny days are nice but rainy and windy days are also nice too";

        /*Give me the numbers of the words are used in the sentence*/

        String[] words = sentence.split(" ");
        Map<String, Integer> numbersOfTheWords = new HashMap<>();
        for (String word : words) {
            if (numbersOfTheWords.containsKey(word)) {
                numbersOfTheWords.put(word, numbersOfTheWords.get(word) + 1);
            }else {
                numbersOfTheWords.put(word,1);
            }
        }


/*
        for (int i = 0; i < words.length; i++) {
            numbersOfTheWords.put(i+1,words[i]);
        }
*/
        System.out.println(numbersOfTheWords);

        String word = "pneumonoultramicroscopicsilicovolcanoconiosis";
        /*Give me the numbers of the letters are used in the sentence*/

        char[] letters = word.toCharArray();
        Map<Character, Integer> numbersOfTheLetters = new HashMap<>();
        for (char letter : letters) {
            if (numbersOfTheLetters.containsKey(letter)) {
                numbersOfTheLetters.put(letter,  numbersOfTheLetters.get(letter) + 1);
            }else {
                numbersOfTheLetters.put(letter, 1);
            }
        }
        System.out.println(numbersOfTheLetters);

    }
}
