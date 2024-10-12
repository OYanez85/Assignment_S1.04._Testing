package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testLibraryIsNotNull() {
        Library library = new Library();
        assertNotNull(library.getBooks());
    }

    @Test
    public void testAddBooks() {
        Library library = new Library();
        library.addBook(new Book("Book 1"));
        library.addBook(new Book("Book 2"));
        assertEquals(2, library.getBooks().size());
    }

    @Test
    public void testGetBookAtPosition() {
        Library library = new Library();
        Book book = new Book("Book 1");
        library.addBook(book);
        assertEquals(book, library.getBookAtPosition(0));
    }

    @Test
    public void testRemoveBookByTitle() {
        Library library = new Library();
        library.addBook(new Book("Book 1"));
        library.removeBookByTitle("Book 1");
        assertEquals(0, library.getBooks().size());
    }
}
