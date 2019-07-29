package com.pratyush.strategy.brew;

import com.pratyush.bean.CoffeeBean;

public class Filtered implements Brew {
    private final Object FILTER = "filter";

    @Override
    public void setUp(CoffeeBean bean, int quantity) {
        System.out.println(String.format(
            "Setting up %s with %d tbsp of %s",
            FILTER,
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
        System.out.println(String.format("Throwing away %s", FILTER.toString()));
    }
}
