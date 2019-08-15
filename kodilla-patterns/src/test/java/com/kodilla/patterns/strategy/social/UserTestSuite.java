package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User seba = new Millenials("Seba");
        User janusz = new YGeneration("Janusz");
        User brajan = new ZGeneration("Brajan");

        //When
        String sebaUses = seba.sharePost();
        String januszUses = janusz.sharePost();
        String brajanUses = brajan.sharePost();

        //Then
        Assert.assertEquals("Facebook", sebaUses);
        Assert.assertEquals("Twitter", januszUses);
        Assert.assertEquals("Snapchat", brajanUses);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User seba = new Millenials("Seba");

        //When
        seba.setSocialPublisher(new SnapchatPublisher());
        String sebaUses = seba.sharePost();

        //Then
        Assert.assertEquals("Snapchat", sebaUses);
    }
}
