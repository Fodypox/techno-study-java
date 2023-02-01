package unit09.inheritance.day34.inheritanceintro;

public class Athlete {
    private String name;
    private int birthYear;
    private String team;

    public Athlete(){
        name = "John Doe";
        birthYear = 1991;
        team = "Team USA";

    }

    public Athlete(String name, int birthYear, String team) {
        this.name = name;
        this.birthYear = birthYear;
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", team='" + team + '\'' +
                '}';
    }
}
