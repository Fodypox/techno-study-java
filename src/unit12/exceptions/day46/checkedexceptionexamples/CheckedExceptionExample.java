package unit12.exceptions.day46.checkedexceptionexamples;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("notExistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("No file found");
        }
        System.out.println("After try catch");
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("The exception message is: "+e.getMessage());
            System.out.println("you cannot divide by 0");
        }


    }
}
