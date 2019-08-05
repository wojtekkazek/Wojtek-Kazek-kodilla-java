package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements Shop {

    @Override
    public String getName() {
        return "GlutenFreeShop";
    }

    public boolean process(OrderItem order) {

        if (order.getProduct().isContainingGluten()) {
            return false;
        }

        return true;

    }
}
