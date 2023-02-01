package javaprojects.arraypractice;

import java.util.Locale;

public class TestArray {
    public static void main(String[] args) {
        String words = " Elements of an array   are not the same from   beginning and the end ";

        String[] arr = words.trim().replaceAll("\\s{2,}"," ").split(" ");
        System.out.println(arr.length);
        for (String a:arr) {
            System.out.print(a.substring(0,1).toUpperCase()+a.substring(1)+" ");
        }
    }
}
