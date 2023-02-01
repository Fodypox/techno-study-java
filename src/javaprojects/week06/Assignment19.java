package javaprojects.week06;

import java.util.Scanner;

public class Assignment19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[2];
        for (int i = 0; i < words.length; i++) {
            System.out.println("type your word");
            words[i] = sc.nextLine();
        }
        System.out.println(getMerged(words));
    }

    public static String getMerged(String[] a){
        String merged = "";
        if(a[0].charAt(a[0].length()-1)==a[1].charAt(0)){
            merged = a[0]+a[1].substring(1);
        }else{
            merged = a[0]+a[1];
        }
        return merged;
    }
}
