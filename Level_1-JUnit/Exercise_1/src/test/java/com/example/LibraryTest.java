package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setup() {
        library = new Library();
        library.addBook(new Book("The Hobbit"));
        library.addBook(new Book("1984"));
        library.addBook(new Book("Harry Potter"));
    }

    @Test
    public void testLibraryIsNotNull() {
        assertNotNull(library.getBooks());
    }

    @Test
    public void testAddBooks() {
        assertEquals(3, library.getBooks().size());
    }

    @Test
    public void testGetBookAtPosition() {
        Book book = library.getBookAtPosition(0);
        assertEquals(new Book("1984"), book);  // Sorted alphabetically
    }

    @Test
    public void testRemoveBookByTitle() {
        library.removeBookByTitle("1984");
        assertEquals(2, library.getBooks().size());
    }

    @Test
    public void testNoDuplicateBooks() {
        library.addBook(new Book("1984"));
        assertEquals(3, library.getBooks().size());  // Duplicate should not be added
    }

    @Test
    public void testListIsSorted() {
        library.addBook(new Book("A Tale of Two Cities"));
        assertEquals("A Tale of Two Cities", library.getBookAtPosition(0).getTitle());
    }

    @Test
    public void testOutOfBoundsIndex() {
        Exception exception = assertThrows(LibraryOperationException.class, () -> {
            library.getBookAtPosition(5);
        });
        assertEquals("Invalid index: 5", exception.getMessage());
    }

    @Test
    public void testAddDuplicateBookAtPosition() {
        library.addBookAtPosition(1, new Book("1984"));  // Try to add duplicate at a specific position
        assertEquals(3, library.getBooks().size());  // Duplicate should not be added
    }

    // New Test: Test empty library
    @Test
    public void testEmptyLibrary() {
        Library emptyLibrary = new Library();
        assertEquals(0, emptyLibrary.getBooks().size());
        assertThrows(LibraryOperationException.class, () -> emptyLibrary.getBookAtPosition(0));
    }

    // New Test: Test first position
    @Test
    public void testGetBookAtFirstPosition() {
        Book firstBook = library.getBookAtPosition(0);  // First book should be "1984" (alphabetically)
        assertEquals(new Book("1984"), firstBook);
    }

    // New Test: Test last position
    @Test
    public void testGetBookAtLastPosition() {
        Book lastBook = library.getBookAtPosition(library.getBooks().size() - 1);  // Last book should be "The Hobbit"
        assertEquals(new Book("The Hobbit"), lastBook);
    }
}
