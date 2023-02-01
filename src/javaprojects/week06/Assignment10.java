package javaprojects.week06;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sample = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("enter your string:");
            sample[i] = sc.nextLine();

        }
        System.out.println(getWord(sample));

    }

    public static String getWord(String[] a){
        String firstLast = "";
        for (int i = 0; i < 5; i++) {
            firstLast = firstLast + (String.valueOf(a[i].charAt(0))+String.valueOf(a[i].charAt(a[i].length()-1)))+"\r\n";
        }
        return firstLast;
    }
}
