package edu.eci.cvds.tdd.library.book;

import java.util.Objects;

public class Book {
    private final String tittle;
    private final String author;
    private final String isbn;

    public Book(String tittle, String author, String isbn) {
        this.tittle = tittle;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTittle() {
        return tittle;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return isbn.equals(book.isbn) &&
                tittle.equals(book.tittle) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tittle, author, isbn); // Usar los mismos atributos
    }
}