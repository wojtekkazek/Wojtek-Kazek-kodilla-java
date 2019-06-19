package com.kodilla.testing.shape;

public class Square implements Shape {

    private double length;

    @Override
    public String getShapeName() {
        return "temporary name";
    }

    @Override
    public double getField() {
        return 1.5;
    }
}
