package javaprojects.interviewquestion;

public class SwapNumbers {
    /*swap numbers
    int a = 10;
    int b = 20;*/
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+" "+b);
        swapNumbers(a,b);

    }
    public static void swapNumbers(int x, int z){
        int temp = x;
        x = z;
        z = temp;
        System.out.println(x+" "+z);
    }
}
