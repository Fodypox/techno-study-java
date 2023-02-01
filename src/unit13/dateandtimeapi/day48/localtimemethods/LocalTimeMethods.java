package unit13.dateandtimeapi.day48.localtimemethods;

import java.time.LocalTime;

public class LocalTimeMethods {
    public static void main(String[] args) {
        LocalTime rightNow = LocalTime.now();
        System.out.println(rightNow);

        LocalTime openingHour = LocalTime.of(6,0);
        System.out.println(openingHour);

        System.out.println(openingHour.getHour());
        System.out.println(openingHour.getMinute());
        System.out.println(openingHour.plusHours(4).plusMinutes(10));
        System.out.println(openingHour.plusMinutes(250));
    }
}

