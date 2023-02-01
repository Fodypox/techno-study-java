package unit12.exceptions.day47.finallyblock;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            /*Arithmetic exception*/
            System.out.println("before the exception");
            System.out.println(10);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception is caught");
        }finally {
            System.out.println("The code from the finally block");
        }
        System.out.println("After try catch finally bocks");
    }
}
