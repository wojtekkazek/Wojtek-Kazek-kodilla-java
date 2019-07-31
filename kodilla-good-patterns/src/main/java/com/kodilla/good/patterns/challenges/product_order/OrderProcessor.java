package com.kodilla.good.patterns.challenges.product_order;

public class OrderProcessor {

    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(OrderService orderService, OrderRepository orderRepository) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process (final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getOrderDate(), orderRequest.getAddress(), orderRequest.getItem());

        if (isOrdered) {
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getOrderDate(), orderRequest.getAddress(), orderRequest.getItem());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
