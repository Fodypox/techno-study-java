package unit05.classes.oop.day21.gettersandsetters;

public class Emploee {
    private String employeeId;
    private double salary;
    private String name;

    public Emploee(String employeeId, double salary, String name) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "employeeId='" + employeeId + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
