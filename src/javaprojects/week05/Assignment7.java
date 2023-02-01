package javaprojects.week05;

import java.util.Scanner;

public class Assignment7 {
    static String getMiddleChars(String word){
        String middleThree = "";
        if(word.length() % 2 != 0 && word.length() >= 5){
            middleThree += word.substring((word.length() / 2 - 1), (word.length() / 2 + 2));
            return middleThree;
        }
        else{
            return "invalid word";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        System.out.println("middle characters: " + getMiddleChars(word));
    }
}
