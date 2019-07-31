package com.kodilla.good.patterns.challenges.product_order;

public class RandomItem implements Item {

    private String name = "Random Item";

    @Override
    public String getName() {
        return name;
    }
}
