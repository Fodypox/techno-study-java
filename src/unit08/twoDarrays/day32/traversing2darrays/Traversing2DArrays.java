package unit08.twoDarrays.day32.traversing2darrays;

public class Traversing2DArrays {
    public static void main(String[] args) {
        int[][] twoDNumbers = {
                {11, 12, 13, 14},
                {16, 17, 18, 19, 20},
                {21, 22, 23},
                {26, 27, 28, 29},
        };
        /*for (int i = 0; i < twoDNumbers.length; i++) {
            System.out.print("{");
            for (int j = 0; j < twoDNumbers[i].length; j++) {
                if (j == twoDNumbers[i].length - 1) {
                    System.out.print(twoDNumbers[i][j]);
                } else {
                    System.out.print(twoDNumbers[i][j] + ", ");
                }
            }
            if (i == twoDNumbers.length - 1) {
                System.out.println("}");
            } else {
                System.out.println("},");
            }
        }*/
        for (int[] outer :
                twoDNumbers) {
            for (int inner :
                    outer) {
                System.out.print(inner + " ");
            }
            System.out.println();
        }
    }
}
