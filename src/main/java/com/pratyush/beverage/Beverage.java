package com.pratyush.beverage;

import com.pratyush.bean.CoffeeBean;
import com.pratyush.bean.Grind;
import com.pratyush.bean.Roast;
import com.pratyush.strategy.brew.Brew;
import com.pratyush.strategy.brew.FrenchPressed;

public abstract class Beverage {
    private Brew brew = new FrenchPressed();
    private CoffeeBean coffeeBean = new CoffeeBean(Grind.MEDIUM, Roast.AMERICAN);
    private String description = "Unknown beverage";
    private int quantity = 3;

    public abstract double getCost();

    public CoffeeBean getCoffeeBean() {
        return this.coffeeBean;
    }

    public String getDescription() {
        return description;
    }

    public Brew getBrew() {
        return brew;
    };

    public int getQuantity() {
        return quantity;
    }

    public Beverage setBrew(Brew brew) {
        this.brew = brew;
        return this;
    }

    public Beverage setCoffeeBean(CoffeeBean coffeeBean) {
        this.coffeeBean = coffeeBean;
        return this;
    }

    public Beverage setDescription(String description) {
        this.description = description;
        return this;
    }

    public Beverage setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public void build() {
        System.out.println("\n******************** Brewing started ********************");
        brew.setUp(coffeeBean, quantity);
        brew.startBrew();
        brew.cleanUp();
        System.out.println("********************  Brewing ended  ********************\n");
    }
}
