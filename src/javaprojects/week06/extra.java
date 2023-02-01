package javaprojects.week06;

import java.util.Scanner;

public class extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 digits:");
        int[] numbers = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};

        System.out.println("The sum of all the numbers is:" + getSum(numbers));
    }

    private static int getSum(int[] numbers) {
        int sum = numbers[0];
        for (int number: numbers) {
            sum = sum + number;
        }

        return sum;
    }
}
