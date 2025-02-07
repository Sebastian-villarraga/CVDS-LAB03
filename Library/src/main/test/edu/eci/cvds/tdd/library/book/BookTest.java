package edu.eci.cvds.tdd.library.book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void testEqualsBooksWithSameIsbn() {
        // Crear dos objetos Book con el mismo ISBN
        Book book1 = new Book("Java Programming", "John Doe", "12345");
        Book book2 = new Book("Java Programming", "John Doe", "12345");

        assertTrue(book1.equals(book2), "Los libros con el mismo ISBN deben ser iguales");
    }

    @Test
    public void testEqualsBooksWithDifferentIsbn() {
        // Crear dos objetos Book con diferentes ISBNs
        Book book1 = new Book("Java Programming", "John Doe", "12345");
        Book book2 = new Book("Advanced Java", "Jane Smith", "67890");

        assertFalse(book1.equals(book2), "Los libros con diferentes ISBNs no deben ser iguales");
    }

    @Test
    public void testGetTitleMethod() {
        Book book1 = new Book("Java Programming", "John Doe", "12345");
        assertEquals(book1.getTittle(), "Java Programming");
    }

    @Test
    public void testGetAuthorMethod() {
        Book book1 = new Book("Java Programming", "John Doe", "12345");
        assertEquals(book1.getAuthor(), "John Doe");
    }

    @Test
    public void testGetISBNMethod() {
        Book book1 = new Book("Java Programming", "John Doe", "12345");
        assertEquals(book1.getIsbn(), "12345");
    }

    @Test
    public void testEqualsNull() {
        // Crear un libro
        Book book = new Book("12345", "Java Programming", "John Doe");

        assertFalse(book.equals(null), "El libro no debe ser igual a null.");
    }

    @Test
    public void testEqualsDifferentClass() {
        // Crear un libro
        Book book = new Book("12345", "Java Programming", "John Doe");
        String str = "Some String";  // Crear un objeto de una clase diferente

        assertFalse(book.equals(str), "El libro no debe ser igual a un objeto de otra clase.");
    }
}
