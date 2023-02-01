package javaprojects.Nurcan;

import java.util.Scanner;

public class Assignment1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input a word");
            String word = scan.nextLine();
            System.out.println("Input a number");
            int num = scan.nextInt();
            System.out.println(appearsMore(word,num));
        }

    public static boolean appearsMore(String word, int num){
        boolean isRepeat=true;
        int count = 0;
        for (int i = 0; i <word.length()-num+1/*6-2=4 (word = abXYab num = 2)*/ ; i++) {
            if(word.substring(0,num).equals(word.substring(i, i+num))){
                count++;
                if(count>=2){
                    isRepeat = true;
                } else {
                    isRepeat = false;
                }
            }
        }
        System.out.println(word.substring(0,num)+ " appears " + count + " times");
        return isRepeat;

    }

}





