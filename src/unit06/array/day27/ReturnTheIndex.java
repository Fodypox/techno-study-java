package unit06.array.day27;

public class ReturnTheIndex {
    public static void main(String[] args) {
        int[] numbers = {7,10,9,51,3};
        System.out.println(returnTheIndexOfMax(numbers));
    }
    public static int returnTheIndexOfMax(int[] a){
        int indexOfMax = 0;
        int maxValue = a[0];
        for (int i = 0; i < a.length; i++) {
            if(maxValue<a[i]){
                maxValue = a[i];
                indexOfMax = i;

            }
        }
        return indexOfMax;
    }
}
