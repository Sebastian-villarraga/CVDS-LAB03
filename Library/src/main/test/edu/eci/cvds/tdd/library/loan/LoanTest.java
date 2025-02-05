package edu.eci.cvds.tdd.library.loan;

import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.user.User;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class LoanTest {

    private Loan loan;
    private Book book;
    private User user;
    private LocalDateTime loanDate;
    private LocalDateTime returnDate;
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
