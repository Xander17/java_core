package exceptions.dayofweek;

public class DaysOfWeek {
    public enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;}

    public static int getWorkHours(Days day) {
        return day.ordinal() > 4 ? 0 : (5 - day.ordinal()) * 8;
    }
}
