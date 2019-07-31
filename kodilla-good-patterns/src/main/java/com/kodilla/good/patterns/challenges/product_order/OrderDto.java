package com.kodilla.good.patterns.challenges.product_order;

public class OrderDto {

    public User user;
    public boolean isOrdered;

    public OrderDto(User user, boolean idOrdered) {
        this.user = user;
        this.isOrdered = idOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
