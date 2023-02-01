package javaprojects.week05;

import java.util.Scanner;

public class Assignment2 {
    static int getLargerNumber(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter two numbers:");
        System.out.println("Num 1");
        num1 = sc.nextInt();
        System.out.println("Num 2");
        num2 = sc.nextInt();
        System.out.println("Larger number: " + getLargerNumber(num1, num2));
    }
}
