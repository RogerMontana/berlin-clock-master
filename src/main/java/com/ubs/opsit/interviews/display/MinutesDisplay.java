package com.ubs.opsit.interviews.display;

import static com.ubs.opsit.interviews.lamp.ClockLamp.NO_LIGHT;
import static com.ubs.opsit.interviews.lamp.ClockLamp.RED_LIGHT;
import static com.ubs.opsit.interviews.lamp.ClockLamp.YELLOW_LIGHT;

public class MinutesDisplay extends BaseTwoRowDisplay {

    public MinutesDisplay(int currentTimeUnit) {
        super(YELLOW_LIGHT, currentTimeUnit);
    }

    @Override
    public String getFirst() {
        char noLight = NO_LIGHT.getColor();
        StringBuilder row =
                new StringBuilder(String.format("%c%c%c%c%c%c%c%c%c%c%c",
                                                            noLight, noLight, noLight, noLight, noLight, noLight, noLight, noLight, noLight,
                                                            noLight, noLight));
        for (int i = 5, index = 0; i <= currentTimeUnit; i += 5, index++)
            row.setCharAt(index, (index > 0 && i % 15 == 0) ? RED_LIGHT.getColor() : YELLOW_LIGHT.getColor());
        return row.toString();
    }

    public String showTime(){
        return String.format("%s\n%s", this.getFirst(), this.getSecond());
    }
}
