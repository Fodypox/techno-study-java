package javaprojects.interviewquestion;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        /*Write a program in Java to find greatest among three integers.*/
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter any number");
            numbers[i] = sc.nextInt();
        }
        findMax(numbers);

    }
    public static void findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int num:arr) {
            if (num>max){
                max=num;
            }
        }
        for (int num:arr) {
            if (num==max){
                System.out.print(num+", ");;
            }
        }
    }
}
