package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.model.BerlinClock;
import com.ubs.opsit.interviews.model.Time;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BerlinClockAkashUhr implements TimeConverter {

    private static final Logger LOG = LoggerFactory.getLogger(BerlinClockAkashUhr.class);

    @Override
    public String convertTime(String aTime) {
        // LOG.info("This is how input looks like: " + aTime);

        Time time = parseTimeString(aTime);

        BerlinClock berlinClock = new BerlinClock();
        berlinClock.setHours(time.getHours()).setMinutes(time.getMinutes()).setSeconds(time.getSeconds());

        // LOG.info(berlinClock.toString());
        return berlinClock.toString();
    }

    private Time parseTimeString(String aTime) {
        String[] timeFragments = aTime.split(":");

        return new Time(Integer.parseInt(timeFragments[2]), Integer.parseInt(timeFragments[1]), Integer.parseInt
                (timeFragments[0]));

    }

}
