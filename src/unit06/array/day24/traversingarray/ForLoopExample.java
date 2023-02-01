package unit06.array.day24.traversingarray;

public class ForLoopExample {
    public static void main(String[] args) {
        /*int[] num = {3,8,2,9,11,34,57};
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        int[] num2 = {3,8,2,9,11,34,57};
        for (int i = 0; i < num2.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        int[] num3 = {3,8,2,9,11,34,57};
        for (int i = 0; i < num3.length; i=i+2) {
            System.out.println(num[i] + " ");
        }*/

        /*int[] num4 = new int[5];
        for (int i = 0; i < num4.length; i++) {
            num4[i] = i*10;
        }

        int[] num5 = new int[7];
        for (int i = 0; i < num5.length; i=i+2) {
            num5[i] = i*10;
        }*/

        String[] arr = {"kjd","kjdsfksjjfl","jdhfkdjhf","jkhdfkjd","kjd"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].length());
        }

        String[] arr2 = {"kjd","kjdsfksjjfl","jdhfkdjhf","jkhdfkjd","kjd"};
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i].substring(0,1).toUpperCase()+arr2[i].substring(1);
            System.out.println(arr2[i]);


        }



    }
}
