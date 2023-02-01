package unit13.dateandtimeapi.day48.localdatemetjods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.util.Locale;

public class LocalDateMethods {
    public static void main(String[] args) {
        /*Create and get methods*/
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthDay = LocalDate.of(1995, Month.APRIL, 27);
        LocalDate myBirthDay = LocalDate.of(1984, Month.NOVEMBER, 06);
        System.out.println(birthDay);

        System.out.println(birthDay.getYear());
        System.out.println(birthDay.getDayOfWeek());
        System.out.println(myBirthDay.getYear());
        System.out.println(myBirthDay.getDayOfWeek());

        System.out.println(myBirthDay.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("RU")));

        System.out.println(birthDay.plusWeeks(3));
//        System.out.println(birthDay.with(TemporalAdjuster.firstDayOfNextMonth()).getDayOfWeek());
        System.out.println(birthDay.minus(2, ChronoUnit.WEEKS));
        System.out.println(LocalDate.now().isLeapYear());
        System.out.println(LocalDate.now().plusYears(1).isLeapYear());

        LocalDate birthDayJane = LocalDate.of(1970,01,01);

        System.out.println(birthDayJane.isAfter(birthDay));

    }
}
