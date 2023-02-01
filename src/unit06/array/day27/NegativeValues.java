package unit06.array.day27;

public class NegativeValues {
    public static void main(String[] args) {
        int[] numbers = {1, 3, -4, 5, -1, 2, -4};
        System.out.println(numOfNegatives(numbers));

    }

    public static int numOfNegatives(int[] a) {
        int count = 0;
        for (int num :
                a) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }
}
