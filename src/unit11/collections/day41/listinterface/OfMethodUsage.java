package unit11.collections.day41.listinterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OfMethodUsage {
    public static void main(String[] args) {
        List<String> words = List.of("Hey", "Hi", "How are you?");
        List<String> wordsArraylist = new ArrayList<>();
        wordsArraylist = new LinkedList<>();
        wordsArraylist.add("another word");
        System.out.println(wordsArraylist);

    }
}
