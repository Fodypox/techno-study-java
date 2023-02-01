package javaprojects.Nurcan;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many rows you want in the triangle?");
        int n = input.nextInt();
        getTriangle(n);
    }
    public static void getTriangle(int n) {
        for (int i =1; i<=n; i++) {
            for (int j =1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}