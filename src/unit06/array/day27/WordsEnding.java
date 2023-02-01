package unit06.array.day27;

public class WordsEnding {
    public static void main(String[] args) {
        String[] words = {"region", "city","state","solution","country","street"};
        endWith(words);

    }
    public static void endWith(String[] a){
        String sample = "ion";
        for (String word :
                a) {
            if(word.endsWith(sample)){
                System.out.print(word + " ");
            }
        }
    }
}
