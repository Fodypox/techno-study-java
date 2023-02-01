package unit06.array.day24.arrayreview;

public class StudentMain {
    public static void main(String[] args) {
        int[] myGrades = {100,97,99};
        Student student1 = new Student("John D", myGrades);
        int[] studentGrades = student1.getGrades();
        System.out.println(studentGrades[2]);
    }
}
