package javaprojects.week06;

import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[8];
        for (int i = 0; i < words.length; i++) {
            System.out.println("type any word");
            words[i] = sc.nextLine();
        }
        System.out.println(getLongestWord(words));

    }
    public static String getLongestWord(String[] a){
        String sample = "";
        for (int i = 0; i < a.length; i++) {
            if(sample.length()<a[i].length()){
                sample = a[i];
            }
        }
        return sample;
    }

}
