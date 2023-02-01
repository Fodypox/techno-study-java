package javaprojects.Nurcan;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your word ");
        String word = scan.nextLine();
        System.out.println(isEqual(word));
    }



    public static boolean isEqual(String word) {
        boolean isEqual = true;
        String word1 = "java";
        String word2 = "python";
        int countOfJava = 0;
        int countOfPython = 0;

        for (int i = 0; i <= word.length() - word1.length(); i++) {
            if (word1.equals(word.substring(i, i + word1.length()))) {
                countOfJava++;
            }
        }
        for (int j = 0; j <= word.length() - word2.length(); j++) {
            if (word2.equals(word.substring(j, j + word2.length()))) {
                countOfPython++;
            }
        }
        if (countOfJava == countOfPython) {
            isEqual = true;
        } else {
            isEqual = false;
        }
        return isEqual;
    }

}

