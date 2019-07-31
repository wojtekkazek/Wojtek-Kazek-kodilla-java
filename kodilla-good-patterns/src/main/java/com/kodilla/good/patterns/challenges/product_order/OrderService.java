package com.kodilla.good.patterns.challenges.product_order;

import java.time.LocalDateTime;

public class OrderService {

    public boolean order(final User user, final LocalDateTime orderDate, final Address deliveryAddress, final Item item) {
        System.out.println("Ordering item: " + item.getName() + " on " + orderDate.toString() + " for: " + user.getNick() + " to be delivered to: " + deliveryAddress.toString());
        return true;
    }

}