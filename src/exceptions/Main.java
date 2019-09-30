package exceptions;

import exceptions.arrays.*;
import exceptions.dayofweek.*;

public class Main {
    public static void main(String[] args) {
        String[][] stringArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };

        try {
            System.out.println("Cумма массива: " + arraySum.sum4X4(stringArray));
        } catch (MySizeArrayException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        for (DaysOfWeek day : DaysOfWeek.values()) {
            System.out.println("Рабочих часов - " + Days.getWorkHours(day));
        }

        System.out.println();
        for (DaysOfWeekEnhanced day : DaysOfWeekEnhanced.values()) {
            System.out.println(day.getName()+". Рабочих часов - " + day.workHoursRemain());
        }
    }
}