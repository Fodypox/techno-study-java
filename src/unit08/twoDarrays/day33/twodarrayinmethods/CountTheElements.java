package unit08.twoDarrays.day33.twodarrayinmethods;

public class CountTheElements {
    public static void main(String[] args) {
        int[][] numbersArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {11, 12, 13},
                {16, 17},
                {116, 117, 1116, 11117}
        };
        System.out.println(countElements(numbersArray));

    }
    public static int countElements(int[][] arr){
        int count = 0;
        for (int[] a:
             arr) {
            count = count + a.length;
        }
        return count;
    }
}
