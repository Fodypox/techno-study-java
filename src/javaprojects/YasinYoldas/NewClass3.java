package javaprojects.YasinYoldas;

public class NewClass3 {
    public static void main(String[] args) {
        /*Create a method that prints array like "2, 3, 4, 2, 12"*/
        int[] arr = {2, 3, 4, 2, 12};
        printNumbers(arr);

    }
    public static void printNumbers(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }
}
