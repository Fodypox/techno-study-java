package javaprojects.week06;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type your string:");
        String vowel = sc.nextLine();
        System.out.println(getVowels(vowel));

    }

    public static String getVowels(String x){
        String output = "";
        char a = 'a';
        char e = 'e';
        char u = 'u';
        char i = 'i';
        char o = 'o';
        for (int j = 0; j < x.length(); j++) {
            if(x.charAt(j)==a){
                output = output+x.charAt(j);
            }else if(x.charAt(j)==e){
                output = output+x.charAt(j);
            }else if(x.charAt(j)==u){
                output = output+x.charAt(j);
            }else if(x.charAt(j)==i){
                output = output+x.charAt(j);
            }else if(x.charAt(j)==o){
                output = output+x.charAt(j);
            }
        }


        return output;
    }
}
