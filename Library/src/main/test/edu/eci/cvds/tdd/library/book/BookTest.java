package edu.eci.cvds.tdd.library.book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void testEqualsBooksWithSameIsbn() {
        // Crear dos objetos Book con el mismo ISBN
        Book book1 = new Book("Java Programming", "John Doe", "12345");
        Book book2 = new Book("Java Programming", "John Doe", "12345");

        // Verificar que ambos libros son iguales, ya que tienen el mismo ISBN
        assertTrue(book1.equals(book2), "Los libros con el mismo ISBN deben ser iguales");
    }

    @Test
    public void testEqualsBooksWithDifferentIsbn() {
        // Crear dos objetos Book con diferentes ISBNs
        Book book1 = new Book("Java Programming", "John Doe", "12345");
        Book book2 = new Book("Advanced Java", "Jane Smith", "67890");

        // Verificar que los libros son diferentes, ya que tienen ISBNs diferentes
        assertFalse(book1.equals(book2), "Los libros con diferentes ISBNs no deben ser iguales");
    }

}
