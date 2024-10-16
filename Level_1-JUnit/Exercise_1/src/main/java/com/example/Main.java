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

        // Test JSON serialization for a Book object
        Book book = new Book("The Hobbit");
        try {
            // Serialize the Book object
            String json = JsonSerializer.serialize(book);
            System.out.println("Serialized Book: " + json);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Serialize the entire Library object
        try {
            String libraryJson = JsonSerializer.serialize(library);
            System.out.println("Serialized Library: " + libraryJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



