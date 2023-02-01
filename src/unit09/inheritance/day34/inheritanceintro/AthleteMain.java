package unit09.inheritance.day34.inheritanceintro;

public class AthleteMain {
    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        System.out.println(athlete.getName());
        athlete.practice();

        Swimmer swimmer = new Swimmer();
        System.out.println(swimmer.getName());
        swimmer.dive();
    }
}
