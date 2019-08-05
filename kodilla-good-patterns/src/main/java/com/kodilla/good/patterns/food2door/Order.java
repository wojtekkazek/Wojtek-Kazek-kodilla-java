package com.kodilla.good.patterns.food2door;

import java.util.List;

public class Order {

    private ShopChain shopChain;
    private List<OrderItem> orderItems;

    public Order(ShopChain shopChain, List<OrderItem> orderItems) {
        this.shopChain = shopChain;
        this.orderItems = orderItems;
    }

    public ShopChain getShopChain() {
        return shopChain;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
}
