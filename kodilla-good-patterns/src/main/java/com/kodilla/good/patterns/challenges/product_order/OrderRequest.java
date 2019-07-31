package com.kodilla.good.patterns.challenges.product_order;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime orderDate;
    private Address deliveryAddress;
    private Item item;

    public OrderRequest(User user, LocalDateTime orderDate, Address deliveryAddress, Item item) {
        this.user = user;
        this.orderDate = orderDate;
        this.deliveryAddress = deliveryAddress;
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Address getAddress() {
        return deliveryAddress;
    }

    public Item getItem() {
        return item;
    }
}
