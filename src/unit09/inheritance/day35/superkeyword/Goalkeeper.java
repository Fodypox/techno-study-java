package unit09.inheritance.day35.superkeyword;

import java.util.ArrayList;

public class Goalkeeper extends SoccerPlayer{
    private int gloveSize;

    public Goalkeeper(String name, String team, int cleatSize, ArrayList<String> kickStyle, int gloveSize) {
        super(name, team, cleatSize, kickStyle);
        this.gloveSize = gloveSize;
    }

    /*public Goalkeeper(){
        gloveSize = 4;
    }*/
    public void goalKicks(){
        System.out.println("Goalkeeper is practicing goal kicks.");
    }
    public void practice(){
        System.out.println("The player is practicing the saving styles.");
        super.practice();
    }
}
