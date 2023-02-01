package javaprojects.week05;

import java.util.Scanner;

public class Assignment3 {
    static char getLastLetter(String word) {
        return word.charAt(word.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println("Enter the word: ");
        word = sc.nextLine();
        System.out.println("Last letter of the word: " + getLastLetter(word));
    }

}
