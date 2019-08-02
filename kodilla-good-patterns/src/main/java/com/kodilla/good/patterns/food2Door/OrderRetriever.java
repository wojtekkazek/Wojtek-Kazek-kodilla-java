package com.kodilla.good.patterns.food2Door;

public class OrderRetriever {

    public void retrieveOrder (Order order, ShopChain shopChain) {

        if (shopChain.getChainOfShops().contains(order.getShop())) {
            if (order.getShop().process(order)) {
                System.out.println("Order accepted by " + order.getShop().getName());
            } else {
                System.out.println("Order rejected by " + order.getShop().getName());
            }
        } else {
            System.out.println("Shop requested in the order is not part of " + shopChain.getName());
        }
    }

}
