package unit13.dateandtimeapi.day48.parsingformatting;

import java.time.LocalDate;
import java.time.LocalTime;

public class ParsingISODateTime {
    public static void main(String[] args) {
        String stringDate = "2023-01-19";
        LocalDate parsedDate = LocalDate.parse(stringDate);
        System.out.println(parsedDate);
        System.out.println(parsedDate.getDayOfWeek());

        String stringTime = "17:35";
        LocalTime parsedTime  = LocalTime.parse(stringTime);
        System.out.println(parsedTime.plusHours(1));

        /*String customDate = "12/1/23";
        LocalDate parsedCustomDate = LocalDate.parse(customDate);
        System.out.println(parsedCustomDate);*/
    }
}
