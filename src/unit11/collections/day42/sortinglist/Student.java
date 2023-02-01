package unit11.collections.day42.sortinglist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student>{
    private String name;
    private Double GPA;

    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.GPA.compareTo(o.GPA);//(int) (this.GPA-o.GPA);
    }
}
class StudentMain{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(new Student("John",75.5),new Student("James",88),new Student("Blanka",69),new Student("Jane",50)));
        System.out.println(students);
        students.sort(Comparator.naturalOrder());
        System.out.println(students);
    }
}
