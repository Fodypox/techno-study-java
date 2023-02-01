package unit09.inheritance.day35.overridingmethods;


import java.util.ArrayList;
import java.util.List;

public class AthleteMain {
    public static void main(String[] args) {
        Athlete athlete = new Athlete("John Doe","Team USA");
        athlete.practice();
        ArrayList<String> kicks = new ArrayList<>(List.of("Scorpion kick","Bicycle kick","Toe kick"));
        SoccerPlayer sp = new SoccerPlayer("Hagi","Galatasaray",8,kicks);
        sp.practice();
        sp.freeKick();
        HockeyPlayer hp = new HockeyPlayer("Ovechkin","NHL",8);
        hp.practice();

    }
}
