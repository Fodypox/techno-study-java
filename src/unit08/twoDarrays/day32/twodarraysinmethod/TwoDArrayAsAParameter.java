package unit08.twoDarrays.day32.twodarraysinmethod;

public class TwoDArrayAsAParameter {
    public static void main(String[] args) {
        String[][] words = {
                {"apple","banana"},
                {"kiwi","lemon","lime"},
                {"strawberry","coconut","pineapple","dragon fruit"}
        };

        printAllElements(words);

    }

    public static void printAllElements(String[][] a){
        for (String[] outer :
                a) {
            for (String inner:
                 outer ) {
                System.out.print(inner+" ");
            }
            System.out.println();
        }
    }
}
