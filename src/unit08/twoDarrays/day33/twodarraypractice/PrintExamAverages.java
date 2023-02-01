package unit08.twoDarrays.day33.twodarraypractice;

import java.util.Arrays;

public class PrintExamAverages {
    public static void main(String[] args) {
        int[][] exams = {
                {56, 59, 84, 92, 76},
                {83, 79, 96, 100, 88},
                {97, 89, 95, 85, 93}
        };
        System.out.println(printAverage(exams));
    }

    public static double printAverage(int[][] arr) {
        double ave = 0;
        double sum = 0;
        int total = 0;
        for (int[] out : arr) {
            for (int in : out) {
                sum = sum + in;
                total++;
            }
        }
        ave = sum / total;
        return ave;
    }
}
