package com.kodilla.good.patterns.challenges.product_order;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve () {

        User user = new User("Jan", "Kowalski", "janek100");
        LocalDateTime orderDate = LocalDateTime.of(2017, 8, 1, 12, 0);
        Address deliveryAddress = new Address("Kozia Wolka", 10100, "Koziowolkanska", 1, 1);
        Item item = new RandomItem();

        return new OrderRequest(user, orderDate, deliveryAddress, item);

    }

}