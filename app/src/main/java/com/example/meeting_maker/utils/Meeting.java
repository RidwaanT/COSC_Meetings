package com.example.meeting_maker.utils;

import java.util.Date;

/**
 * Represents the meeting which has been set. This meeting has a name, date and time. As well as a contact. Currently the time of the meetings can only be set on
 * an hourly basis, by a 0-index
 */
public class Meeting {

    Date date;
    int time;
    String title;
    Contact contact;

    /**
     * Details about the meeting including year-month-day, hour and title with no contact.
     * @param date The date the meeting is taking place
     * @param time Time of the meeting
     * @param title The name of the meeting.
     */
    public Meeting (Date date, int time, String title){
        this.date = date;
        this.time = time;
        this.title = title;
    }

    /**
     * Stores the information associated with the meeting with no name.
     * @param date The date the meeting is taking place
     * @param time hour of the meeting
     * @param title The name of the meeting.
     * @param contact The person associated with this meeting.
     */
    public Meeting (Date date, int time, String title, Contact contact){
        this.date = date;
        this.time = time;
        this.title = title;
        this.contact = contact;

    }

    /**
     * Date of the meeting is used to determine where it will show up on the calendar and which Day Object to save it too.
     * @return Date of the meeting.
     */
    public Date getDate() {
        return date;
    }

    /**
     * Hour of the day the meeting occurs, 0-23.
     * @return Time of the meeting.
     */
    public int getTime() {
        return time;
    }

    /**
     * The title of the meeting should not be null and currently has no character limit.
     * @return title of the meeting.
     */
    public String getTitle() {
        return title;
    }

    /**
     * The contact should be syncable with Android.
     * @return
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * The Month-Day-Year are important because it is used to identify where to save the meeting. The
     * time variable is not used from the date.
     * @param date Date the meeting will take place.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * The hour of the time will determine in what order the meeting will take place, minutes and seconds won't matter.
     * @param time The hour the meeting will take place
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * The title of the meeting will  distinguish the user and should not be empty
     * @param title The name you want to set for the meeting.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Should use Android contacts.
     * @param contact
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
