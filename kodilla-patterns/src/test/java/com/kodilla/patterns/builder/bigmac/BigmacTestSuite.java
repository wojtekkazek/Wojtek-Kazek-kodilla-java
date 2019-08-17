package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder("with sesame", 3)
                .sauce(BigMac.BigMacBuilder.BARBECUE)
                .ingredient(BigMac.BigMacBuilder.PRAWNS)
                .ingredient(BigMac.BigMacBuilder.MUSHROOMS)
                .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(2, howManyIngredients);
    }
}
