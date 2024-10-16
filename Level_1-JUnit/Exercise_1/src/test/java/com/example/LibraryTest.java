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
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            library.getBookAtPosition(5);
        });
        assertEquals("Invalid index: 5", exception.getMessage());
    }
}
