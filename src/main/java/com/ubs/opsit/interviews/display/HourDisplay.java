package com.ubs.opsit.interviews.display;

import static com.ubs.opsit.interviews.lamp.ClockLight.NO_LIGHT;
import static com.ubs.opsit.interviews.lamp.ClockLight.RED_LIGHT;

public class HourDisplay extends BaseTwoRowDisplay {

    public HourDisplay(int currentHour) {
        super(currentHour);
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
    public String displayTime() {
        return String.format("%s\n%s\n", this.getFirst(), super.getSecond(RED_LIGHT));
    }
}
