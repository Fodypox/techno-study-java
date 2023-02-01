package unit11.collections.day43.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Student {
    private String name;
    private double gpa;
    private int age;

    public Student(String name, double gpa, int age) {
        this.name = name;
        this.gpa = gpa;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", age=" + age +
                '}';
    }
}

class StudentMain {
    public static void main(String[] args) {
        Queue<Student> studentQueue = new PriorityQueue<>(Comparator.comparing(Student::getAge));
        studentQueue.offer(new Student("John", 3.5, 18));
        studentQueue.offer(new Student("Max", 4.2, 19));
        studentQueue.offer(new Student("Bill", 3.9, 20));
        studentQueue.offer(new Student("Melissa", 4.0, 19));
        studentQueue.offer(new Student("Liz", 2.9, 21));
        System.out.println(studentQueue);
        Queue<Student> studentGPA = new PriorityQueue<>(Comparator.comparing(Student::getGpa).reversed());
        studentGPA.offer(new Student("John", 3.5, 18));
        studentGPA.offer(new Student("Max", 4.2, 19));
        studentGPA.offer(new Student("Bill", 3.9, 20));
        studentGPA.offer(new Student("Melissa", 4.0, 19));
        studentGPA.offer(new Student("Liz", 2.9, 21));
        System.out.println(studentGPA);
    }

}
