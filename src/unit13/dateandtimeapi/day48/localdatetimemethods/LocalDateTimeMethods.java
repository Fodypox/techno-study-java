package unit13.dateandtimeapi.day48.localdatetimemethods;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeMethods {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime worldCupFinal = LocalDateTime.of(2022, Month.DECEMBER,12,14,0);
        System.out.println(worldCupFinal);
        System.out.println(worldCupFinal.getDayOfWeek());


    }
}
