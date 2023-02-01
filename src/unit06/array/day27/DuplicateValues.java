package unit06.array.day27;

public class DuplicateValues {
    public static void main(String[] args) {
        int[] numbers = {7, 1, 2, 4, 7, 5, 8};

        System.out.println(checkDuplicate(numbers));

}

    public static boolean checkDuplicate(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
