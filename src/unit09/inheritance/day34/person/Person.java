package unit09.inheritance.day34.person;

public class Person {
    /*Person, Student, Faculty, HighSchoolStudent, MiddleSchoolStudent*/
    public void study(){
        System.out.println(this.getClass().getSimpleName() + " is studying");
    }
}
