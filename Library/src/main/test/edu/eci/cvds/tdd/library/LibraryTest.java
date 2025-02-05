package edu.eci.cvds.tdd.library;

import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.loan.Loan;
import edu.eci.cvds.tdd.library.loan.LoanStatus;
import edu.eci.cvds.tdd.library.user.User;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.List;
import java.time.LocalDateTime;


import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;
    private Map<Book, Integer> books;
    private List<Loan> loans;
    private List<User> users;

    @BeforeEach
    void setUp() {
        library = new Library();
        books = library.getBooks();
        Book book1 = new Book("Java Programming", "John Doe", "12345");
        Book book2 = new Book("Clean code", "Robert C. Martin", "54321");
        books.put(book1, 1);
        books.put(book2, 1);
        users = library.getUsers();
        User user1 = new User();
        User user2 = new User();
        user1.setId("001");
        user1.setName("Andrés");
        user2.setId("002");
        user2.setName("Sebastian");
        users.add(user1);
        users.add(user2);
        loans = library.getLoans();
        Loan loan1 = new Loan();
        loan1.setBook(book1);
        loan1.setUser(user1);
        loan1.setStatus(LoanStatus.ACTIVE);
        loan1.setLoanDate(LocalDateTime.now());
        loans.add(loan1);
    }

    @Test
    public void testAddBookMethodIfTheBookExists() {
        Book book3 = new Book("Java Programming", "John Doe", "12345");
        library.addBook(book3);
        assertEquals(2, books.get(book3));
    }

    @Test
    public void testAddBookMethodIfTheBookDoesNotExist() {
        Book book4 = new Book("Python Fluente", "Luciano Ramalho", "65987");
        library.addBook(book4);
        assertEquals(1, books.get(book4));
    }

    @Test
    public void testLoanABookMethodIfTheUserDoesntExists() {
        assertNull(library.loanABook("003", "12345"));
    }

    @Test
    public void testLoanABookMethodIfTheBookIsNotAvailable() {
        assertNull(library.loanABook("002", "8"));
    }

    @Test
    public void testLoanABookMethodIfTheUserHasAnActiveLoanForTheSameBook() {
        library.loanABook("001", "12345");
        assertNull(library.loanABook("001", "12345"));
    }

    @Test
    public void testLoanABookMethodIfTheRequirementsAreCorrect() {
        assertNotNull(library.loanABook("002", "12345"));
    }

    @Test
    public void testReturnLoanMethodIfTheLoanNotExists() {
        assertNull(library.returnLoan(null));
    }

    @Test
    public void testReturnLoanMethodIfTheLoanExists() {
        Loan loan1 = library.loanABook("002", "12345");
        assertNotNull(library.returnLoan(loan1));
    }
}
