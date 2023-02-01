package unit06.array.day26.selfwork;

public class FindAll {
    public static void main(String[] args) {
        int[] numbers = {5,5,5,5,5,5,5,5,5,5};
        System.out.println(ifAll(numbers,4));
        String[] sample = {"apple","apple","apple","apple"};
        System.out.println(ifAll(sample,"apple"));

    }
    public static boolean ifAll(int[] arr, int key){

        for (int num :
                arr) {
            if(num!=key){
                return false;
            }
        }

        return true;
    }
    public static boolean ifAll(String[] arr, String key){

        for (String num :
                arr) {
            if(num!=key){
                return false;
            }
        }

        return true;
    }
}
