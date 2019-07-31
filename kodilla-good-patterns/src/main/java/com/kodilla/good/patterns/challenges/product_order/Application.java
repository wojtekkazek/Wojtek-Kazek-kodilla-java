package com.kodilla.good.patterns.challenges.product_order;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new OrderService(),new OrderRepository());
        orderProcessor.process(orderRequest);

    }

}
