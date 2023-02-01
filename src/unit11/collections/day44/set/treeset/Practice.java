package unit11.collections.day44.set.treeset;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        String str = "this is a nice day in a nice way on a good day";
        /*Give me the words repeat itself
         * give me distinct words*/

        String[] newSTR = str.split(" ");
        Set<String> distinct = new HashSet<>(List.of(newSTR));
        System.out.println(distinct);
        Set<String> distinctByOrder = new TreeSet<>(distinct);
        System.out.println(distinctByOrder);
        Set<String> newSetString = new HashSet<>();
        Set<String> repeatedSetString = new HashSet<>();
        for (String word : newSTR) {
            if (newSetString.add(word) == false) {
                repeatedSetString.add(word);
            }
        }
        System.out.println("repeating words are: " + repeatedSetString);
        System.out.println(newSetString);
        newSetString.removeAll(repeatedSetString);
        System.out.println(newSetString);

    }
}
