package javaprojects.week06;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[7];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter your number");
            numbers[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(getReversed(numbers)));
    }

    public static int[] getReversed(int[] a) {
        int[] reversedA = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            reversedA[a.length-i - 1] = a[i];
        }
        return reversedA;
    }
}
