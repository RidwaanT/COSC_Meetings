package com.example.meeting_maker.utils;

public class HourOutofRange extends Throwable {
    public HourOutofRange() {
        super("Hour needs to be 0-23, Can't be less than 0 or more than 23");
    }
}
