package unit09.inheritance.day38.mail;

import java.util.ArrayList;
import java.util.List;

public class MailMain {
    public static void main(String[] args) {
        ArrayList<Mailing> shipments =
                new ArrayList<>(List.of(new Mailing(10),new FastMail(3),new FastMail(4),new Mailing(2)));

        double totalShipmentCost = 0;
        for (Mailing shipment:shipments) {
            totalShipmentCost += shipment.calculateShipping();
            System.out.println(shipment.calculateShipping());
        }
        System.out.println(totalShipmentCost);
    }
}
