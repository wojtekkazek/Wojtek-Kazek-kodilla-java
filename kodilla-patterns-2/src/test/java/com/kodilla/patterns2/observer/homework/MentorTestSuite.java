package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        StudentTasks wojtekModule23 = new StudentTasks("Wojtek", "module 23");
        StudentTasks wojtekModule24 = new StudentTasks("Wojtek", "module 24");
        StudentTasks randomModuleRandom = new StudentTasks("Random", "random");
        Mentor lukasz = new Mentor("Lukasz");
        Mentor anyMentor = new Mentor("anyMentor");
        wojtekModule23.registerObserver(lukasz);
        wojtekModule24.registerObserver(lukasz);
        wojtekModule24.registerObserver(anyMentor);
        randomModuleRandom.registerObserver(anyMentor);
        wojtekModule23.removeObserver(lukasz);
        //When
        wojtekModule23.addTask("23.10");
        wojtekModule24.addTask("24.3");
        wojtekModule24.addTask("24.4");
        randomModuleRandom.addTask("anyTask");
        //Then
        assertEquals(2, lukasz.getUpdateCount());
        assertEquals(3, anyMentor.getUpdateCount());
    }

}
