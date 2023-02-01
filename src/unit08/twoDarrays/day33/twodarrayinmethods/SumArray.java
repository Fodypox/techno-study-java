package unit08.twoDarrays.day33.twodarrayinmethods;

public class SumArray {
    public static void main(String[] args) {
        int[][] numbersArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {11, 12, 13},
                {16, 17},
                {116, 117, 1116, 11117}
        };
        System.out.println(sumArray(numbersArray));
        System.out.println(sumArrayIndex(numbersArray,1));


    }

    public static int sumArray(int[][] arr) {
        int total = 0;
        for (int[] out : arr) {
            for (int in : out) {
                total = total + in;
            }
        }
        return total;
    }
    public static int sumArrayIndex(int[][] arr, int arrayIndex) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int element : arr[i]) {
                if(i==arrayIndex){
                    total = total+element;
                }
            }
            /*for (int j = 0; j < arr[i].length; j++) {
                if(i==arrayIndex){
                    total = total+arr[i][j];
                }
            }*/
        }
        return total;
    }
}
