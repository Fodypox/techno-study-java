package javaprojects.week06;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = sc.nextLine();
        System.out.println("Enter number of characters to be checked");
        int num = sc.nextInt();
        System.out.println(appearsMore(word,num));



    }

    public static boolean appearsMore(String word, int num){
        String check = word.substring(0,num);
        int count = 1;
        for (int i = 1; i < word.length()-num+1; i++) {
            if(word.substring(i,num+i).equals(check)){
                count++;
            }
        }
        if(count==2){
            System.out.println(check+" appears twice");
            return true;

        }else if(count>2){
            System.out.println(check+" appears "+count+" times");
            return true;

        }else {
            System.out.println(check+" appears once only");
            return false;

        }

    }

}
