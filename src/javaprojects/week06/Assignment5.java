package javaprojects.week06;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the number");
        int tree = sc.nextInt();
        getTriangle(tree);

    }

    public static void getTriangle(int a){
        for (int i = 0; i < a; i++) {
            System.out.println();
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
        }
    }
}
