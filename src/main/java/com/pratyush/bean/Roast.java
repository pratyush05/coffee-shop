package com.pratyush.bean;

public enum Roast {
    ENGLAND("light"),
    AMERICAN("medium"),
    ITALIAN("medium-dark"),
    FRENCH("dark");

    private final String roastType;

    Roast(String roastType) {
        this.roastType = roastType;
    }

    public String getRoastType() {
        return this.roastType;
    }
}
