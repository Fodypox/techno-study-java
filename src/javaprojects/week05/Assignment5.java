package javaprojects.week05;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = sc.nextLine();
        String reversedWord = "";
        char ch;
        System.out.println("You wrote: " + str);
        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            reversedWord = ch + reversedWord;
        }
        System.out.println("Reversed Word: " + reversedWord);
    }
}
