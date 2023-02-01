package unit11.collections.day42.sortinglist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeMain{
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>(List.of(new Employee("John",33,120000),new Employee("Kimberly",24,90000),new Employee("Kevin",42,200000)));
        employeeList.sort(Comparator.comparing(Employee::getName).reversed());
        System.out.println(employeeList);
        employeeList.sort(Comparator.comparing(Employee::getSalary));
        System.out.println(employeeList);
        employeeList.sort(Comparator.comparing(Employee::getAge));
        System.out.println(employeeList);
    }
}
