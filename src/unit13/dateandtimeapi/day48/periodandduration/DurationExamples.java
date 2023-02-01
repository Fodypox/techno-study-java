package unit13.dateandtimeapi.day48.periodandduration;

import java.time.Duration;

public class DurationExamples {
    public static void main(String[] args) {
        Duration duration = Duration.ofHours(4);
        System.out.println(duration.plusHours(2).plusMinutes(15));
    }
}
