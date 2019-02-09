package com.ubs.opsit.interviews;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

import com.ubs.opsit.interviews.clock.BerlinClock;

public class TimeConverterImpl implements TimeConverter {

    @Override
    public String convertTime(String aTime) {
        String input = aTime.trim();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.parse(input, format);

        //workaround to pass 24:00:00 Scenario
        int hours = input.split(":")[0].equals("24") ? time.get(ChronoField.CLOCK_HOUR_OF_DAY) : time.getHour();
        int minutes = time.getMinute();
        int seconds = time.getSecond();

        return new BerlinClock(hours, minutes, seconds).show();
    }
}
