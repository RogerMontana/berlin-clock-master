package com.ubs.opsit.interviews.display;

public class DisplayFactory {

    public DisplayFactory() {
    }

    public Displayable getDisplay(DisplayType displayType, int timeUnit) {
        if (displayType == null) {
            return null;
        }
        if (displayType.equals(DisplayType.MINUTES)) {
            return new MinutesDisplay(timeUnit);
        } else if (displayType.equals(DisplayType.HOURS)) {
            return new HourDisplay(timeUnit);
        } else if (displayType.equals(DisplayType.SECONDS)) {
            return new SecondsDisplay(timeUnit);
        }
        return null;
    }
}
