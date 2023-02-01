package unit06.array.day26.arrayshiftalgorithms;

import java.util.Arrays;

public class ShiftRight {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5};

        /*int[] secondArray = new int[firstArray.length];

        for (int i = 0; i < firstArray.length - 1; i++) {
            secondArray[i + 1] = firstArray[i];
        }
        secondArray[0] = firstArray[firstArray.length - 1];

        printArray(firstArray);
        printArray(secondArray);
        firstArray = secondArray;
        printArray(firstArray);*/
        printArray(firstArray);
        printArray(multipleShifts(firstArray, 2));

        /*System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));*/
    }

    public static int[] multipleShifts(int[] arr, int iteration) {
        int[] secondArray = new int[arr.length];
        for (int j = 0; j < iteration; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                secondArray[i + 1] = arr[i];
            }
            secondArray[0] = arr[arr.length - 1];
        }
        return secondArray;
    }

    public static void printArray(int[] arr) {
        for (int num :
                arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
