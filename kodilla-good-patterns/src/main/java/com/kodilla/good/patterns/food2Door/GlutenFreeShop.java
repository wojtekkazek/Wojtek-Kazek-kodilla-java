package com.kodilla.good.patterns.food2Door;

public class GlutenFreeShop implements Shop {

    @Override
    public String getName() {
        return "GlutenFreeShop";
    }

    public boolean process(Order order) {

        if (order.getProduct().isContainingGluten()) {
            return false;
        }

        return true;

    }
}
