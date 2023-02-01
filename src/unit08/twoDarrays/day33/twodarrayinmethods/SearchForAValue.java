package unit08.twoDarrays.day33.twodarrayinmethods;

import java.util.Arrays;

public class SearchForAValue {
    public static void main(String[] args) {
        String[][] words = {
                {"apple","banana"},
                {"kiwi","lemon","lime"},
                {"strawberry","coconut","pineapple","dragon fruit"}
        };
        System.out.println(searchForValue(words,"lemon"));
        System.out.println(searchForValue(words,"limon"));
        System.out.println(Arrays.deepToString(words).contains("lemon"));

    }
    public static boolean searchForValue(String[][] arr, String key){
        if(Arrays.deepToString(arr).contains(key)){
            return true;
        }
        return false;

        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j].equals(key)){
                    return true;
                }
            }
        }
        return false;*/
    }
}
