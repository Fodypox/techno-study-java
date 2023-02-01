package javaprojects.week06;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your HTML code");
        String code = sc.nextLine();
        System.out.println(getId(code));


    }

    public static String getId(String a){
        String id = "";
        int start = 0;
        int end = 0;
        if(a.contains("<html>")){
            for (int i = 0; i < a.length()-3; i++) {
                if(a.substring(i,i+3).equals("id=")){
                    start = i+5;
                    end = start+4;
                }
            }
            id = a.substring(start,end);
        }else{
            id = "Invalid input!";
        }

        return id;
    }
}
