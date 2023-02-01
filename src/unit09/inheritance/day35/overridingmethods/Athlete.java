package unit09.inheritance.day35.overridingmethods;

public class Athlete {
    private String name;
    private String team;

    public Athlete(String name, String team) {
        this.name = name;
        this.team = team;
    }
    public void practice(){
        System.out.println("Athlete do practicing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }


}
