package com.pratyush.beverage;

public class Latte extends Beverage {
    private final double cost = 22.00;

    public Latte() {
        this.setDescription(String.format("Latte ($%s)", cost));
    }

    @Override
    public double getCost() {
        return this.getQuantity() * cost;
    }
}
