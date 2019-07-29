package com.pratyush.strategy.brew;

public class BrewFactory {
    public static Brew useBrew(String brewStrategy) throws IllegalArgumentException {
        if (brewStrategy.equalsIgnoreCase("ColdWater")) {
            return new ColdWater();
        } else if (brewStrategy.equalsIgnoreCase("Filtered")) {
            return new Filtered();
        } else if (brewStrategy.equalsIgnoreCase("FrenchPressed")) {
            return new FrenchPressed();
        } else {
            throw new IllegalArgumentException("We do not support this brewing strategy! :(");
        }
    }
}
