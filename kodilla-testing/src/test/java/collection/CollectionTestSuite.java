package com.kodilla.testing.collection;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> noNumbers = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = exterminator.exterminate(noNumbers);
        System.out.println("Testing Empty List");
        //Then
        ArrayList<Integer> correctResult = new ArrayList<>();
        Assert.assertEquals(correctResult, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> oddAndEvenNumbers = new ArrayList<>();
        oddAndEvenNumbers.add(3);
        oddAndEvenNumbers.add(6);
        oddAndEvenNumbers.add(5);
        oddAndEvenNumbers.add(4);
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = exterminator.exterminate(oddAndEvenNumbers);
        System.out.println("Testing Normal List");
        //Then
        ArrayList<Integer> correctResult = new ArrayList<>();
        correctResult.add(6);
        correctResult.add(4);
        Assert.assertEquals(correctResult, result);
    }
}
