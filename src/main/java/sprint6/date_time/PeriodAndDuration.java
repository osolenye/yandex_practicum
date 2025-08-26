package sprint6.date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodAndDuration {
    public static void main(String[] args) {
        // Period and Duration are used to see how much time passed between two dates
        // Period - time between two dates
        // left date's day is not included like in for-loops
        System.out.println(Period.between(LocalDate.of(2025, 8, 25), LocalDate.of(2025, 8, 29)));

        // Duration is used to see the difference between two Instat's in nanoseconds
        System.out.println(Duration.between(LocalDateTime.now().minusHours(2L), LocalDateTime.now()));
    }
}
