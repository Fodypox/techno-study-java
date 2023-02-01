package unit11.collections.day44.set.linkedhash;

import java.awt.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Integer> linkedHashIntegerSet = new LinkedHashSet<>(List.of(4,3,7,6,8,9));
        linkedHashIntegerSet.add(4);
        System.out.println(linkedHashIntegerSet);
    }
}
