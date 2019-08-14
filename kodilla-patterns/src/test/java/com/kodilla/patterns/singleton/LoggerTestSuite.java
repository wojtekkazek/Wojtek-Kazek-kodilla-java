package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("sth more");
        //When
        String log = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("sth more", log);
    }

}
