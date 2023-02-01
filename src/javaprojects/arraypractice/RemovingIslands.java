package javaprojects.arraypractice;

import java.util.Arrays;

public class RemovingIslands {
    public static void main(String[] args) {
        /*int[][] matrix = {
                {1, 0, 0, 0, 0, 0},
                {0, 1, 0, 1, 1, 1},
                {0, 0, 1, 0, 1, 0},
                {1, 1, 0, 0, 1, 0},
                {1, 0, 1, 1, 0, 0},
                {1, 0, 0, 0, 0, 1},
        };
        printArray(matrix);
        System.out.println();
        printArray(removeIslands(matrix));
        System.out.println();*/
        int[][] matrix = createRandomArray();
        printArray(matrix);
        System.out.println();
        printArray(removeIslands(matrix));
    }
    public static int[][] removeIslands(int[][] arr){
        for (int i = 0; i < arr[0].length; i++) {
            if (arr[0][i]==1){
                arr[0][i]=2;
            }
        }
        for (int i = 0; i < arr[arr.length-1].length; i++) {
            if (arr[arr.length-1][i]==1){
                arr[arr.length-1][i]=2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0]==1){
                arr[i][0]=2;
            }else if(arr[i][arr[arr.length-1].length-1]==1){
                arr[i][arr[arr.length-1].length-1]=2;
            }
        }
        for (int i = 1; i < arr.length-1; i++) {
            for (int j = 1; j < arr[i].length-1; j++) {
                if(arr[i][j]==1&&(arr[i-1][j]==2||arr[i+1][j]==2||arr[i][j-1]==2||arr[i][j+1]==2)){
                    arr[i][j]=2;
                }
            }
        }
        for (int i = 1; i < arr.length-1; i++) {
            for (int j = arr[i].length-2; j > 0; j--) {
                if(arr[i][j]==1&&(arr[i-1][j]==2||arr[i+1][j]==2||arr[i][j-1]==2||arr[i][j+1]==2)){
                    arr[i][j]=2;
                }
            }
        }
        for (int i = arr.length-2; i > 0; i--) {
            for (int j = 1; j < arr[i].length-1; j++) {
                if(arr[i][j]==1&&(arr[i-1][j]==2||arr[i+1][j]==2||arr[i][j-1]==2||arr[i][j+1]==2)){
                    arr[i][j]=2;
                }
            }
        }
        for (int i = arr.length-2; i > 0; i--) {
            for (int j = arr[i].length-2; j > 0; j--) {
                if(arr[i][j]==1&&(arr[i-1][j]==2||arr[i+1][j]==2||arr[i][j-1]==2||arr[i][j+1]==2)){
                    arr[i][j]=2;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==1){
                    arr[i][j]=0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==2){
                    arr[i][j]=1;
                }
            }
        }
        return arr;
    }
    public static void printArray(int[][] arr){
        for (int[] a:arr) {
            System.out.println(Arrays.toString(a));
        }
    }
    public static int[][] createRandomArray(){
        int[][] randomArray = new int[(int) ((Math.random() * (11 - 5)) + 5)][(int) ((Math.random() * (11 - 5)) + 5)];
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++) {
                randomArray[i][j] = ((int) ((Math.random() * 2)));
            }
        }
        return randomArray;
    }
}
