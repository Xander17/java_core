package exceptions.dayofweek;

public class DayOfWeekEnhanced {

    public enum Days {
        MONDAY(8),
        TUESDAY(8),
        WEDNESDAY(8),
        THURSDAY(8),
        FRIDAY(8),
        SATURDAY(0),
        SUNDAY(0);

        int workHours;

        public int workHoursRemain() {
            int hours = 0;
            for (int i = ordinal(); i < values().length; i++)
                hours += values()[i].workHours;
            return hours;
        }

        Days(int workHours) {
            this.workHours = workHours;
        }

    }
}
