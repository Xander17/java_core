package exceptions.dayofweek;

public class Days {
    public static int getWorkHours(DaysOfWeek day) {
        return day.ordinal() > 4 ? 0 : (5 - day.ordinal()) * 8;
    }
}
