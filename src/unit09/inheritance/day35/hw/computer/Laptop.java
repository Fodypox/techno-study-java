package unit09.inheritance.day35.hw.computer;

public class Laptop extends Computer{
    /*Laptop is the subclass of Computer Class
int batteryLife
info() method prints: "The computer has xxxx processor and yyy gb of storage. The battery life is zzz hours."*/
    private int batteryLife;

    public Laptop(String processor, int storage, int batteryLife) {
        super(processor, storage);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void info(){
        super.info();
        System.out.println("The battery life is "+batteryLife+" hours.");
    }
}
