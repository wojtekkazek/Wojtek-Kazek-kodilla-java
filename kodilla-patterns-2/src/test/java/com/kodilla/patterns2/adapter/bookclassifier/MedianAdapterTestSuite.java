package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        HashSet<Book> booksA = new HashSet<>();
        booksA.add(new Book("author1", "title1", 1000, "1234"));
        booksA.add(new Book("author2", "title2", 2000, "5678"));
        booksA.add(new Book("author3", "title3", 3000, "9101112"));
        booksA.add(new Book("author4", "title4", 4000, "113141516"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(booksA);
        //Then
        assertEquals(median, 2500);
    }
}
