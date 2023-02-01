package unit05.classes.oop.day22;

import java.util.Scanner;

public class Numbers {
    // Ask user to enter 10 numbers
    // and print how many of those numbers
    // are greater than the number entered before it

    // user input : 5, 12, 45, 30, 38, 21, 15, 89, 50, 46
    // output : 4
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 numbers one by one to compare");
        int count = 0;
        int previousNumber = 0;
        for (int i = 0; i < 10; i++) {


            System.out.println("please enter the " + i+1 + " number");

            int nextNumber = scanner.nextInt();
            if(i==0){previousNumber=nextNumber;}

            if (nextNumber > previousNumber) {
                count++;
            }
            previousNumber=nextNumber;
        }
        System.out.println(count);
    }
}
