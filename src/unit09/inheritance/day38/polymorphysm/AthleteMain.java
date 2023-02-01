package unit09.inheritance.day38.polymorphysm;

public class AthleteMain {
    public static void main(String[] args) {
        Athlete hockeyPlayer = new HockeyPlayer("Tim Horton");
        hockeyPlayer.practice();
        if(hockeyPlayer instanceof HockeyPlayer){
            ((HockeyPlayer) hockeyPlayer).shoot();
            ((HockeyPlayer) hockeyPlayer).pass();
        }
    }
}
