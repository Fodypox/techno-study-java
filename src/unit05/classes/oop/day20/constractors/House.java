package unit05.classes.oop.day20.constractors;

public class House {
    private String color;
    private String address;
    private double price;
    private boolean isRental;

    public House() {
        color = "Yellow";
        address = "176 Millburn Ave, NJ Millburn";
        price = 650000.00;
        isRental = false;
    }

    public House(String color, String address, double price, boolean isRental) {
        this.color = color;
        this.address = address;
        this.price = price;
        this.isRental = isRental;
    }

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", isRental=" + isRental +
                '}';
    }
}
