package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Refactored repetitive code to helper method
    private void addAndSortBooks(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            Collections.sort(books, (a, b) -> a.getTitle().compareTo(b.getTitle()));
        } else {
            System.out.println("Book \"" + book.getTitle() + "\" already exists in the library.");  // Informative message
        }
    }

    public void addBook(Book book) {
        addAndSortBooks(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getBookAtPosition(int index) {
        if (index < 0 || index >= books.size()) {
            throw new LibraryOperationException("Invalid index: " + index);  // Custom exception
        }
        return books.get(index);
    }

    public void addBookAtPosition(int index, Book book) {
        addAndSortBooks(book);
    }

    public void removeBookByTitle(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }
}
