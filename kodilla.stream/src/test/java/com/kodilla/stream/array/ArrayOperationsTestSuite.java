package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[]{};

        //When
        double average = getAverage(numbers);

        //Then
        Assert.assertEquals(Double.NaN, average, 0.01);

    }

}
