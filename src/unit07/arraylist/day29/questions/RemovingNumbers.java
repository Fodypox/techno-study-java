package unit07.arraylist.day29.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(150,28,31,104,15,600,759,98,99));
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)<100){
                numbers.remove(i);
                i--;
            }

        }
        System.out.println(numbers);

    }
}
