package unit08.twoDarrays.day31.twoDarraycreation.twoDarrayinitialization;

import java.util.Arrays;

public class Init2DArrayExamples {
    public static void main(String[] args) {
        String[][] words = new String[2][2];
        String[] word0 = {"apple","banana"};
        String[] word1 = {"kiwi","lemon"};
        words[0] = word0;
        words[1] = word1;
        System.out.println(Arrays.deepToString(words));


    }
}
