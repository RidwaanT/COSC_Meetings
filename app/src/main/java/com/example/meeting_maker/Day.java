package com.example.meeting_maker;

import java.util.Date;

public class Day {

    Meeting[] meetings;
    Date date;

    public Day(Date date) {
        meetings = new Meeting[24];
        this.date = date;
    }

    /**
     * Adds meeting to the Meetings array in the object to the index (0-index) based on the hour. 24 meeting slots are open (0-24).
     * @param date The date this day should represent.
     * @param name The name of the meeting, it can be called anything.
     * @param hour The hour this meeting will take place which is also the index in the array it will occupy.
     * @throws MeetingExistsAtThisTime When there is already a meeting that is in this spot.
     * @throws HourOutofRange The Hour must be between 0-23 anything 24 and greater or -1 and lesser will throw an exception.
     */
    public void addMeeting(Date date, String name,int hour) throws MeetingExistsAtThisTime, HourOutofRange {
        if(meetings[hour] != null){
            throw new MeetingExistsAtThisTime(date, hour);
        } else if(hour > 23 || hour < 0){
            throw new HourOutofRange();
        } else {
            Meeting newMeet = new Meeting(date, hour, name);
            meetings[hour] = newMeet;
        }
    }

    /**
     * Removes the meeting from the Array by setting the index to null.
     * @param hour The hour the meeting is currently taking place on this day and also the index of the array that you want set to null.
     * @throws NoMeetingExistsAtThisTime
     */
    public void removeMeeting(int hour) throws NoMeetingExistsAtThisTime {
        if(meetings[hour] == null){
            throw new NoMeetingExistsAtThisTime(date, hour);
        } else {
            meetings[hour] = null;
        }
    }
}