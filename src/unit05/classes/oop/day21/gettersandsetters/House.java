package unit05.classes.oop.day21.gettersandsetters;

public class House {
    private String color;
    private String address;
    private int price;

    public House(String color, String address, int price) {
        this.color = color;
        this.address = address;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                '}';
    }
}
