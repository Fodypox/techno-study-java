package unit11.collections.day42.sortinglist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SaleNumbers {
    private int soldItems;
    private double revenue;

    public SaleNumbers(int soldItems, double revenue) {
        this.soldItems = soldItems;
        this.revenue = revenue;
    }

    public int getSoldItems() {
        return soldItems;
    }

    public double getRevenue() {
        return revenue;
    }

    @Override
    public String toString() {
        return "SaleNumbers{" +
                "soldItems=" + soldItems +
                ", revenue=" + revenue +
                '}';
    }
}
class Main{
    public static void main(String[] args) {
        List<SaleNumbers> saleNumbers = new ArrayList<>(List.of(new SaleNumbers(50,1234.53),new SaleNumbers(60,1994.53),new SaleNumbers(30,601.33),new SaleNumbers(90,3500.0)));
        saleNumbers.sort(Comparator.comparing(SaleNumbers::getRevenue));
        System.out.println(saleNumbers);
        saleNumbers.sort(Comparator.comparing(SaleNumbers::getSoldItems).reversed());
        System.out.println(saleNumbers);
    }
}
