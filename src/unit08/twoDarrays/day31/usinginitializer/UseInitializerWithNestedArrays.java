package unit08.twoDarrays.day31.usinginitializer;

import java.util.Arrays;

public class UseInitializerWithNestedArrays {
    public static void main(String[] args) {
        int[][] numbersArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {11, 12, 13},
                {16, 17,833,3432432,6645,-1234,73483},
                {12,23,45,23,12,34,67765}
        };
        System.out.println(Arrays.deepToString(numbersArray));
        System.out.println(numbersArray.length);
        System.out.println(numbersArray[0].length);
        System.out.println(numbersArray[1].length);
        System.out.println(numbersArray[2].length);
        System.out.println(numbersArray[3].length);

        String[][] words = {
                {"kjdfkds","kjdfdsk","kjdfkd","kjeodj"},
                {"jd","kjhsfsd"},
                {"kjds"},
                {"lkjsdfj","kjds","kjsdfh"}
        };
        System.out.println(Arrays.deepToString(words));
    }
}
