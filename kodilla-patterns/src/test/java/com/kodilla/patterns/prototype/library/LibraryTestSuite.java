package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //given
        Library library = new Library("library1");
        Book book1 = new Book("Book1", "Author1", LocalDate.of(1,1,1));
        Book book2 = new Book("Book2", "Author2", LocalDate.of(2,2,2));
        Book book3 = new Book("Book3", "Author3", LocalDate.of(3,3,3));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making a shallow clone
        Library shallowCloneLibrary = null;
        try {
            shallowCloneLibrary = library.shallowCopy();
            shallowCloneLibrary.setName("library2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep clone
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("library3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        library.getBooks().remove(book3);

        //then
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, shallowCloneLibrary.getBooks().size());
        Assert.assertEquals(3, deepCloneLibrary.getBooks().size());
    }

}
