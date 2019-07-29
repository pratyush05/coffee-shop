package com.pratyush.strategy.brew;

import com.pratyush.bean.CoffeeBean;

public class FrenchPressed implements Brew {
    private static Object PLUNGER = "plunger";

    @Override
    public void setUp(CoffeeBean bean, int quantity) {
        System.out.println(String.format(
            "Setting up %s with %d tbsp of %s",
            PLUNGER,
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
        System.out.println(String.format("Cleaning up %s", PLUNGER.toString()));
    }
}
