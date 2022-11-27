package com.example.meeting_maker;

import java.util.Date;
import java.util.HashMap;

public class Calendar {

    HashMap<Date, Day> days = new HashMap<Date, Day>();

    public Calendar() {

    }

    /**
     *
     * @param date
     */
    public void addMeeting(Date date, String name, int hour) throws HourOutofRange, MeetingExistsAtThisTime {
        Day day;
        if (days.containsKey(date)){
            day = days.get(date);
        } else {
            day = new Day(date);
            days.put(date, day);
        }
        day.addMeeting(date,name,hour);
    }

    /**
     * This will remove a meeting at the specified date and hour
     * @param date this
     * @param hour
     */
    public void removeMeeting(Date date, int hour) throws NoMeetingExistsAtThisTime {
        if(days.containsKey(date)){
            Day day = days.get(date);
            day.removeMeeting(hour);
        } else {
            throw new NoMeetingExistsAtThisTime(date, hour);
        }

    }





}
