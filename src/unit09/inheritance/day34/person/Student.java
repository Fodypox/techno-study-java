package unit09.inheritance.day34.person;

public class Student extends Person{
    public static void main(String[] args) {
        Person person = new Person();
        person.study();
        Student student = new Student();
        student.study();
    }
}
