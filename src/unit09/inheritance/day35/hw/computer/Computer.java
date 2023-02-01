package unit09.inheritance.day35.hw.computer;

public class Computer {
    /*Computer Superclass
String processor
int storage
info() method printing the "The computer has xxxx processor and yyy gb of storage."*/
    private String processor;
    private int storage;

    public Computer(String processor, int storage) {
        this.processor = processor;
        this.storage = storage;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void info(){
        System.out.println("The computer has "+processor +" processor and "+storage+" gb of storage.");
    }
}
