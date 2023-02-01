package unit07.arraylist.day30.arraylistinclasses;

import java.util.ArrayList;

public class Student {
    private String name;
    private int grade;
    private ArrayList<Integer> mathGrades;

    /*Class methods*/

    public void addMathGrade(int score){
        mathGrades.add(score);
    }

    public double mathAverage(){
        double average = 0;
        int count = 0;
        for (int sum :
                mathGrades ) {
            average =average + sum;
            count++;
        }
        average=average/mathGrades.size();
        return average;
    }

    public void removeLessThanSeventy(){
        for (int i = 0; i < mathGrades.size(); i++) {
            if(mathGrades.get(i)<70){
                mathGrades.remove(i);
                i--;
            }
        }
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        mathGrades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public ArrayList<Integer> getMathGrades() {
        return mathGrades;
    }

    public void setMathGrades(ArrayList<Integer> mathGrades) {
        this.mathGrades = mathGrades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", mathGrades=" + mathGrades +
                '}';
    }


}
