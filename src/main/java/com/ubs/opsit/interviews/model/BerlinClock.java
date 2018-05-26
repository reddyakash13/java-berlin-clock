package com.ubs.opsit.interviews.model;

import com.sun.jndi.ldap.Ber;

public class BerlinClock {

    private Lamp secondsLamp;
    private Row fiveHourRow;
    private Row oneHourRow;
    private Row fiveMinutesRow;
    private Row oneMinuteRow;


    public BerlinClock() {
        secondsLamp = new Lamp(Color.YELLOW);
        secondsLamp.turnOn();

        fiveHourRow = new Row(4, Color.RED);
        oneHourRow = new Row(4, Color.RED);
        fiveMinutesRow = new Row(11, Color.YELLOW);
        fiveMinutesRow.chageColor(Color.RED, 3, 6, 9);
        oneMinuteRow = new Row(4, Color.YELLOW);
    }

    public BerlinClock setSeconds(int seconds) {
        if (seconds % 2  == 0) {
            secondsLamp.turnOn();
        } else {
            secondsLamp.turnOff();
        }
        return this;
    }

    public BerlinClock setMinutes(int minutes) {
        int firstRow = minutes / 5;
        int secondRow = minutes % 5;

        fiveMinutesRow.turnOnLampsTill(firstRow);
        oneMinuteRow.turnOnLampsTill(secondRow);
        return this;
    }

    public BerlinClock setHours(int hours) {
        int firstRow = hours / 5;
        int secondRow = hours % 5;

        fiveHourRow.turnOnLampsTill(firstRow);
        oneHourRow.turnOnLampsTill(secondRow);
        return this;
    }

    public Lamp getSecondsLamp() {
        return secondsLamp;
    }

    public Row getFiveHourRow() {
        return fiveHourRow;
    }

    public Row getOneHourRow() {
        return oneHourRow;
    }

    public Row getFiveMinutesRow() {
        return fiveMinutesRow;
    }

    public Row getOneMinuteRow() {
        return oneMinuteRow;
    }

    @Override
    public String toString() {
        return getSecondsLamp().toString() + "\r\n"
                + getFiveHourRow().toString() + "\r\n"
                + getOneHourRow().toString() + "\r\n"
                + getFiveMinutesRow().toString() + "\r\n"
                + getOneMinuteRow().toString();
    }
}
