package unit07.arraylist.day30.hw;

import java.util.ArrayList;

public class CarDealer {
    private String dealerName;
    private String dealerAddress;
    private ArrayList<Car> carList;



    public CarDealer(String dealerName, String dealerAddress) {
        this.dealerName = dealerName;
        this.dealerAddress = dealerAddress;
        carList = new ArrayList<>();
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getDealerAddress() {
        return dealerAddress;
    }

    public void setDealerAddress(String dealerAddress) {
        this.dealerAddress = dealerAddress;
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return "CarDealer{" +
                "dealerName='" + dealerName + '\'' +
                ", dealerAddress='" + dealerAddress + '\'' +
                ", carList=" + carList +
                '}';
    }
}
