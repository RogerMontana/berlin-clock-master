package com.ubs.opsit.interviews.clock;

import com.ubs.opsit.interviews.display.DisplayFactory;
import com.ubs.opsit.interviews.display.DisplayType;

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
        DisplayFactory displayFactory = new DisplayFactory();
        StringBuilder row = new StringBuilder();
        row.append(displayFactory.getDisplay(DisplayType.SECONDS, seconds).displayTime());
        row.append(displayFactory.getDisplay(DisplayType.HOURS, hours).displayTime());
        row.append(displayFactory.getDisplay(DisplayType.MINUTES, minutes).displayTime());
        return row.toString();
    }
}
