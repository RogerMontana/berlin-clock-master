package com.ubs.opsit.interviews.display;

import static com.ubs.opsit.interviews.lamp.ClockLamp.NO_LIGHT;
import static com.ubs.opsit.interviews.lamp.ClockLamp.RED_LIGHT;

public class HourDisplay extends BaseTwoRowDisplay {

    public HourDisplay(int currentHour) {
        super(RED_LIGHT, currentHour);
    }

    @Override
    public String getFirst() {
        StringBuilder row = new StringBuilder(formatDisplayRowFourLamps(NO_LIGHT.getColor()));
        for (int i = 5, index = 0; i <= currentTimeUnit; i += 5, index++) {
            row.setCharAt(index, RED_LIGHT.getColor());
        }
        return row.toString();
    }

    @Override
    public String showTime() {
        return String.format("%s\n%s\n", this.getFirst(), this.getSecond());
    }
}
