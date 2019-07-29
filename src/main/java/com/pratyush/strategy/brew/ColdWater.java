package com.pratyush.strategy.brew;

import com.pratyush.bean.CoffeeBean;

public class ColdWater implements Brew {
    private static Object POT = "pot";

    @Override
    public void setUp(CoffeeBean bean, int quantity) {
        System.out.println(String.format(
            "Setting up %s with %d tbsp of %s",
            POT,
            quantity,
            bean.toString()
        ));
    }

    @Override
    public void startBrew() {
        System.out.println("Brewing coffee");
    }

    @Override
    public void cleanUp() {
        System.out.println(String.format("Cleaning up %s", POT.toString()));
    }
}
