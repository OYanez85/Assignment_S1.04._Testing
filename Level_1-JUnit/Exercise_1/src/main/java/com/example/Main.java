package com.example;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("Effective Java"));
        library.addBook(new Book("Animal Farm"));
        library.addBook(new Book("Brave New World"));

        // Print all books
        for (Book book : library.getBooks()) {
            System.out.println(book.getTitle());
        }

        // Example of getting a book at a specific position
        try {
            Book bookAtPosition = library.getBookAtPosition(0);
            System.out.println("Book at position 0: " + bookAtPosition.getTitle());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        // Example of removing a book
        library.removeBook("Animal Farm");
        System.out.println("Removed 'Animal Farm'");

        // Print all books again after removing a book
        for (Book book : library.getBooks()) {
            System.out.println(book.getTitle());
        }
    }
}
