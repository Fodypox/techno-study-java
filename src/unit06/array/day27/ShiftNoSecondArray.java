package unit06.array.day27;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShiftNoSecondArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        System.out.println(Arrays.toString(numbers));

        for (int j = 0; j < 2; j++) {


        for (int i = 1; i < numbers.length; i++) {
            numbers[0] = numbers[0]+numbers[i];
            numbers[i] = numbers[0]-numbers[i];
            numbers[0] = numbers[0]-numbers[i];

        }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
