package com.example.meeting_maker;

import java.util.Date;

public class Meeting {

    Date date;
    int hour;
    String name;
    Contact contact;

    public Meeting (Date date, int hour, String name){
        this.date = date;
        this.hour = hour;
        this.name = name;
    }

    public Meeting (Date date, int hour, String name, Contact contact){
        this.date = date;
        this.hour = hour;
        this.name = name;
        this.contact = contact;

    }

    public Date getDate() {
        return date;
    }

    public int getTime() {
        return hour;
    }

    public String getName() {
        return name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(int time) {
        this.hour = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
