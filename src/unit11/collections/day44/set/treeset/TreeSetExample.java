package unit11.collections.day44.set.treeset;

import java.awt.*;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(List.of(123,4123,4,1234,124,123,41,234,1));
        System.out.println(treeSet);
        System.out.println("add 20: " + treeSet.add(20));
        System.out.println(treeSet);
        System.out.println("remove: 4123: "+treeSet.remove(4123));
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet);
        System.out.println("ceiling of 100: "+treeSet.ceiling(100));
        System.out.println(treeSet);
    }
}
