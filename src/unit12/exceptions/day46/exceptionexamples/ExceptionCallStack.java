package unit12.exceptions.day46.exceptionexamples;

public class ExceptionCallStack {
    public static void main(String[] args) {
        dividerCaller();
        System.out.println("---After the exception---");
    }
    public static void divider(){
        System.out.println(10/0);
    }
    public static void dividerCaller(){
        divider();
    }
}
