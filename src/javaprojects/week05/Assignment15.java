package javaprojects.week05;

import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.nextLine();
        System.out.println(getFistandLast(word));

        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);
        System.out.println("First character: " + first);
        System.out.println("Last character: " + last);
    }

    public static String getFistandLast(String name1) {
        String word = String.valueOf(name1.charAt(0)) + String.valueOf(name1.charAt(name1.length()-1));
        return word;
    }
}

