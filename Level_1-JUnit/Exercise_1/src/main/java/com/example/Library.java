package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Add a book to the collection
    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            sortBooks();  // Ensure books remain sorted
        }
    }

    // Get the list of all books
    public List<Book> getBooks() {
        return books;
    }

    // Get a book at a specific position, throwing exception if out of bounds
    public Book getBookAtPosition(int index) {
        if (index < 0 || index >= books.size()) {
            throw new IndexOutOfBoundsException("Book position out of bounds.");
        }
        return books.get(index);
    }

    // Add a book at a specific position
    public void addBookAtPosition(int index, Book book) {
        if (index < 0 || index > books.size()) {
            throw new IndexOutOfBoundsException("Cannot add book at this position.");
        }
        books.add(index, book);
        sortBooks();  // Keep books sorted alphabetically
    }

    // Remove a book by its title
    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    // Sort books alphabetically by title
    public void sortBooks() {
        Collections.sort(books, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
    }
}
