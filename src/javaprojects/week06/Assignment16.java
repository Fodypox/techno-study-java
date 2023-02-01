package javaprojects.week06;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[7];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter your number");
            numbers[i] = sc.nextInt();
        }
        System.out.println(getSingle(numbers));
    }

    public static int getSingle(int[] a) {
        int check = 0;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count == 1) {
                check = a[i];
            }
        }
        return check;
    }
}
