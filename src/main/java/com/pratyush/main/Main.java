package com.pratyush.main;

import com.pratyush.bean.CoffeeBean;
import com.pratyush.bean.Grind;
import com.pratyush.bean.Roast;
import com.pratyush.beverage.Beverage;
import com.pratyush.beverage.BeverageFactory;
import com.pratyush.decorator.condiment.*;
import com.pratyush.strategy.brew.Brew;
import com.pratyush.strategy.brew.BrewFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final Grind DEFAULT_GRIND = Grind.MEDIUM;
    private static final Roast DEFAULT_ROAST = Roast.FRENCH;
    private static final int DEFAULT_QUANTITY = 3;

    public static void main(String[] args) throws IOException {
        System.out.println("Hola!");
        CoffeeBean coffeeBean = selectCoffeeBean();
        Brew brew = selectBrew();
        Beverage beverage = selectBeverageType();
        int quantity = selectQuantity();
        beverage = addCondimentsToCoffee(beverage);
        makeCoffee(beverage, brew, coffeeBean, quantity);

        System.out.printf(
            "Order is: %s\nCost is: $%s\n",
            beverage.getDescription(),
            beverage.getCost()
        );
    }

    private static CoffeeBean selectCoffeeBean() throws IOException {
        System.out.println("Select coffee grind (FINE, MEDIUM, COARSE) and roast (ENGLAND, AMERICAN, ITALIAN, FRENCH)");
        String grindType = in.readLine();
        String roastType = in.readLine();
        Grind grind;
        if (grindType.equalsIgnoreCase("FINE")) {
            grind = Grind.FINE;
        } else if (grindType.equalsIgnoreCase("MEDIUM")) {
            grind = Grind.MEDIUM;
        } else if (grindType.equalsIgnoreCase("COARSE")) {
            grind = Grind.COARSE;
        } else {
            grind = DEFAULT_GRIND;
        }
        Roast roast;
        if (roastType.equalsIgnoreCase("ENGLAND")) {
            roast = Roast.ENGLAND;
        } else if (roastType.equalsIgnoreCase("AMERICAN")) {
            roast = Roast.AMERICAN;
        } else if (roastType.equalsIgnoreCase("ITALIAN")) {
            roast = Roast.ITALIAN;
        } else if (roastType.equalsIgnoreCase("FRENCH")) {
            roast = Roast.FRENCH;
        } else {
            roast = DEFAULT_ROAST;
        }
        CoffeeBean coffeeBean = new CoffeeBean(grind, roast);
        return coffeeBean;
    }

    private static Brew selectBrew() throws IOException {
        System.out.println("Select brew method:\nColdWater\tFiltered\tFrenchPressed");
        String brewMethod = in.readLine();
        Brew brew = null;
        try {
            brew = BrewFactory.useBrew(brewMethod);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            System.exit(1);
        } catch (Exception exception) {
            System.out.println("Error occurred");
            System.exit(1);
        }
        return brew;
    }

    private static Beverage selectBeverageType() throws IOException {
        System.out.println("Select the type of coffee you want:\nCappuccino\tEspresso\tLatte\tMacchiato");
        String beverageType = in.readLine();
        Beverage beverage = null;
        try {
            beverage = BeverageFactory.getBeverage(beverageType);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            System.exit(1);
        } catch (Exception exception) {
            System.out.println("Error occurred");
            System.exit(1);
        }
        return beverage;
    }

    private static int selectQuantity() throws IOException {
        System.out.println("Select the cup size:\nShort\tTall\tGrande\tVenti");
        String cupSize = in.readLine();
        int quantity;
        if (cupSize.equalsIgnoreCase("Short")) {
            quantity = 1;
        } else if (cupSize.equalsIgnoreCase("Tall")) {
            quantity = 2;
        } else if (cupSize.equalsIgnoreCase("Grande")) {
            quantity = 3;
        } else if (cupSize.equalsIgnoreCase("Venti")) {
            quantity = 4;
        } else {
            quantity = DEFAULT_QUANTITY;
        }
        return quantity;
    }

    private static Beverage addCondimentsToCoffee(Beverage beverage) throws IOException {
        System.out.println("Select condiment(s) you want to add:\nMilk\tMocha\tSoy\tWhip\n(Press any key to exit!)");
        while(true) {
            String condiment = in.readLine();
            try {
                beverage = CondimentFactory.addCondiment(beverage, condiment);
            } catch (IllegalArgumentException exception) {
                break;
            }
        }
        return beverage;
    }

    private static void makeCoffee(Beverage beverage, Brew brew, CoffeeBean coffeeBean, int quantity) {
        beverage
            .setBrew(brew)
            .setCoffeeBean(coffeeBean)
            .setQuantity(quantity)
            .build();
    }
}
