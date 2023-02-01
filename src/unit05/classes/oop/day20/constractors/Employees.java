package unit05.classes.oop.day20.constractors;

public class Employees {
    private String id;
    private double salary;
    private boolean isManager;
    private String fullName;

    public Employees() {
        id = "kjdhf";
        salary = 150000.0;
        isManager = true;
        fullName = "Aslanbek";
    }

    public Employees(String id, double salary, boolean isManager, String fullName) {
        this.id = id;
        this.salary = salary;
        this.isManager = isManager;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id='" + id + '\'' +
                ", salary=" + salary +
                ", isManager=" + isManager +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
