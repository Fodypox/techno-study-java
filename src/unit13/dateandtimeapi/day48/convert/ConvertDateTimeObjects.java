package unit13.dateandtimeapi.day48.convert;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ConvertDateTimeObjects {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2001, Month.OCTOBER,12);
        System.out.println(birthday);
        LocalDateTime birthDayWithTime = birthday.atTime(4,37);
        System.out.println(birthDayWithTime);
        LocalTime openHour = LocalTime.of(11,00);
        System.out.println(openHour);
        LocalDateTime openHourWithYear = openHour.atDate(birthday);
        LocalDateTime openHourWithYear1 = openHour.atDate(LocalDate.of(2024,Month.JULY,15));
        System.out.println(openHourWithYear);
        System.out.println(openHourWithYear1);
        System.out.println(birthDayWithTime);
        System.out.println(birthDayWithTime.toLocalDate());
        System.out.println(birthDayWithTime.toLocalTime());
    }
}
