package unit08.twoDarrays.day32.twodarrayinitialization;

import java.util.Locale;

public class TrueFalseArrays {
    public static void main(String[] args) {

        boolean[][] trueFalse = new boolean[3][4];
        trueFalse[0][2] = true;
        trueFalse[2][1] = true;

        boolean[][] booleans = {
                {false, false, true, false},
                {false, false, false, false},
                {false, true, false, false}
        };

        String[][] letters = {
                {"a", "b", "c", "d", "e"},
                {"f", "g", "h", "i", "j"},
                {"k", "l", "m", "n", "o"},
                {"p", "q", "r", "s", "t"},
                {"u", "v", "w", "x", "y"}
        };

        String sdet = (letters[3][3]+letters[0][3]+letters[0][4]+letters[3][4]).toUpperCase();
        System.out.println(sdet);

        letters[3][3] = "b";
        letters[0][3] = "e";
        letters[0][4] = "s";

        sdet = (letters[3][3]+letters[0][3]+letters[0][4]+letters[3][4]).toUpperCase();
        System.out.println(sdet);



    }
}
