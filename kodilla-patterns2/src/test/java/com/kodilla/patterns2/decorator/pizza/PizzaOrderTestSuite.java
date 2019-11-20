package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testMeatPizzaWithExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MeatPizzaOrderDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(27), theCost);
    }

    @Test
    public void testMeatPizzaWithExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MeatPizzaOrderDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza to be made with: tomato sauce, cheese, salami, ham, chorizo and extra cheese", description);
    }

    @Test
    public void testVegetarianPizzaToTakeAwayGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new VegetarianPizzaOrderDecorator(theOrder);
        theOrder = new TakeAwayDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), theCost);
    }

    @Test
    public void testVegetarianPizzaToTakeAwayGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new VegetarianPizzaOrderDecorator(theOrder);
        theOrder = new TakeAwayDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza to be made with: tomato sauce, cheese, mushrooms, olives, rocket to take away", description);
    }




}
