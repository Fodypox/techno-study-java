package unit07.arraylist.day29.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class AddTwoALValues {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(-34, 45, 23, 78, 90, 12, 33, -12, 45));
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(51, 58, 32, 58, 91, 57, 64, -19, -61));
        ArrayList<Integer> sum = new ArrayList<>();
        for (int i = 0; i < numbers1.size(); i++) {
            sum.add(numbers1.get(i)+numbers2.get(i));
        }
        System.out.println(sum);
    }
}
