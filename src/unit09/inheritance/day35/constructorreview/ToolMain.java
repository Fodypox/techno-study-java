package unit09.inheritance.day35.constructorreview;

public class ToolMain {
    public static void main(String[] args) {
        BatteryPowerTool drill = new BatteryPowerTool("Drill","DeWalt","5 Amp Adapter",200);
        System.out.println("Tool: "+drill.getName()+"\nBrand: "+drill.getBrand()+"\nAdapter "+drill.getPowerAdapter()+"\nWatt: "+drill.getBatteryWatt());
    }
}
