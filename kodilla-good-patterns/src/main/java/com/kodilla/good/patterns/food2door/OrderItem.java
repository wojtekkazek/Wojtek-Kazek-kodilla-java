package com.kodilla.good.patterns.food2door;

public class OrderItem {

    private Shop shop;
    private Product product;
    private double quantity;

    public OrderItem(Shop shop, Product product, double quantity) {
        this.shop = shop;
        this.product = product;
        this.quantity = quantity;
    }

    public Shop getShop() {
        return shop;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }
}
