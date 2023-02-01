package unit06.array.day25.arrayalgorithms;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] numbers = {213,33,45,65,34,23,545,23,456,232,454};

        int max = numbers[0];
        int min = numbers[0];
        int ave;
        System.out.println(findMax(numbers,max));

        for (int sample :
                numbers) {
            if(max<sample){
                max=sample;
            }
        }
        System.out.println(max);

        for (int sample :
                numbers) {
            if(min>sample){
                min=sample;
            }
        }
        System.out.println(min);

        int x = Integer.MAX_VALUE;
        System.out.println(x);
        int y = Integer.MIN_VALUE;
        System.out.println(y);
    }

    public static int findMax(int[] arr, int max){
        for (int sample :
                arr) {
            if(max<sample){
                max=sample;
            }

        }
        return max;
    }
}
