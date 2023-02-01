package unit09.inheritance.day34.constructors;

public class SubClass extends SuperClass{
    private String subClassVariable;

    public SubClass(){
        super();
        subClassVariable = "Initialized in No Parameter Constructor";
    }

    public String getSubClassVariable() {
        return subClassVariable;
    }

    public void setSubClassVariable(String subClassVariable) {
        this.subClassVariable = subClassVariable;
    }
}
