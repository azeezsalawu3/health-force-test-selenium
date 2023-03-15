package com.healthforce.HandlerClasses;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeHandler {

    private String timeStampFormat = "yyyyMMddHHmmss";

    public String getTimeStamp() {
        String displayTime = "";
        try {
            displayTime = (new SimpleDateFormat(timeStampFormat).format(new Date()));
        } catch (Exception e) {
            System.out.println("Date Time Seems To Be Incorrect. : " + e.getMessage());
        }
        return displayTime;
    }

}
