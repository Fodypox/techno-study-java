package javaprojects.week05;

import java.util.Scanner;

public class Assignment8 {
    static String getMyName(String email, String name){
        if(email.contains(name)){
            return "Read This Email.";
        }
        return "Do not read.";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email, name;
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter the email: ");
        email = sc.nextLine();
        System.out.println(getMyName(email, name));

    }
}
