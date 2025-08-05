package sprint3;

public class JavaEnums {
    public void example() {
        DayOfWeek day = DayOfWeek.FRIDAY;
        System.out.println("The day of the week is: " + day);
        DayOfWeek day1 = DayOfWeek.FRIDAY;
        System.out.println(day == day1);
    }
}

enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}