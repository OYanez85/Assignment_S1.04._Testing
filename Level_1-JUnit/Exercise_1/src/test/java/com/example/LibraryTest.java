package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
        library.addBook(new Book("Effective Java"));
        library.addBook(new Book("Animal Farm"));
        library.addBook(new Book("Brave New World"));
    }

    @Test
    public void testGetBookAtPosition() {
        // Validate that the books are in alphabetical order after sorting
        Book book = library.getBookAtPosition(0);
        assertEquals("Animal Farm", book.getTitle(), "The book at position 0 should be 'Animal Farm'");

        // Confirm sorting is correct
        Book secondBook = library.getBookAtPosition(1);
        assertEquals("Brave New World", secondBook.getTitle(), "The book at position 1 should be 'Brave New World'");

        Book thirdBook = library.getBookAtPosition(2);
        assertEquals("Effective Java", thirdBook.getTitle(), "The book at position 2 should be 'Effective Java'");
    }

    @Test
    public void testRemoveBook() {
        library.removeBook("Animal Farm");

        // After removal, accessing the second position (previously occupied by 'Animal Farm') should throw an exception
        assertThrows(IndexOutOfBoundsException.class, () -> library.getBookAtPosition(2));
    }

    @Test
    public void testBooksRemainSorted() {
        library.addBook(new Book("1984"));
        assertEquals("1984", library.getBookAtPosition(0).getTitle(), "Books should be sorted alphabetically with '1984' first");
        assertEquals("Effective Java", library.getBookAtPosition(3).getTitle(), "The book at position 3 should be 'Effective Java'");
    }

    @Test
    public void testNoDuplicateBooks() {
        library.addBook(new Book("Effective Java"));
        assertEquals(3, library.getBooks().size());  // Size remains 3 since no duplicates allowed
    }

    @Test
    public void testOutOfBoundsException() {
        assertThrows(IndexOutOfBoundsException.class, () -> library.getBookAtPosition(10));
    }
}
