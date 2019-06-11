package com.kodilla.testing;

import com.kodilla.testing.Calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        int result1 = calculator.add(2,3);

        if (result1 == 5){
            System.out.println("test of adding OK");
        } else {
            System.out.println("Error in test of adding!");
        }

        int result2 = calculator.subtract(8,2);

        if (result2 == 6){
            System.out.println("test of subtracting OK");
        } else {
            System.out.println("Error in test of subtracting!");
        }

    }
}