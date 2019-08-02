package com.kodilla.good.patterns.food2Door;

public class HealthyShop implements Shop {

    @Override
    public String getName() {
        return "HealthyShop";
    }

    public boolean productNameContainsWordHealthy(Order order) {

        String keyWord = "Healthy";

        if (order.getProduct().getName().toLowerCase().indexOf(keyWord.toLowerCase()) != -1) {
            return true;
        }
        return false;

    }

    public boolean process(Order order) {

        if (productNameContainsWordHealthy(order)) {
            return true;
        }
        return false;
    }
}
