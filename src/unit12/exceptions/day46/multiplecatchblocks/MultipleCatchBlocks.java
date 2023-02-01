package unit12.exceptions.day46.multiplecatchblocks;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
//            null pointer exception
            String nullString = null;
            nullString.length();
//            arithmetic one
            System.out.println(10 / 0);
//            out of bound
            int[] numbers = new int[3];
            System.out.println(numbers[100]);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Arithmetic exception occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("You are out of bound of the array");
        } catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Null pointer exception occured");
        }
    }
}
