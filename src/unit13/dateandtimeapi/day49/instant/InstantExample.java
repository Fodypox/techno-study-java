package unit13.dateandtimeapi.day49.instant;

import java.time.Instant;
import java.time.ZoneId;

public class InstantExample {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now.getEpochSecond());
        System.out.println(Instant.ofEpochSecond(0));
        System.out.println(ZoneId.getAvailableZoneIds());
    }
}
