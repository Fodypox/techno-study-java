package javaprojects.interviewquestion;

public class UsernameEmail {
    /* Get the username  part of an email with a method*/
    public static void main(String[] args) {
        String email = "aslanbek_turganbayev@gmail.com";
        System.out.println(surnameFromEmail(email));
    }

    public static String surnameFromEmail(String a){
        String surname = a.substring(a.indexOf("_")+1,a.indexOf("@"));
        return surname;
    }
}
