package javaprojects.arraypractice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please type a number of iterations to be done in Fibonacci secuence: ");
        int secuenceAmount = sc.nextInt();
        fibonacciSecuence(secuenceAmount);


    }

    public static void fibonacciSecuence(int a) {
        int fibonacci = 1;
        int iteration = 0;
        System.out.print("[ ");
        if(a==0){
            System.out.print(0);
        }
        for (int i = 0; i < a; i++) {
            if (i==0){
                System.out.print(0+", ");
            }
            if(i==(a-1)){
                System.out.print(fibonacci);
            }else {
                System.out.print(fibonacci + ", ");
                fibonacci = fibonacci + iteration;
                iteration = fibonacci - iteration;
            }
        }
        System.out.println(" ]");
    }
}
