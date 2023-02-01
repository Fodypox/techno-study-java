package unit06.array.day26.selfwork;

public class FindAny {
    public static void main(String[] args) {
        int[] numbers = {2,3,4,6,7,8,8,6,54,4};
        System.out.println(ifAny(numbers,2));
        String[] sample = {"apple", "banana","kiwi","lemon"};
        System.out.println(ifAny(sample,"orange"));


    }

    public static boolean ifAny(int[] arr, int key){

        for (int num :
                arr) {
            if(num==key){
                return true;
            }
        }

        return false;
    }
    public static boolean ifAny(String[] arr, String key){

        for (String num :
                arr) {
            if(num.equals(key)){
                return true;
            }
        }

        return false;
    }

}
