package com.ubs.opsit.interviews.display;

import java.util.stream.IntStream;

import com.ubs.opsit.interviews.lamp.ClockLamp;

import static com.ubs.opsit.interviews.lamp.ClockLamp.NO_LIGHT;

public abstract class BaseTwoRowDisplay implements Displayable {
    private ClockLamp rowColor;
    protected int currentTimeUnit;

    public BaseTwoRowDisplay(ClockLamp secondRowColor, int currentTimeUnit) {
        this.rowColor = secondRowColor;
        this.currentTimeUnit = currentTimeUnit;
    }

    public abstract String getFirst();

    public String getSecond() {
        char color = rowColor.getColor();
        StringBuilder row = new StringBuilder(formatDisplayRowFourLamps(NO_LIGHT.getColor()));
        if ((currentTimeUnit % 5) != 0)
            IntStream.range(0, currentTimeUnit % 5).forEach(idx -> row.setCharAt(idx, color));
        return row.toString();
    }

    protected String formatDisplayRowFourLamps(char noLight) {
        return String.format("%c%c%c%c", noLight, noLight, noLight, noLight);
    }
}
