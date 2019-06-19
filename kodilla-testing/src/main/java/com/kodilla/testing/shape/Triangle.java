package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double base;
    private double height;

    @Override
    public String getShapeName() {
        return "temporary name";
    }

    @Override
    public double getField() {
        return 2.5;
    }
}
