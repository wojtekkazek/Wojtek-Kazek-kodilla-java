package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        //Given
        Country poland = new Country(new BigDecimal("36000000"));
        Country uk = new Country(new BigDecimal("67000000"));
        Continent europe = new Continent();
        europe.addCountry(poland);
        europe.addCountry(uk);

        Country china = new Country(new BigDecimal("1300000000"));
        Country mongolia = new Country(new BigDecimal("4000000"));
        Continent asia = new Continent();
        asia.addCountry(china);
        asia.addCountry(mongolia);

        //When
        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        BigDecimal totalPopulation = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal(1407000000), totalPopulation);

    }
}
