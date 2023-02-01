package javaprojects.YasinYoldas;

import java.util.Arrays;

public class RandomValueArray {
    public static void main(String[] args) {
        /*Create an array of size 5, assig some random values from 1 to 10?*/
        int[] randomNumbers = new int[5];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random()*10+1);
        }
        System.out.println(Arrays.toString(randomNumbers));
        findMax(randomNumbers);
    }
    public static void findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int a:arr) {
            if(a>max){
                max=a;
            }
        }
        System.out.println(max);
    }
}
