package com.example.meeting_maker.utils;

import com.example.meeting_maker.utils.Day;
import com.example.meeting_maker.utils.HourOutofRange;
import com.example.meeting_maker.utils.MeetingExistsAtThisTime;
import com.example.meeting_maker.utils.NoMeetingExistsAtThisTime;

import java.util.Date;
import java.util.HashMap;

/**
 * Holds the days which have the meetings in them, and has methods to access the meetings on those days.
 */
public class Calendar {

    HashMap<Date, Day> days = new HashMap<Date, Day>();

    public Calendar() {

    }

    /**
     *Adds a meeting to the calendar by adding a meeting to an existing day or creating a day to
     * add a meeting too if the day doesn't exist.
     * @param date Year-Month-Day of the meeting, the time info is ignored here.
     * @param title name of the meeting should not be an empty string.
     * @param hour The time of the meeting 0 indexed. 0-23.
     * @throws HourOutofRange The hour passed is greater than 23 or smaller than 0
     * @throws MeetingExistsAtThisTime We already have a meeting at this time you must delete the
     * meeting first before we can create at this time.
     */
    public void addMeeting(Date date, String title, int hour) throws HourOutofRange, MeetingExistsAtThisTime {
        Day day;
        if (days.containsKey(date)){
            day = days.get(date);
        } else {
            day = new Day(date);
            days.put(date, day);
        }
        day.addMeeting(date,title,hour);
    }

    /**
     * This will remove a meeting at the specified date and hour
     * @param date date of the meeting you want to be removed
     * @param hour the our of the meeting you want to be removed.
     */
    public void removeMeeting(Date date, int hour) throws NoMeetingExistsAtThisTime {
        if(days.containsKey(date)){
            Day day = days.get(date);
            day.removeMeeting(hour);
        } else {
            throw new NoMeetingExistsAtThisTime(date, hour);
        }
    }

    /**
     * Will use the Date and hour to find the meeting at that time
     * @param date The date of the meeting you'r looking for.
     * @param hour The 0-index hour of the meeting you're looking for.
     * @return the meeting found.
     */
    public Meeting findMeeting(Date date, int hour) throws HourOutofRange, NoMeetingExistsAtThisTime {
        Day dayQuery;
        Meeting meetingQuery;
        if(days.containsKey(date)){
            dayQuery = days.get(date);
            meetingQuery = dayQuery.getMeeting(hour);
        } else{
            throw new NoMeetingExistsAtThisTime(date, hour);
        }

        return meetingQuery;
    }





}
