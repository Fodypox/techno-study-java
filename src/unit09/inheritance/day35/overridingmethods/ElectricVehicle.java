package unit09.inheritance.day35.overridingmethods;

public class ElectricVehicle extends Car{
    private int batteryLevel;

    public ElectricVehicle() {
        batteryLevel = 100;
    }
    public String fill(){
        return super.fill();
        /*return "charging the battery";*/
    }
}
