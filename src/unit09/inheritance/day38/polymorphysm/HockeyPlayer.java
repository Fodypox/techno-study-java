package unit09.inheritance.day38.polymorphysm;

public class HockeyPlayer extends Athlete{
    public HockeyPlayer(String name) {
        super(name);
    }

    @Override
    public void practice() {
        super.practice();
        shoot();
        pass();
    }
    public void shoot(){
        System.out.println("the player is shooting the puck.");
    }
    public void pass(){
        System.out.println("the player is passing the puck.");
    }
}
