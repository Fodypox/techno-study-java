package unit09.inheritance.day35.constructorreview;

public class BatteryPowerTool extends PowerTool{
    private int batteryWatt;

    public BatteryPowerTool(String name, String brand, String powerAdapter, int batteryWatt) {
        super(name, brand, powerAdapter);
        this.batteryWatt = batteryWatt;
    }

    public int getBatteryWatt() {
        return batteryWatt;
    }

    public void setBatteryWatt(int batteryWatt) {
        this.batteryWatt = batteryWatt;
    }
}
