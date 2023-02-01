package unit05.classes.oop.day22;

public class CoinFlip {
    public static void main(String[] args) {
        // Write a program that simulates the tossing of a coin ten times.
        // Each time the coin is tossed, the program should display HEADS or TAILS
        // Your program should keep track of how many times each possiblity is
        // tossed and display statistics at the end.

        // HEADS
        // TAILS
        // HEADS
        // HEADS
        // HEADS
        // TAILS
        // TAILS
        // HEADS
        // HEADS
        // TAILS

        // 6 HEADS
        // 4 TAILS

        String tossResult = "";

        int countHeads = 0;
        int countTails = 0;
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 2) + 1;
            switch (randomNumber) {
                case 1:
                    tossResult = "HEADS";
                    break;
                case 2:
                    tossResult = "TAILS";
                    break;
            }

            if (tossResult.equals("HEADS")) {
                countHeads++;
            } else {
                countTails++;
            }
        }
        System.out.println(countHeads + " HEADS");
        System.out.println(countTails + " TAILS");
    }
}
