package com.Homework_17;

public enum DaysOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int number;
    DaysOfWeek(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static DaysOfWeek getDayByNumber(int number) {
        for (DaysOfWeek day : DaysOfWeek.values()) {
            if (day.getNumber() == number) {
                return day;
            }
        }
        return null;
    }
}
