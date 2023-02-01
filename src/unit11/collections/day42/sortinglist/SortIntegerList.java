package unit11.collections.day42.sortinglist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortIntegerList {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(23,45,56,545,46,542,6546,25,878));
        integerList.sort(Comparator.naturalOrder());
        System.out.println(integerList);
        integerList.sort(Comparator.reverseOrder());
        System.out.println(integerList);
        List<String> names = new ArrayList<>(List.of("lskdjf","kwjsk","lifdsk","sahgfdhgsd","dvahdf","ytdsv"));
        System.out.println(names);
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
        names.sort(Comparator.reverseOrder());
        System.out.println(names);
    }
}
