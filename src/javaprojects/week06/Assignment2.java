package javaprojects.week06;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sandwich ingredients without space in one string");
        String sandwich = sc.nextLine();
        System.out.println(getInBetween(sandwich));
    }

    public static String getInBetween(String a){
        String br = "bread";
        int num = br.length();
        int count = 0;
        int start = 0;
        int end = 0;
        String search = "";
        
        for (int i = 0; i < a.length()-num+1; i++)
            if (a.substring(i, i + num).equals(br)) {
                count++;
            }

        if(count==2) {
            for (int i = 0; i < a.length() - num + 1; i++) {
                if (a.substring(i, i + num).equals(br)) {
                    start = i + num;
                    break;
                }
            }
            for (int i = a.length() - num; i >= 0; i--) {
                if (a.substring(i, i + num).equals(br)) {
                    end = i;
                    break;
                }
            }
            search = a.substring(start,end);
        }else{search = "nothing";}


        return search;
    }
}
