package unit08.twoDarrays.day33.twodarrayinmethods;

public class FindMinimumValue {
    public static void main(String[] args) {
        int[][] twoDNumbers = {
                {11, 12, 13, 14,},
                {16, 17, 18, 19, 20},
                {21, 22, 23},
                {26, 27, 28, 29},
        };
        System.out.println(returnMinValue(twoDNumbers));

    }

    public static int returnMinValue(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] out : arr) {
            for (int in : out) {
                if (in < min) {
                    min = in;
                }
            }
        }
        return min;
    }
}
