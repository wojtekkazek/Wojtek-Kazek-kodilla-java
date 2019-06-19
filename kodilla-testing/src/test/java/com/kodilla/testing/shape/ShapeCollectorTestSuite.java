package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testShapeName() {
        //Given
        Square square = new Square( 5.0);

        //When
        String result = square.getShapeName();

        //Then
        Assert.assertEquals("Square", result);
    }

    @Test
    public void testSquareField() {
        //Given
        Square square = new Square(5.0);

        //When
        Double result = square.getField();

        //Then
        Assert.assertEquals(25.0, result,0.01);
    }

    @Test
    public void testCircleField() {
        //Given
        Circle circle = new Circle( 1.0);

        //When
        Double result = circle.getField();

        //Then
        Assert.assertEquals(Math.PI, result, 0.01);
    }

    @Test
    public void testTriangleField() {
        //Given
        Triangle triangle = new Triangle( 2.0,3.0);

        //When
        Double result = triangle.getField();

        //Then
        Assert.assertEquals(3.0, result, 0.01);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(new Circle(4.5));

        //Then
        ArrayList<Shape> collectorWithCirle = new ArrayList<>();
        collectorWithCirle.add(new Circle(4.5));
        Assert.assertEquals(collectorWithCirle, shapeCollector.returnList());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(4.5));
        shapeCollector.addFigure(new Square(7.0));

        //When
        shapeCollector.removeFigure(new Circle(4.5));

        //Then
        ArrayList<Shape> collectorAfterRemoval = new ArrayList<>();
        collectorAfterRemoval.add(new Square( 7.0));
        Assert.assertEquals(collectorAfterRemoval, shapeCollector.returnList());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(4.5));
        shapeCollector.addFigure(new Square(7.0));

        //When
        Shape result = shapeCollector.getFigure(1);

        //Then
        Shape figure = new Square( 7.0);
        Assert.assertEquals(figure, result);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Triangle(2.0, 5.0));
        shapeCollector.addFigure(new Square(1.0));

        //When
        shapeCollector.showFigures();

        //Then
        ArrayList<Shape> collectorToShow = new ArrayList<>();
        collectorToShow.add(new Triangle(2.0, 5.0));
        collectorToShow.add(new Square(1.0));
        Assert.assertEquals(collectorToShow, shapeCollector.returnList());
    }

}
