package javaprojects.arraypractice;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 15, 15, 3, 2};
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length/2; i++) {
            if(numbers[i]!=numbers[numbers.length-i-1]){
                System.out.println("Elements of an array are not the same from beginning and the end");
                break;
            }
        }
    }


}
