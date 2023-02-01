package javaprojects.arraypractice;

import java.util.Arrays;

public class Example2 {
/*  Write a program to do following operation
    on two dimensional list A of size m x n.
    You should use user-defined methods
    which accept 2-D array A,
    and its size m and n as arguments.
    The options are:

    To input elements into matrix of size m x n
    To display elements of matrix of size m x n
    Sum of all elements of matrix of size m x n
    To display row-wise sum of matrix of size m x n
    To display column-wise sum of matrix of size m x n*/
    public static void main(String[] args) {
        int[][] a = creatTwoDArray(4,4);
        System.out.println(Arrays.deepToString(a));
        printArray(a);
        System.out.println(sumOfArray(a));

    }
    public static int[][] creatTwoDArray(int m, int n){
        int[][] newMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[i][j] = (int) (Math.random()*100);
            }

        }
        return newMatrix;
    }
    public static void printArray(int[][] arr){
        int sumOfRow = 0;
        int sumOfColumn = 0;
        for (int[] a:arr) {
            sumOfRow = 0;
            System.out.print(Arrays.toString(a));
            for (int b:a) {
                sumOfRow += b;
            }
            System.out.println(" = "+sumOfRow);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

            }
        }

    }
    public static int sumOfArray(int[][] arr){
        int sum = 0;
        for (int[] out:arr) {
            for (int in:out) {
                sum += in;
            }
        }
        return sum;
    }
    public static void sumOfColumn(int[][] arr){

    }
}
