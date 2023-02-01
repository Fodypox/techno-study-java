package unit05.classes.oop.day20.constractors;

public class EmployeeMain {
    public static void main(String[] args) {
        Employees employees1 = new Employees();
        Employees employees2 = new Employees("idjhdlksjf",200000,false,"John Doe");
        System.out.println(employees1);
        System.out.println(employees2);
    }
}
