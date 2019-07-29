package com.pratyush.decorator.condiment;

import com.pratyush.beverage.Beverage;
import com.pratyush.beverage.BeverageFactory;

public class Mocha extends Condiment {
    Beverage beverage;
    private final double cost = 15.00;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return String.format("%s, Mocha ($%s)", this.beverage.getDescription(), cost);
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + cost;
    }
}
