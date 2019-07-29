package com.pratyush.beverage;

public class BeverageFactory {
    public static Beverage getBeverage(String beverageType) throws IllegalArgumentException{
        if (beverageType.equalsIgnoreCase("Cappuccino")) {
            return new Cappuccino();
        } else if (beverageType.equalsIgnoreCase("Espresso")) {
            return new Espresso();
        } else if (beverageType.equalsIgnoreCase("Latte")) {
            return new Latte();
        } else if (beverageType.equalsIgnoreCase("Macchiato")) {
            return new Macchiato();
        } else {
            throw new IllegalArgumentException("We do not serve this type of beverage yet! :(");
        }
    }
}
