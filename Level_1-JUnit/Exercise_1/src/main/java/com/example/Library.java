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
        books.add(book);
        Collections.sort(books, (a, b) -> a.getTitle().compareTo(b.getTitle()));
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getBookAtPosition(int index) {
        return books.get(index);
    }

    public void addBookAtPosition(int index, Book book) {
        books.add(index, book);
        Collections.sort(books, (a, b) -> a.getTitle().compareTo(b.getTitle()));
    }

    public void removeBookByTitle(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }
}
