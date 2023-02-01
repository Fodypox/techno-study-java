package unit09.inheritance.day35.overridingmethods;



public class Swimmer extends Athlete {
    private String swimStyle;

    public Swimmer(String name, String team, String swimStyle) {
        super(name, team);
        this.swimStyle = swimStyle;
    }

    /* public Swimmer(){
        swimStyle = "Butterfly";
    }*/

    public void dive(){
        System.out.println("Swimmer is diving");
    }
}
