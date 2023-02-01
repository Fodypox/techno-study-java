package unit09.inheritance.day34.constructors;

public class SuperClass {
    private String superVeriable;

    public SuperClass() {
        superVeriable = "Super class Created by No parameter Constructor";
    }

    public SuperClass(String superVeriable) {
        this.superVeriable = superVeriable;
    }

    public String getSuperVeriable() {
        return superVeriable;
    }

    public void setSuperVeriable(String superVeriable) {
        this.superVeriable = superVeriable;
    }
}
