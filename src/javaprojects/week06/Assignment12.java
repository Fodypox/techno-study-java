package javaprojects.week06;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter your number:");
            numbers[i] = sc.nextInt();

        }
        System.out.println("this is the max number of your numbers: " + getMax(numbers));
    }

    public static int getMax(int[] a){
        int sample = Integer.MIN_VALUE;
        for (int num :
                a) {
            if(sample<num){
                sample = num;
            }
        }
        return sample;
    }
}
