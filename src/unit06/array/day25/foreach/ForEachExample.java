package unit06.array.day25.foreach;

public class ForEachExample {
    public static void main(String[] args) {
        int[] arr = {12, 322, 4, 565, 76, 43, 223, 45, 223};
        for (int num :
                arr) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }

        }

        for (int num :
                arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }

        }
        System.out.println();


        String[] length = {"jsddskhds", "jdd", "kjdfsdn", "dbn", "jbdmdssdn", "mnd"};
        for (String l :
                length) {
            if (l.length() >= 5) {
                System.out.print(l + " ");
            }
        }




    }
}
