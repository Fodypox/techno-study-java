package unit08.twoDarrays.day33.twodarrayinmethods;

import java.util.Arrays;

public class TwoDArrayAsAParameter {
    public static void main(String[] args) {
        String[][] words = {
                {"apple","banana"},
                {"kiwi","lemon","lime"},
                {"strawberry","coconut","pineapple","dragon fruit"}
        };
        print2DArray(words);
        System.out.println(Arrays.deepToString(printDefoult2DArray()));

    }
    public static void print2DArray(String[][] arr){
        System.out.println(Arrays.deepToString(arr));
    }
    public static String[][] printDefoult2DArray(){
        String[][] words = {
                {"apple","banana"},
                {"kiwi","lemon","lime"},
                {"strawberry","coconut","pineapple","dragon fruit"}
        };
        return words;
    }
}
