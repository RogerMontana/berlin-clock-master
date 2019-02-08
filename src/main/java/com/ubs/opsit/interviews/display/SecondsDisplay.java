package com.ubs.opsit.interviews.display;

import static com.ubs.opsit.interviews.lamp.ClockLamp.NO_LIGHT;
import static com.ubs.opsit.interviews.lamp.ClockLamp.YELLOW_LIGHT;

public class SecondsDisplay implements Displayable {
    private int seconds;

    public SecondsDisplay(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String showTime() {
        return String.format("%c\n", (seconds % 2 == 0 ? YELLOW_LIGHT.getColor() : NO_LIGHT.getColor()));
    }
}
