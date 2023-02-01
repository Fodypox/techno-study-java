package javaprojects.week05;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert the first number");
        int num1 = sc.nextInt();
        System.out.println("Please insert the second number");
        int num2 = sc.nextInt();
        System.out.print("The numbers divisible by 3 between "+ num1+" and "+num2+" are: ");
        for (int i = num1; i <= num2; i++) {
            if (i%3==0){
                System.out.print(i+" ");
            }
        }
    }
}
