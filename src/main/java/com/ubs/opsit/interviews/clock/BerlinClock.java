package com.ubs.opsit.interviews.clock;

import com.ubs.opsit.interviews.display.BaseTwoRowDisplay;
import com.ubs.opsit.interviews.display.HourDisplay;
import com.ubs.opsit.interviews.display.MinutesDisplay;
import com.ubs.opsit.interviews.display.SecondsDisplay;

public class BerlinClock {

    private int hours;
    private int minutes;
    private int seconds;

    public BerlinClock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String show() {
        StringBuilder row = new StringBuilder();
        row.append(new SecondsDisplay(seconds).displayTime());

        BaseTwoRowDisplay hourDisplay = new HourDisplay(hours);
        row.append(hourDisplay.displayTime());

        BaseTwoRowDisplay minutesDisplay = new MinutesDisplay(minutes);
        row.append(minutesDisplay.displayTime());

        return row.toString();
    }
}
