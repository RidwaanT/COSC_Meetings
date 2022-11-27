package com.example.meeting_maker;

import java.util.Date;

public class MeetingExistsAtThisTime extends Exception {

    public MeetingExistsAtThisTime(Date date, int hour) {
        super("A meeting already exists for: " + date.toString() + " and this hour " + hour );
    }
}
