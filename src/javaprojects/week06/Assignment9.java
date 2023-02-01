package javaprojects.week06;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sample = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("enter your string:");
            sample[i] = sc.nextLine();

        }
        System.out.println(getWord(sample));;

    }

    public static String getWord(String[] a){
        String anyMember = "";

        anyMember = a[(int) (Math.random()*5)].substring(0,3);

        return anyMember;
    }

}
