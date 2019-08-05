package com.kodilla.good.patterns.food2door;

public class NewShop implements Shop {

    public String getName() {
        return "NewShop";
    }

    public boolean process(OrderItem order) {
        return false;
    }

}
