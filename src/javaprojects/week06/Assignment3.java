package javaprojects.week06;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any text");
        String txt = sc.nextLine();
        System.out.println(isEqual(txt));

    }

    public static boolean isEqual(String a){
        String j = "java";
        String p = "python";
        int ja = 0;
        int py = 0;

        for (int i = 0; i <= a.length()-j.length(); i++) {
            if(a.substring(i,i+j.length()).equals(j)){
                ja++;
            }
        }
        for (int i = 0; i <= a.length()-p.length(); i++) {
            if(a.substring(i,i+p.length()).equals(p)){
                py++;
            }
        }
        if(ja==py){
            return true;
        }else{
            return false;
        }

    }
}
