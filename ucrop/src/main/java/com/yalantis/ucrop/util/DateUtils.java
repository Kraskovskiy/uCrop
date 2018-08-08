package com.yalantis.ucrop.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    private DateUtils() {

    }

    private static Date getNowWithOffset(int field, int offset) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(field, offset);
        return calendar.getTime();
    }

    public static Date getNowWithHourOffset(int hourOffset) {
        return getNowWithOffset(Calendar.HOUR, hourOffset);
    }

    public static Date getDate(int year, int month, int day, int hour, int minute, int second) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hour, minute, second);
        return calendar.getTime();
    }

}
