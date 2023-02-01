package javaprojects.week05;

import java.util.Scanner;

public class Assignment6 {
    static boolean isContainWord(String sentence, String contain) {
        return sentence.contains(contain);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        System.out.println("What do you want to search for?");
        String contain = sc.nextLine();
        System.out.println("the sentence contains the search word: " + isContainWord(sentence, contain));
    }
}
