package unit06.array.day26.selfwork;

public class NumberOfOccurences {
    public static void main(String[] args) {
        String[] words = {"apple","banana","apple","orange"};
        int[] number = {7,6,5,7,5,4,3,5,7,1};
        System.out.println(numberOfOccurences(words,"apple"));
        System.out.println(numberOfOccurences(number,7));


    }

    public static int numberOfOccurences(String[] arr, String key){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length()-key.length()+1; j++) {
                if(arr[i].substring(j,j+key.length()).equals(key)){
                    count++;
                }
            }
        }

        return count;
    }

    public static int numberOfOccurences(int[] arr, int key){
        int count = 0;
        for (int num :
                arr) {
            if(num==key){
                count++;
            }
        }

        return count;
    }
}
