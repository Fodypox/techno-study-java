package javaprojects.week05;

import java.util.Scanner;

public class Assignment9 {
    static String getInfo(String email){
        String name, lastname, domain, toplevel;
        name = email.substring(0, email.indexOf("_"));
        String first = name.substring(0, 1).toUpperCase() + name.substring(1);
        lastname = email.substring(name.length() + 1, email.indexOf("@"));
        String last = lastname.substring(0, 1).toUpperCase() + lastname.substring(1);
        domain = email.substring(name.length() + lastname.length() + 2, email.indexOf("."));
        toplevel = email.substring(name.length() + lastname.length() + 3 + domain.length());
        String info = "Name     : " + first + "\n" +  "Surname  : " + last  + "\n" + "domain   : " + domain + "\n"+ "toplevel : " + toplevel;
        return info;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String input = sc.nextLine();
        System.out.println(getInfo(input));

    }

}
