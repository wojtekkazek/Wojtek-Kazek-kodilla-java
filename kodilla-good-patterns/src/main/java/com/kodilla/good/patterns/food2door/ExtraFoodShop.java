package com.kodilla.good.patterns.food2door;

import java.util.Random;

public class ExtraFoodShop implements Shop {

    @Override
    public String getName() {
        return "ExtraFoodShop";
    }

    public boolean process(OrderItem order) {

        Random randomGenerator = new Random();
        int randomNo = randomGenerator.nextInt(10);

        if (randomNo * order.getQuantity() >= 100) {
            return true;
        }

        return false;

    }
}
