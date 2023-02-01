package unit08.twoDarrays.day33.twodarraytraversal;

public class ForLoopTraversal {
    public static void main(String[] args) {
        String[][] words = {
                {"apple","banana"},
                {"kiwi","lemon","lime"},
                {"strawberry","coconut","pineapple","dragon fruit"}
        };
        for (String[] row :
                words) {
            for (String column :
                    row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
