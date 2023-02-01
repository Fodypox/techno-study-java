package javaprojects.YasinYoldas;

public class ReversedStringWordByWord {
    public static void main(String[] args) {
        /*Write a java program to reverse String? Reverse a string word by word?*/
        String word = "I love Java classes";
        String[] words = word.split(" ");
        String reversed = "";
        for (int i = 0; i < words.length; i++) {
            reversed = words[i]+" "+reversed;
        }
        System.out.println(reversed);
    }
}
