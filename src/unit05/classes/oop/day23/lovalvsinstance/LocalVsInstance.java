package unit05.classes.oop.day23.lovalvsinstance;

public class LocalVsInstance {
    public  int instanceVariable;
    
    public void printInfo(){
        int localVariable = 0;
        System.out.println(instanceVariable);
        System.out.println(localVariable);
    }
    
    
    public void printInfo2(){
        int localVariable2;
        int instanceVariable; /*this is the local variable different than instance variable*/
        System.out.println(this.instanceVariable);/*this is the instance variable, and defined with key word "this."*/
    }
}
