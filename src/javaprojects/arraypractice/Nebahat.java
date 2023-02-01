package javaprojects.arraypractice;

import java.util.Scanner;

public class Nebahat {
    public static void main(String[] args) {
        printFibonacciSeries();

    }
    public static void printFibonacciSeries(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= scan.nextInt();
        int previous=0;
        int last=1;
        int result = 0;
        String str="";
        if(num==0){
            System.out.println(0);
        } else if (num==1) {
            System.out.println(0+ ","+1);
        } else if (num>=2) {
            for (int i =0; i < num; i++) {
                if(last>=num){
                    break;
                }
                str +=result + ",";
                result = previous + last;
                previous = last;
                last = result;


            }
            System.out.println(str.substring(0,str.length()-1));
        }

    }
}
