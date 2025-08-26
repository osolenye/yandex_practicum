package sprint6.date_time;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalTimeClasses {
    public static void main(String[] args) {
        // LocalDateTime and other methods are used to store and treat  current time like calendar
        LocalDateTime currentTime = LocalDateTime.now(); //gets time from the device
        System.out.println(currentTime);

        // to create a date time:
        LocalDateTime newTime = LocalDateTime.of(2004, 2, 6, 0, 0, 0, 0);
        System.out.println(newTime);
        //not passing seconds and nanoseconds
        LocalDateTime newTime1 = LocalDateTime.of(2004, Month.FEBRUARY, 6, 0, 0);
        System.out.println(newTime);

        deliverySchedule(8, 30, 5, 5);

        // Workign with a String of LocalDateTime class is not very convenient, that's why we use DateTimeFormatter
        LocalDateTime newTime2 = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm");
        String formatDate = newTime2.format(dateTimeFormatter);
        System.out.println(formatDate);

        // parsing in ISO 8601 format from a String
        LocalDateTime parsedFromString = LocalDateTime.parse("2004-02-06T00:00");
        System.out.println(parsedFromString);

        // LocalDateTime = LocalDate + LocalTime
        // LocalDate - the Date(year, month, day), LocalTime - hours and minutes
    }

    // it has same methods as Instant each returning a new class instance
    static void deliverySchedule(int hours, int minutes, int shiftDuration, int shiftAmount) {
        if (shiftDuration > 8) {
            return;
        }
        LocalDateTime indonesianDelivery = LocalDateTime.of(2024, 6, 1, hours, minutes);
        for (int i = 0; i < shiftAmount; i++) {
            System.out.println("Смена. Начало: "+ indonesianDelivery + "," + " конец: " + indonesianDelivery.plusHours(shiftDuration));
            indonesianDelivery = indonesianDelivery.plusHours(shiftDuration);
        }
    }
}
