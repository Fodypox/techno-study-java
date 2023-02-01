package javaprojects.interviewquestion;

public class SwapStrings {
    public static void main(String[] args) {
        /*swap strings*/
        String x = "Hello" ;
        String y = "Welcome" ;
        x=x+y;
        System.out.println(x);
        y=x.substring(0,x.length()-y.length());
        System.out.println(y);
        x=x.substring(y.length());
        System.out.println(x);
    }
}
