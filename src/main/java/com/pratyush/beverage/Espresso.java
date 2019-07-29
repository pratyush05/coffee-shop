package com.pratyush.beverage;

public class Espresso extends Beverage {
    private final double cost = 15.00;

    public Espresso() {
        this.setDescription(String.format("Espresso ($%s)", cost));
    }

    @Override
    public double getCost() {
        return this.getQuantity() * cost;
    }
}
