package com.kodilla.testing.shape;

public class Circle implements Shape {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public Double getField() {
        return Math.PI*radius*radius;
    }
}
