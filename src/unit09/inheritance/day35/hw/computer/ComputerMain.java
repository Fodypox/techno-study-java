package unit09.inheritance.day35.hw.computer;

public class ComputerMain {
    public static void main(String[] args) {
        Computer pc = new Computer("Intel core i7",512);
        Laptop dell = new Laptop("Intel core i7",1024,24);
        pc.info();
        dell.info();
    }
}
