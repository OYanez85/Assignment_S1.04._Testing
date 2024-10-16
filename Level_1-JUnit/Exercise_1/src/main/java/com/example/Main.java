package com.example;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("The Hobbit"));
        library.addBook(new Book("1984"));
        library.addBook(new Book("Harry Potter"));

        System.out.println("Library contains:");
        for (Book book : library.getBooks()) {
            System.out.println(book.getTitle());
        }
    }
}

