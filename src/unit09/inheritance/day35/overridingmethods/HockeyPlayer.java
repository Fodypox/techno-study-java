package unit09.inheritance.day35.overridingmethods;



public class HockeyPlayer extends Athlete {
    private int skateSize;

    public HockeyPlayer(String name, String team, int skateSize) {
        super(name, team);
        this.skateSize = skateSize;
    }
    public void practice(){
        shoot();
        pass();
    }

    /*public HockeyPlayer(){
        skateSize = 8;
    }*/
    public void shoot(){
        System.out.println("Hockey player is shooting");
    }

    public void pass(){
        System.out.println("Hockey player is passing");
    }
}
