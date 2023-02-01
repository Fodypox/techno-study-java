package unit12.exceptions.day47.customexception;

public class InsufficiantBalanceException extends Exception{
    public InsufficiantBalanceException(String message) {
        super(message);
    }
}
