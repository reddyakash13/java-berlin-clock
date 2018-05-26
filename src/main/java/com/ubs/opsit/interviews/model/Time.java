package com.ubs.opsit.interviews.model;

public class Time {

    private int seconds;
    private int minutes;
    private int hours;

    private Time(){}

    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }
}
