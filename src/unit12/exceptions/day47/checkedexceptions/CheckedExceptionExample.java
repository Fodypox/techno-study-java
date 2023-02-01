package unit12.exceptions.day47.checkedexceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader("nofile.jpg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        newMethod();

    }
    public static void newMethod() throws FileNotFoundException {
        FileReader fileReader2 = new FileReader("another.txt");
    }
}
