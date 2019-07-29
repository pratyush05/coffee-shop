package com.pratyush.strategy.brew;

import com.pratyush.bean.CoffeeBean;

public interface Brew {
    void setUp(CoffeeBean bean, int quantity);
    void startBrew();
    void cleanUp();
}
