package javaprojects.week09;

public class Assignment15 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int max = findMax(numbers);
        System.out.println(max);
    }

    private static int findMax(int[] numbers) {
        int max=0;
        for (int a:numbers) {
            if (a>max){
                max = a;
            }
        }
        return max;
    }
}
