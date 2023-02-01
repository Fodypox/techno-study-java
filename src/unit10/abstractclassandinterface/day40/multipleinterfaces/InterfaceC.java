package unit10.abstractclassandinterface.day40.multipleinterfaces;

public interface InterfaceC {
    void methodC();

    default void methodAnotherC(){
        System.out.println("New Default Method");
    }

}
