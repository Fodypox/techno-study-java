package unit06.array.day25.arrayalgorithms;

public class FindTheSum {
    public static void main(String[] args) {
        int[] numbers = {213,33,45,65,34,23,545,23,456,232,454};
        System.out.println(returnSum(numbers));
        System.out.println(findSum(numbers));
        int ave = returnSum(numbers)/numbers.length;
        System.out.println(ave);
    }

    private static int returnSum(int[] numbers) {
        int sum = 0;
        for (int x :
                numbers) {
            sum = sum + x;
        }

        return sum;
    }

    public static int findSum(int[] a){
        int sum = 0;
        for (int x :
                a) {
            sum = sum + x;
        }
        return sum;
    }



}
