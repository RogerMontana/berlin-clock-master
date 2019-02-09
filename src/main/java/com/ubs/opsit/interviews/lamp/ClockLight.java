package com.ubs.opsit.interviews.lamp;

public enum ClockLight {
    NO_LIGHT ('O'),
    RED_LIGHT ('R'),
    YELLOW_LIGHT ('Y');

    private final char name;

    private ClockLight(char s) {
        name = s;
    }

    public char getColor() {
        return name;
    }

}
