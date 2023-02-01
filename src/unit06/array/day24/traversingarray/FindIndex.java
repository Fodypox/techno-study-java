package unit06.array.day24.traversingarray;

public class FindIndex {
    public static void main(String[] args) {
        int[] someNum = {1,23,34,44,2,23,34,3,32};
        printArray(someNum);
        System.out.println();
        printRevArray(someNum);

    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void printRevArray(int[] arr){
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static int findElementIndex(int[] arr, int target){


        return target;
    }

}
