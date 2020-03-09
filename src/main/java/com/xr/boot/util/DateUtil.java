package com.xr.boot.util;

import java.util.Calendar;

public class DateUtil {
    private static final Calendar c = Calendar.getInstance();
    private static final int year;
    private static final int month;
    private static final int date;
    private static final int hour;
    private static final int minute;
    private static final int second;
    static{
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        date = c.get(Calendar.DATE);
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);
        second = c.get(Calendar.SECOND);
    }
    public static String getTime(){


        //System.out.println(year + "/" + month + "/" + date + " " +hour + ":" +minute + ":" + second);
        return year + "/" + (month+1) + "/" + date + " " + hour + ":" + minute + ":" +second;
    }
    public static String getTimeNosmd(){

        //System.out.println(year + "/" + month + "/" + date + " " +hour + ":" +minute + ":" + second);
        return year + "-" + (month+1) + "-" + date;
    }
}
