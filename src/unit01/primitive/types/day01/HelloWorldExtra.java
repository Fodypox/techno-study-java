package unit01.primitive.types.day01;

import java.util.Scanner;

public class HelloWorldExtra {
    public static void main(String[] args) {
//        System.out.println("Daily Schedule");
//        System.out.println();
//        System.out.println("|| 8 AM");
//        System.out.println("||");
//        System.out.println("|| 9 AM - Meeting with a client");
//        System.out.println("||");
//        System.out.println("|| 10 AM");
//        System.out.println("||");
//        System.out.println("|| 11 AM - Send the weekly report");
//        System.out.println("||");
//        System.out.println("|| 12 PM - Lunch");
//        System.out.println("||");
//        System.out.println("|| 1 PM - Work on the project");
//        System.out.println("||");
//        System.out.println("|| 2 PM");
//        System.out.println("||");
//        System.out.println("|| 3 PM - Pick up the kids from the bus stop");
//        System.out.println("Daily Schedule\n\n|| 8 AM\n||\n|| 9 AM - Meeting with a client\n||\n|| 10 AM\n||\n|| 11 AM - Send the weekly report\n||\n|| 12 PM - Lunch\n||\n|| 1 PM - Work on the project\n||\n|| 2 PM\n||\n|| 3 PM - Pick up the kids from the bus stop");


        // Write a code that gets numbers from the user and asks
        // if the user wants to put another number
        // After the user prints no the program
        // should print the sum of the numbers that are given by the user

        // Write a code that produces a random number between 1 and 100,
        // and asks the user to guess that number. The user must guess the number
        // in 10 attempts. If the guess of the user is higher than the random number
        // print "Too High" and then print the number of attempts left,
        // if the user's guess is lower than the random number
        // print "Too Low" and then print the number of attempts left,
        // if the guess of the user is correct print "Congrats! You win". If the user is not
        // able to guess the number in 10 attempts print "Sorry! You lost"

//        int randomNumber = (int)(Math.random()*100)+1;
//        int attempts = 1;
//        Scanner scanner = new Scanner(System.in);
//        while (attempts<11){
//            System.out.println("Try to guess the random number");
//            int answerOfUser = scanner.nextInt();
//            if (answerOfUser == randomNumber){
//                System.out.println("Congrats! You win");
//                break;
//            }else if (answerOfUser>randomNumber){
//                System.out.println("Too High");
//                System.out.println("You have "+(10-attempts)+" attempts left");
//            }else{
//                System.out.println("Too Low");
//                System.out.println("You have "+(10-attempts)+" attempts left");
//            }
//
//            if(attempts==10){
//                System.out.println("Sorry, you lost");
//            }
//            attempts++;
//        }
        // Write a code that gives the sum of the digits of a given number
//        System.out.println("Enter the number");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int total = 0;
        for (int i = 5; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
}
