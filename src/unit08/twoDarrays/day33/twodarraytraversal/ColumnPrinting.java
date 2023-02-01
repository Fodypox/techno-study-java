package unit08.twoDarrays.day33.twodarraytraversal;

public class ColumnPrinting {
    public static void main(String[] args) {
        int[][] numbersArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int sum = 0;
        for (int i = 0; i < numbersArray[i].length; i++) {
            sum = 0;
            for (int j = 0; j < numbersArray.length; j++) {
                sum = sum + numbersArray[j][i];
                System.out.print(numbersArray[j][i]+" ");

            }
            System.out.println(" = "+sum);
        }
    }
}
