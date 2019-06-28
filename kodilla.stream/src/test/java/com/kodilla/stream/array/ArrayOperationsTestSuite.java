package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[]{5,2,3};

        //When
        OptionalDouble average = getAverage(numbers);

        //Then
        Assert.assertEquals(3.33, average.getAsDouble(), 0.01);

    }

}
