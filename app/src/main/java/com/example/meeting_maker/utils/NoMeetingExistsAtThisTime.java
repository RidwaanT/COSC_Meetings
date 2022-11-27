package com.example.meeting_maker.utils;

import java.util.Date;

public class NoMeetingExistsAtThisTime extends Exception {
    public NoMeetingExistsAtThisTime(Date date, int hour) {
        super("There is no meetings for: " + date + " " + hour);
    }
}