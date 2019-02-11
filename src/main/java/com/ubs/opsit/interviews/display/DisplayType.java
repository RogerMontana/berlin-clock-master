package com.ubs.opsit.interviews.display;

public enum DisplayType {
    SECONDS ("SECONDS"),
    MINUTES ("MINUTES"),
    HOURS("HOURS");

    private final String name;

    private DisplayType(String s) {
        name = s;
    }

    public String getDisplayType() {
        return name;
    }
}
