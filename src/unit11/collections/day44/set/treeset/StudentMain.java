package unit11.collections.day44.set.treeset;

import java.awt.*;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        TreeSet<Student> studentTreeSet = new TreeSet<>(Comparator.comparing(Student::getGpa));
        studentTreeSet.addAll(List.of(new Student("John", 3.65), new Student("Mark", 3.79), new Student("David", 2.00),
                new Student("Jessica", 4.00), new Student("Linda", 2.86), new Student("Hugh", 2.65), new Student("Michael", 3.12),new Student("Dan",4.5),
                new Student("Jane", 3.88)));
        System.out.println(studentTreeSet);
        System.out.println("Highest GPA student: "+studentTreeSet.last());
        System.out.println("Highest GPA student: "+studentTreeSet.first());
        System.out.println("Students with GPA between 2.0 and 3.0: "+studentTreeSet.subSet(new Student("",2.0),new Student("",3.0)));
        System.out.println(studentTreeSet.headSet(new Student("",2.75)));
        System.out.println(studentTreeSet.tailSet(new Student("",3.5)));
        System.out.println(studentTreeSet.higher(new Student("",3.1)));
        System.out.println(studentTreeSet.lower(new Student("",2.9)));
        System.out.println(studentTreeSet);
    }
}
