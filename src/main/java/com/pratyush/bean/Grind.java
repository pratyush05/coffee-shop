package com.pratyush.bean;

public enum Grind {
    FINE("fine"),
    MEDIUM("medium"),
    COARSE("coarse");

    private final String grindType;

    Grind(String grindType) {
        this.grindType = grindType;
    }

    public String getGrindType() {
        return grindType;
    }
}
