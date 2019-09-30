package exceptions.dayofweek;

public enum DaysOfWeekEnhanced {
    MONDAY("Понедельник", 8),
    TUESDAY("Вторник", 8),
    WEDNESDAY("Среда", 8),
    THURSDAY("Четверг", 8),
    FRIDAY("Пятница", 8),
    SATURDAY("Суббота", 0),
    SUNDAY("Воскресенье", 0);

    private int workHours;
    private String name;

    DaysOfWeekEnhanced(String name, int workHours) {
        this.name = name;
        this.workHours = workHours;
    }

    public int workHoursRemain() {
        int hours = 0;
        for (int i = ordinal(); i < values().length; i++)
            hours += values()[i].workHours;
        return hours;
    }

    public String getName() {
        return name;
    }
}
