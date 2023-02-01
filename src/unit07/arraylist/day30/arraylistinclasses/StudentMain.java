package unit07.arraylist.day30.arraylistinclasses;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe",8);
        student1.addMathGrade(95);
        student1.addMathGrade(100);
        student1.addMathGrade(65);
        student1.addMathGrade(100);
        System.out.println(student1.getMathGrades());

        System.out.println(student1.mathAverage());
        student1.removeLessThanSeventy();
        System.out.println(student1.getMathGrades());
    }
}
