package com.kodilla.good.patterns.food2door;

public class HealthyShop implements Shop {

    @Override
    public String getName() {
        return "HealthyShop";
    }

    public boolean productNameContainsWordHealthy(OrderItem order) {

        String keyWord = "Healthy";

        if (order.getProduct().getName().toLowerCase().indexOf(keyWord.toLowerCase()) != -1) {
            return true;
        }
        return false;

    }

    public boolean process(OrderItem order) {

        if (productNameContainsWordHealthy(order)) {
            return true;
        }
        return false;
    }
}
