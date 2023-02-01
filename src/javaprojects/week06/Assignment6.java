package javaprojects.week06;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your input");
        String data = scan.nextLine();

        System.out.println(getName(data));

    }

    public static String getName(String data){
        String firstName;
        String lastName;
        String search1 = "“firsName”: “";
        String search2 = "“lastName”: “";
        String result;
        firstName = data.substring(data.indexOf(search1)+search1.length(),data.lastIndexOf(",")-1);
        lastName = data.substring(data.indexOf(search2)+search2.length(),data.lastIndexOf("}")-2);
        result = "First name : " + firstName + "\nLast name : " + lastName;
        return result;
    }
}
