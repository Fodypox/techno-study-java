package javaprojects.Nurcan;

import java.util.Scanner;

public class Assignment4 {

//    <!DOCTYPE html> <html> <head> <title> Java < /title> < /head> <body> <p id= “myid”> </p>
//     </body> </html>

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter html variable");
        String code = input.nextLine();
        System.out.println(getId(code));
    }
     public static String getId(String code) {
        String id="";
        if (code.contains("<html>")) {
            id= code.substring(code.indexOf("id")+5, code.lastIndexOf("p")-5);

        } else {
            id="Invalid input!";
        }
        return id;

    }
}



