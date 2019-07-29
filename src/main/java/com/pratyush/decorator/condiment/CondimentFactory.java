package com.pratyush.decorator.condiment;

import com.pratyush.beverage.Beverage;

public class CondimentFactory {
    public static Beverage addCondiment(Beverage beverage, String condimentType) throws IllegalArgumentException {
        if (condimentType.equalsIgnoreCase("Milk")) {
            return new Milk(beverage);
        } else if (condimentType.equalsIgnoreCase("Mocha")) {
            return new Mocha(beverage);
        } else if (condimentType.equalsIgnoreCase("Soy")) {
            return new Soy(beverage);
        } else if (condimentType.equalsIgnoreCase("Whip")) {
            return new Whip(beverage);
        } else {
            throw new IllegalArgumentException("We do not have this condiment with us!");
        }
    }
}
