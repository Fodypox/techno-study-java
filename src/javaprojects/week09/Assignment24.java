package javaprojects.week09;

public class Assignment24 {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        int size = arr.length;
        int idx = 0;
        /*idx = size-1;*/
        arr[idx] = arr[size-1];
        System.out.println(arr[idx]);
    }
}
