package unit06.array.day27;

public class FindTheShortest {
    public static void main(String[] args) {
        String[] words = {"apple","banana","kiwi","strawberry"};
        System.out.println(shortestWord(words));

    }
    public static String shortestWord(String[] arr){
        String a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i].length()<a.length()){
                a = arr[i];
            }
        }
        return a;
    }
}
