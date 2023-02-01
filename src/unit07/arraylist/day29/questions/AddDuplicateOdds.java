package unit07.arraylist.day29.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class AddDuplicateOdds {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(-34, 45, 23, 78, 90, 12, 33, -12, 45));
        for (int i = 0; i < numbers1.size(); i++) {
            if(numbers1.get(i)%2==1){
                numbers1.add(i,numbers1.get(i));
                i++;
            }
        }
        System.out.println(numbers1);

    }
}
