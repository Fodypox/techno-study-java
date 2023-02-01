package javaprojects.week06;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter any number:");
            numbers[i] = sc.nextInt();
        }
        System.out.println(getTotal(numbers));


    }

    public static int getTotal(int[] a) {
        String output = "";
        int sumSquares = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == a.length) {
                output = output + String.valueOf(a[i]) + "x" + String.valueOf(a[i]); /*1x1+*/
                sumSquares = sumSquares + a[i] * a[i];
            } else {
                output = output + String.valueOf(a[i]) + "x" + String.valueOf(a[i]) + "+";
                sumSquares = sumSquares + a[i] * a[i];
            }
        }
        System.out.print(output + "=");
        return sumSquares;
    }
}
