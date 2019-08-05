package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        ShopChain food2Door = new ShopChain("Food2Door");

        Shop shop1 = new ExtraFoodShop();
        Shop shop2 = new HealthyShop();
        Shop shop3 = new GlutenFreeShop();
        Shop shop4 = new NewShop();

        food2Door.addShop(shop1);
        food2Door.addShop(shop2);
        food2Door.addShop(shop3);

        Product product1 = new Product("RANDOM HEALTHY ITEM", false);
        Product product2 = new Product("RANDOM ITEM", true);

        List<OrderItem> orderList = new ArrayList<>();

        orderList.add(new OrderItem(shop1, product1, 50));
        orderList.add(new OrderItem(shop2, product1, 50));
        orderList.add(new OrderItem(shop3, product1, 50));
        orderList.add(new OrderItem(shop4, product1, 50));
        orderList.add(new OrderItem(shop2, product2, 50));
        orderList.add(new OrderItem(shop3, product2, 50));

        Order order = new Order(food2Door, orderList);

        OrderRetriever orderRetriever = new OrderRetriever();
        orderRetriever.retrieveOrder(order);

    }

}
