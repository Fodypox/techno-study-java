package unit09.inheritance.day34.inheritanceintro;

import java.util.ArrayList;

public class SoccerPlayer extends Athlete{
    private int cleatSize;
    private ArrayList<String> kickStyle;

    public SoccerPlayer(){
        cleatSize = 9;
        kickStyle = new ArrayList<>();
        kickStyle.add("Trivela kick");
        kickStyle.add("Toe kick");
    }

    public void freeKick(){
        System.out.println("Soccer player is taking free kick");
    }
}
