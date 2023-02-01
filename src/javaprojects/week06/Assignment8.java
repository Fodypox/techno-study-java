package javaprojects.week06;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number:");
        int number = sc.nextInt();
        getDigits(number);

    }

    public static void getDigits(int a){
        String num = String.valueOf(a);
        for (int i = 0; i < num.length(); i++) {
            System.out.println("Display promt: "+num.charAt(i));
        }
    }
}
