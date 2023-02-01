package javaprojects.week09;

import java.util.Locale;
import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        System.out.println(getWords(message));

    }
    public static String getWords(String msg){
        String words = "";
        for (String a:msg.split(" ")) {
            words = words + a.substring(0,1).toUpperCase()+a.substring(1) + " ";
        }
        return words;
    }
}
