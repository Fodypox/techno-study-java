package javaprojects.arraypractice;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        int a = (int) (Math.random()+0.5);
        for (int i = 0; i < 10; i++) {
            System.out.println((int) ((Math.random() * (11 - 5)) + 5));
        }
        System.out.println(a);

        /*Scanner sc = new Scanner(System.in);
        int[] sample = new int[10];
        for (int i = 0; i < sample.length; i++) {
            System.out.println("enter your number");
            sample[i] = sc.nextInt();
        }
        reversedArray(sample);*/
    }

/*    public static void reversedArray(int[] a){
        int[] reversedA = new int[a.length];
        int j = a.length;
        for (int i = 0; i < a.length; i++) {
            reversedA[j - 1] = a[i];
            j = j - 1;
        }
        System.out.println(Arrays.toString(reversedA));

    }*/
}
