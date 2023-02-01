package unit06.array.day23.arrayinmethods;

public class ArrayAsAParameter {
    public static void main(String[] args) {
        int[] intArr = {100,2,3};
        printFirstElement(intArr);
        printLastElement(intArr);
        System.out.println(printMiddleElement(intArr));
        int[] myArray = createNewArray(intArr);
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);

    }

    public static void printFirstElement(int[] numbers){
        System.out.println(numbers[0]);
    }

    public static void printLastElement(int[] numbers){
        System.out.println(numbers[numbers.length-1]);
    }

    public static int printMiddleElement(int[] numbers){
        return numbers[(numbers.length-1)/2];
    }

    public static int[] createNewArray(int[] numbers){
        int[] newArray = {numbers[0], numbers[numbers.length-1]};
        return newArray;
    }
}
