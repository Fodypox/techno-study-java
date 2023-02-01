package unit09.inheritance.day34.inheritanceintro;

public class Swimmer extends Athlete{
    private String swimStyle;

    public Swimmer(){
        swimStyle = "Butterfly";
    }

    public void dive(){
        System.out.println("Swimmer is diving");
    }
}
