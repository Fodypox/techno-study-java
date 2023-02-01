package javaprojects.week06;

import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = new String[8];
        for (int i = 0; i < lines.length; i++) {
            System.out.println("write your string");
            lines[i] = sc.nextLine();
        }
        System.out.println(getPairs(lines));
    }

    public static String getPairs(String[] a){
        String pairs = "";
        for (int i = 0; i < a.length; i=i+2) {
            pairs = pairs + a[i]+", "+a[i+1] + "\r\n";
        }
        return pairs;
    }
}
