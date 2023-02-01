package unit09.inheritance.day35.superkeyword;

import java.util.ArrayList;
import java.util.List;

public class AthleteMain {
    public static void main(String[] args) {
        ArrayList<String> kicks = new ArrayList<>(List.of("Scorpion kick", "Bicycle kick", "Toe kick"));
        SoccerPlayer sp = new SoccerPlayer("Hagi", "Galatasaray", 8, kicks);
        sp.practice();
        Goalkeeper gk = new Goalkeeper("Casillas", "Real Madrid", 8, kicks, 6);
        gk.practice();


    }
}
