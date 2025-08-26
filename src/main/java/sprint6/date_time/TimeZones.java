package sprint6.date_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZones {
    public static void main(String[] args) {
        // ZonedDateTime - LocalDateTime but with locale time
        // we set it manually but we can make a mistake
        LocalDateTime now = LocalDateTime.now();
        ZoneId zoneId = ZoneId.of("UTC+6"); // or UTC-3 if only hours
        ZonedDateTime zonedDateTime = ZonedDateTime.of(now, zoneId);
        System.out.println(zonedDateTime);

        // not setting manually:
        ZoneId zoneId1 = ZoneId.of("Asia/Bishkek");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(now, zoneId1);
    }
}
