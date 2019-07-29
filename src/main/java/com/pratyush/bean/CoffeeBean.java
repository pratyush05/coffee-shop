package com.pratyush.bean;

public class CoffeeBean {
    private Grind grind;
    private Roast roast;

    public CoffeeBean(Grind grind, Roast roast) {
        this.grind = grind;
        this.roast = roast;
    }

    public Grind getGrind() {
        return grind;
    }

    public Roast getRoast() {
        return roast;
    }

    public void setGrind(Grind grind) {
        this.grind = grind;
    }

    public void setRoast(Roast roast) {
        this.roast = roast;
    }

    @Override
    public String toString() {
        return grind.getGrindType()
            + " grind "
            + roast.getRoastType()
            + " roast coffee beans";
    }
}
