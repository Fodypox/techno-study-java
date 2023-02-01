package unit13.dateandtimeapi.day49.timezoneandoffsetclasses;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Example {
    public static void main(String[] args) {
        /*A flight from new york to paris
        * Departure from new yor is 2023 july 2 22:30
        * Flight Duration is 8 hours
        * what is the arrival time to paris in paris time*/
        ZonedDateTime nyDeparture = ZonedDateTime.of(LocalDateTime.of(2023, Month.JULY, 2, 22, 30), ZoneId.of("America/New_York"));
        System.out.println(nyDeparture);
        System.out.println(nyDeparture.plusHours(8).withZoneSameInstant(ZoneId.of("Europe/Paris")));
    }
}
