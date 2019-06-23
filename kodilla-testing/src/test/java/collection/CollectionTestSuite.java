package collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
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
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> noNumbers = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = exterminator.exterminate(noNumbers);
        System.out.println("Testing Empty List");
        //Then
        List<Integer> correctResult = new ArrayList<>();
        Assert.assertEquals(correctResult, result);
    }
/*
    @Test
    public void testOddNumbersExterminatorNormalList() {
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
        ArrayList<Integer> list = (ArrayList<Integer>) Arrays.asList(4, 6);
        Assert.assertEquals(list, result);
    }

 */
}

