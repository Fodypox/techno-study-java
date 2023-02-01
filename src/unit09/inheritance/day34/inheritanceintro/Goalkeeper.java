package unit09.inheritance.day34.inheritanceintro;

public class Goalkeeper extends SoccerPlayer{
    private int gloveSize;

    public Goalkeeper(){
        gloveSize = 4;
    }
    public void goalKicks(){
        System.out.println("Goalkeeper is practicing goal kicks");
    }
}
