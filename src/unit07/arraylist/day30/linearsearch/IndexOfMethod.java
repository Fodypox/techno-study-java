package unit07.arraylist.day30.linearsearch;

import java.util.ArrayList;
import java.util.Arrays;

public class IndexOfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(-34, 45, 23, 78, 9, 13, 33, -12, 45));

        System.out.println(numbers1.indexOf(9));
        System.out.println(numbers1.get(numbers1.indexOf(9)));
        System.out.println(numbers1.indexOf(10));

        ArrayList<String> countries = new ArrayList<>(Arrays.asList("Kazakhstan","USA","Turkey","Ukraine","Palestine"));

        System.out.println(countries.indexOf("USA"));
        System.out.println(countries.indexOf("Ukraine"));
        System.out.println(countries.indexOf("England"));

    }


}
