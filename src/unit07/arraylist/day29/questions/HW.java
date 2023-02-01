package unit07.arraylist.day29.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class HW {
    public static void main(String[] args) {
        /*Find max, min, and sum.*/
        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(-34,45,23,78,90,12,33,-12,45));
        System.out.println(findMax(numbers));
        System.out.println(findMin(numbers));
        System.out.println(findSum(numbers));
    }

    public static int findMax(ArrayList<Integer> arr){
        int maxNum = Integer.MIN_VALUE;
        for (int num :
                arr) {
            if(maxNum<num){
                maxNum = num;
            }
        }
        return maxNum;
    }
    public static int findMin(ArrayList<Integer> arr){
        int minNum = Integer.MAX_VALUE;
        for (int num :
                arr) {
            if(minNum>num){
                minNum = num;
            }
        }

        return minNum;
    }
    public static int findSum(ArrayList<Integer> arr){
        int sum = 0;
        for (int num :
                arr) {
            sum += num;
        }

        return sum;
    }
}
