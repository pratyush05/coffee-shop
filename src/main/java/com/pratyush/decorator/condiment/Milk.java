package com.pratyush.decorator.condiment;

import com.pratyush.beverage.Beverage;

public class Milk extends Condiment {
    private Beverage beverage;
    private final double cost = 10.00;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return String.format("%s, Milk ($%s)", this.beverage.getDescription(), cost);
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + cost;
    }
}
