package unit06.array.day26.arrayshiftalgorithms;

public class ShiftLeft {
    public static void main(String[] args) {
        int[] firstArray = {1,2,3,4,5};

        int[] secondArray = new int[firstArray.length];

        for (int i = 0; i < firstArray.length-1; i++) {
            secondArray[i] = firstArray[i+1];
        }
        secondArray[firstArray.length-1] = firstArray[0];

        printArray(firstArray);
        printArray(secondArray);
        firstArray = secondArray;
        printArray(firstArray);

        /*System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));*/
    }
    public static void printArray(int[] arr){
        for (int num :
                arr) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
