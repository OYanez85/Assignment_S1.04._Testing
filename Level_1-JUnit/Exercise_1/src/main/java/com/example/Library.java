package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (!books.contains(book)) {  // Prevent duplicates
            books.add(book);
            Collections.sort(books, (a, b) -> a.getTitle().compareTo(b.getTitle()));
        } else {
            System.out.println("Book already exists in the library.");
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getBookAtPosition(int index) {
        if (index < 0 || index >= books.size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return books.get(index);
    }

    public void addBookAtPosition(int index, Book book) {
        if (!books.contains(book)) {  // Prevent duplicates
            books.add(index, book);
            Collections.sort(books, (a, b) -> a.getTitle().compareTo(b.getTitle()));
        }
    }

    public void removeBookByTitle(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }
}
