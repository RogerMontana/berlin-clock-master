package com.ubs.opsit.interviews.lamp;

public enum ClockLamp {
    NO_LIGHT ('O'),
    RED_LIGHT ('R'),
    YELLOW_LIGHT ('Y');

    private final char name;

    private ClockLamp(char s) {
        name = s;
    }

    public char getColor() {
        return name;
    }

}
