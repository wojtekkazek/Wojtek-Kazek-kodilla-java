package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class ShopChain {

    private String name;
    private List chainOfShops = new ArrayList<Shop>();

    public ShopChain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addShop (Shop shop) {
        chainOfShops.add(shop);
    }

    public List getChainOfShops() {
        return chainOfShops;
    }
}
