package com.pratyush.decorator.condiment;

import com.pratyush.beverage.Beverage;

public class Soy extends Condiment {
    Beverage beverage;
    private final double cost = 13.50;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return String.format("%s, Soy ($%s)", this.beverage.getDescription(), cost);
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + cost;
    }
}
