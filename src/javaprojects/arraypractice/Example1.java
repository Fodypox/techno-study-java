package javaprojects.arraypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example1 {
    public static void main(String[] args) {
        /* TODO Suppose A, B, C are lists of integers.
        The numbers in list A appear in ascending order
        while the numbers in list B appear in descending order.
        Write a user defined method in Java to produce third list C
        by merging list A and B in ascending order.
        Use A, B and C as arguments in the method.
        */
        ArrayList<Integer> A = createArrayList(6);
        Collections.sort(A);
        System.out.println(A);
        ArrayList<Integer> B = createArrayList(10);
        Collections.sort(B);
        Collections.reverse(B);
        System.out.println(B);
        ArrayList<Integer> C = mergeArrayList(A,B);
        System.out.println(C);

    }
    public static ArrayList<Integer> createArrayList(int size){
        ArrayList<Integer> returnList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            returnList.add((int) (Math.random()*100));
        }
        
        return returnList;
    }
    public static ArrayList<Integer> mergeArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> c = new ArrayList<>();
        c.addAll(list1);
        c.addAll(list2);
        Collections.sort(c);


        return c;
    }
}
