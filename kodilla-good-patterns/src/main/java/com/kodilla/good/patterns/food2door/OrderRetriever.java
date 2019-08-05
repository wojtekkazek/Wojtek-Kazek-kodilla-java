package com.kodilla.good.patterns.food2door;

public class OrderRetriever {

    public boolean retrieveOrder(Order order) {

        for (OrderItem item : order.getOrderItems()) {

            if (order.getShopChain().getChainOfShops().contains(item.getShop())) {
                if (item.getShop().process(item)) {
                    System.out.println("Item accepted by " + item.getShop().getName());
                } else {
                    System.out.println("Item rejected by " + item.getShop().getName());
                    System.out.println("Order can't be proceeded");
                    return false;
                }
            } else {
                System.out.println("Shop requested in the order is not part of " + order.getShopChain().getName());
                System.out.println("Order can't be proceeded");
                return false;
            }

        }

        return true;
    }

}
