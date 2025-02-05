package edu.eci.cvds.tdd.library.loan;

import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.user.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class LoanTest {
    private Loan loan;
    private Book book;
    private User user;
    private LocalDateTime loanDate;
    private LocalDateTime returnDate;


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