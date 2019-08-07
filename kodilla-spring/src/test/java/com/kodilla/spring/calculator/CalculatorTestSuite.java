package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sum = calculator.add(9,4.5);
        double dif = calculator.sub(9,4.5);
        double pro =calculator.mul(9,4.5);
        double quo =calculator.div(9,4.5);
        //Then
        Assert.assertEquals(13.5, sum, 0.1);
        Assert.assertEquals(4.5, dif, 0.1);
        Assert.assertEquals(40.5, pro, 0.1);
        Assert.assertEquals(2, quo, 0.1);
    }

}
