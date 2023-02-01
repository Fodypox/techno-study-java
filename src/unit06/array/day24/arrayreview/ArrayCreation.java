package unit06.array.day24.arrayreview;

public class ArrayCreation {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        int[] newArray = {1,2,3,4,5};

        intArray[intArray.length-1] = 50;
        System.out.println(intArray[intArray.length-1]);
        printElement(newArray);
        int[] arr3 = createArray();
        printElement(arr3);
    }

    public static void printElement(int[] num){
        System.out.println(num[0]);
    }

    public static int[] createArray(){
        int[] arr2 = {20,30,40};
        return arr2;
    }

}
