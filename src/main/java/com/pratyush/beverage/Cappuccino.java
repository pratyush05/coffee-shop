package com.pratyush.beverage;

public class Cappuccino extends Beverage {
    private final double cost = 20.00;

    public Cappuccino() {
        this.setDescription(String.format("Cappuccino ($%s)", cost));
    }

    @Override
    public double getCost() {
        return this.getQuantity() * cost;
    }
}
