package com.kodilla.good.patterns.food2Door;

public class Product {

    private String name;
    private boolean containingGluten;

    public Product(String name, boolean containingGluten) {
        this.name = name;
        this.containingGluten = containingGluten;
    }

    public String getName() {
        return name;
    }

    public boolean isContainingGluten() {
        return containingGluten;
    }
}
