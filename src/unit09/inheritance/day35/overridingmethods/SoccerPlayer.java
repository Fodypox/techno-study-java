package unit09.inheritance.day35.overridingmethods;



import java.util.ArrayList;

public class SoccerPlayer extends Athlete {
    private int cleatSize;
    private ArrayList<String> kickStyle;

    public SoccerPlayer(String name, String team, int cleatSize, ArrayList<String> kickStyle) {
        super(name, team);
        this.cleatSize = cleatSize;
        this.kickStyle = kickStyle;
    }

    public void practice(){
        System.out.println("Soccer player is practicing the kicks");
        for (String kickStyle:kickStyle) {
            System.out.println("Practicing the "+kickStyle);
        }
    }

    public int getCleatSize() {
        return cleatSize;
    }

    public ArrayList<String> getKickStyle() {
        return kickStyle;
    }

    /*public SoccerPlayer(){
        cleatSize = 9;
        kickStyle = new ArrayList<>();
        kickStyle.add("Trivela kick");
        kickStyle.add("Toe kick");
    }*/

    public void freeKick(){
        System.out.println("Soccer player is taking free kick");
    }
}
