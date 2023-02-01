package javaprojects.week06;

import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter your number:");
            numbers[i] = sc.nextInt();

        }
        System.out.println("the amount of even numbers are : " + getEvenCount(numbers));
    }

    public static int getEvenCount(int[] a){
        int count = 0;
        for (int num :
                a) {
            if(num%2==0){
                count++;
            }
        }
        return count;
    }
}
