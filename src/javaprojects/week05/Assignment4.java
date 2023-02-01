package javaprojects.week05;

import java.util.Scanner;

public class Assignment4 {
    static String getMergedWord(String word1, String word2) {
        String mergedWord;
        if (word1.length() != 3 || word2.length() != 3) {
            return "cannot merge";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word1.length(); i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            mergedWord = sb.toString();
            return mergedWord;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1, word2;
        System.out.println("Enter two words.");
        System.out.print("Word 1: ");
        word1 = sc.nextLine();
        System.out.print("Word 2: ");
        word2 = sc.nextLine();
        System.out.println("The merged word is: " + getMergedWord(word1, word2));
    }
}
