package com.kodilla.good.patterns.food2Door;

public class NewShop implements Shop {

    public String getName() {
        return "NewShop";
    }

    public boolean process(Order order) {
        return false;
    }

}
