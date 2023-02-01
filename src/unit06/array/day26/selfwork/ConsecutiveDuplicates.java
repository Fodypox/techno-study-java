package unit06.array.day26.selfwork;

public class ConsecutiveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {3,4,2,3,3,4,5,1};
        System.out.println(consecutiveDuplicate(numbers));

    }
    public static boolean consecutiveDuplicate(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
}
