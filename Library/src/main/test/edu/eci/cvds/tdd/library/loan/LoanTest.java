package edu.eci.cvds.tdd.library.loan;

import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.user.User;
<<<<<<< HEAD
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class LoanTest {
=======
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class LoanTest {

>>>>>>> bc3dead29a5d7d629d60b89d5366c69a1651099c
    private Loan loan;
    private Book book;
    private User user;
    private LocalDateTime loanDate;
    private LocalDateTime returnDate;
<<<<<<< HEAD


    @BeforeEach
    void setUp() {
        loan = new Loan();
        book = new Book("Java Programming", "John Doe", "12345");
        user = new User();
        loanDate = LocalDateTime.now();
        returnDate = loanDate.plusDays(14);
    }

    @Test
    void testSetAndGetBook() {
        loan.setBook(book);
        assertEquals(book, loan.getBook());
    }

    @Test
    void testSetAndGetUser() {
        loan.setUser(user);
        assertEquals(user, loan.getUser());
    }

    @Test
    void testSetAndGetLoanDate() {
        loan.setLoanDate(loanDate);
        assertEquals(loanDate, loan.getLoanDate());
    }

    @Test
    void testSetAndGetReturnDate() {
        loan.setReturnDate(returnDate);
        assertEquals(returnDate, loan.getReturnDate());
    }

    @Test
    void testSetAndGetStatus() {
        loan.setStatus(LoanStatus.ACTIVE);
        assertEquals(LoanStatus.ACTIVE, loan.getStatus());

        loan.setStatus(LoanStatus.RETURNED);
        assertEquals(LoanStatus.RETURNED, loan.getStatus());
    }
}
=======
    private LoanStatus status;

    // Configuración inicial para cada prueba
    @Before
    public void setUp() {
        loan = new Loan();
        book = new Book();  // Suponiendo que tienes una clase Book con un constructor vacío
        user = new User();  // Igualmente asumo que User tiene un constructor vacío
        loanDate = LocalDateTime.now();
        returnDate = loanDate.plusDays(7);  // Ejemplo de fecha de retorno
        status = LoanStatus.ACTIVE; // Asumimos que existe un enum LoanStatus con un valor ACTIVE
    }

    // Prueba para el método getBook() y setBook()
    @Test
    public void testSetGetBook() {
        loan.setBook(book);
        assertEquals("El libro no coincide", book, loan.getBook());
    }

    // Prueba para el método getUser() y setUser()
    @Test
    public void testSetGetUser() {
        loan.setUser(user);
        assertEquals("El usuario no coincide", user, loan.getUser());
    }

    // Prueba para el método getLoanDate() y setLoanDate()
    @Test
    public void testSetGetLoanDate() {
        loan.setLoanDate(loanDate);
        assertEquals("La fecha de préstamo no coincide", loanDate, loan.getLoanDate());
    }

    // Prueba para el método getStatus() y setStatus()
    @Test
    public void testSetGetStatus() {
        loan.setStatus(status);
        assertEquals("El estado del préstamo no coincide", status, loan.getStatus());
    }

    // Prueba para el método getReturnDate() y setReturnDate()
    @Test
    public void testSetGetReturnDate() {
        loan.setReturnDate(returnDate);
        assertEquals("La fecha de retorno no coincide", returnDate, loan.getReturnDate());
    }

    // Prueba para el método getLoanDate() cuando no se ha establecido
    @Test
    public void testGetLoanDateWhenNotSet() {
        assertNull("La fecha de préstamo debería ser null al principio", loan.getLoanDate());
    }

    // Prueba para el método getReturnDate() cuando no se ha establecido
    @Test
    public void testGetReturnDateWhenNotSet() {
        assertNull("La fecha de retorno debería ser null al principio", loan.getReturnDate());
    }

    // Prueba para el método getStatus() cuando no se ha establecido
    @Test
    public void testGetStatusWhenNotSet() {
        assertNull("El estado debería ser null al principio", loan.getStatus());
    }
}
>>>>>>> bc3dead29a5d7d629d60b89d5366c69a1651099c
