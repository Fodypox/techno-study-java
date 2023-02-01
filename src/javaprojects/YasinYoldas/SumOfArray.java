package javaprojects.YasinYoldas;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 12};
        sumOfArray(arr);
    }
    public static void sumOfArray(int[] arr){
        int sum = 0;
        for (int a:arr) {
            sum += a;
        }
        System.err.println(sum);
    }
}
