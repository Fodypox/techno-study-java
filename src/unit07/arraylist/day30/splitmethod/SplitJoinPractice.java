package unit07.arraylist.day30.splitmethod;

public class SplitJoinPractice {
    public static void main(String[] args) {
        /*Get a String and turn the first letters of each word into a uppercase letter and print them on the screen*/
        String sentence = "Java is an object oriented programming language";
        String[] words = sentence.split(" ");
        for (String word :
                words) {
            System.out.println(word.substring(0,1).toUpperCase()+word.substring(1));
        }
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0,1).toUpperCase()+words[i].substring(1);
        }

        String updatedSentence = String.join(" ",words);
        System.out.println(updatedSentence);

        String[] someWords = {"Hello","world","of","Java"};
        String joinedWords = String.join("-",someWords);
        System.out.println(joinedWords);



/*
        String sentence2 = "Java is an object oriented programming language";
        String[] words2 = sentence.split(" ");
*/

    }
}
