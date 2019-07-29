package com.pratyush.decorator.condiment;

import com.pratyush.beverage.Beverage;

public class Whip extends Condiment {
    Beverage beverage;
    private final double cost = 20.00;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return String.format("%s, Whip ($%s)", this.beverage.getDescription(), cost);
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + cost;
    }
}
