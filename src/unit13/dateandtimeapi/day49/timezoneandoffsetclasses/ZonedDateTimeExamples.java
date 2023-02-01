package unit13.dateandtimeapi.day49.timezoneandoffsetclasses;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExamples {
    public static void main(String[] args) {
        ZonedDateTime timeInNJ = ZonedDateTime.now();
        System.out.println(timeInNJ);
        System.out.println(timeInNJ.getOffset());
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Almaty")));
        ZonedDateTime nyNextWeek = ZonedDateTime.of(2023,1,30,14,30,0,0,ZoneId.of("America/New_York"));
        System.out.println(nyNextWeek);
        System.out.println(nyNextWeek.withZoneSameInstant(ZoneId.of("Europe/Paris")));
    }
}
