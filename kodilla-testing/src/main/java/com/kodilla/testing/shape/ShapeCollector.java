package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public void addFigure (Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure (Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public void showFigures() {
        System.out.println(shapes);
    }

    public List<Shape> returnList() {
        return shapes;
    }

}
