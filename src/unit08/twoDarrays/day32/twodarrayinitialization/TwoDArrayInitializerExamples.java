package unit08.twoDarrays.day32.twodarrayinitialization;

import java.util.Arrays;

public class TwoDArrayInitializerExamples {
    public static void main(String[] args) {
        String[][] words = {
                {"apple","banana"},
                {"kiwi","lemon","lime"},
                {"strawberry","coconut","pineapple","dragon fruit"}
        };
        System.out.println(Arrays.deepToString(words));

        int[][] numbersArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {11, 12, 13},
                {16, 17},
                {116, 117, 1116, 11117}
        };
        System.out.println(numbersArray[1][2]);
        System.out.println(numbersArray[0][3]+""+numbersArray[1][3]+numbersArray[4][2]);
        System.out.println(""+numbersArray[2][2]+numbersArray[4][1]+numbersArray[3][0]+numbersArray[0][2]);

        numbersArray[1][3] = 99;
        System.out.println(numbersArray[1][3]);

        numbersArray[4][2] = 6666;
        System.out.println(numbersArray[4][2]);
        /*0123*/
        numbersArray[2][2] = 0;
        numbersArray[4][1] = 1;
        numbersArray[3][0] = 2;
        numbersArray[0][2] = 3;
        System.out.println(""+numbersArray[2][2]+numbersArray[4][1]+numbersArray[3][0]+numbersArray[0][2]);

        System.out.println(numbersArray[numbersArray.length-1][numbersArray[numbersArray.length-1].length-1]);

        System.out.println(numbersArray[0].length);
        System.out.println(numbersArray[numbersArray.length-1].length);


    }
}
