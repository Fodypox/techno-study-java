package unit12.exceptions.day47.uncheckedexception;

import java.io.FileNotFoundException;

public class UncheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        divide();
        openFile();
    }
    public static void divide() throws RuntimeException{
        System.out.println("I might throw an unchecked exception");
    }
    public static void openFile() throws FileNotFoundException{
        System.out.println("I might throw a checked exception");
    }
}
