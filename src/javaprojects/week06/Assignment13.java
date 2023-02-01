package javaprojects.week06;

import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your number:");
            numbers[i] = sc.nextInt();

        }
        System.out.println("this is the sum of your numbers: " + getSum(numbers));
    }

    public static int getSum(int[] a){
        int sample = 0;
        for (int num :
                a) {
            sample = sample + num;
        }
        return sample;
    }
}
