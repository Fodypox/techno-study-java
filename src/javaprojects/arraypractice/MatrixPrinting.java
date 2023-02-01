package javaprojects.arraypractice;

public class MatrixPrinting {
    public static void main(String[] args) {
        Integer[][] matrix = {
                {23, 73, 15},
                {56, 33, 21},
                {34, 78, 87},
                {22, 90, 74},
                {76, 89, 55}
        };
        String[][] words = {
                {"apple","banana"},
                {"kiwi","lemon","lime"},
                {"strawberry","coconut","pineapple","dragon fruit"}
        };
        printMatrix(matrix);
        printMatrix(words);
    }

    static void printMatrix(Object[][] matrix) {
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                System.out.print(matrix[y][x] + " "); //внутри строки
            }
            System.out.println(); //переход на новую строку
        }
    }
}
