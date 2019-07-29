package com.pratyush.beverage;

public class Macchiato extends Beverage {
    private final double cost = 25.00;

    public Macchiato() {
        this.setDescription(String.format("Macchiato ($%s)", cost));
    }

    @Override
    public double getCost() {
        return this.getQuantity() * cost;
    }
}
