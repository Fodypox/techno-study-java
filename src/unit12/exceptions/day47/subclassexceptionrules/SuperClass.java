package unit12.exceptions.day47.subclassexceptionrules;

public class SuperClass {
    public void method() throws Exception{

    }
}
class SubClass extends SuperClass{
    /*public void method(){
        *//*no exception throw is allowed*//*
    }*/
    public void method() throws Exception{
        //*no exception throw is allowed*//
    }
}
