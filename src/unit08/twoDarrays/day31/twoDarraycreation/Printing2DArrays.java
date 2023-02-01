package unit08.twoDarrays.day31.twoDarraycreation;

import java.util.Arrays;

public class Printing2DArrays {
    public static void main(String[] args) {
        boolean[][] booleans = new boolean[4][4];
        System.out.println(Arrays.deepToString(booleans));
        String[][] words = new String[5][12];
        System.out.println(Arrays.deepToString(words));
        int[][] numbers = new int[10][2];
        System.out.println(Arrays.deepToString(numbers));
    }
}
