package unit05.classes.oop.day22.multipleclasses;

public class Student {
    private String name;
    private double gpa;
    private Address address;

    public Student(String name, double gpa, Address address) {
        this.name = name;
        this.gpa = gpa;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isSameState(Address otherAddress){
        return address.getState().equals(otherAddress.getState());
    }
}
