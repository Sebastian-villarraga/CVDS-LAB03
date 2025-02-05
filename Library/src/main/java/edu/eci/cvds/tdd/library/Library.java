package edu.eci.cvds.tdd.library;

import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.loan.Loan;
import edu.eci.cvds.tdd.library.loan.LoanStatus;
import edu.eci.cvds.tdd.library.user.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.LocalDateTime;

/**
 * Library responsible for manage the loans and the users.
 */
public class Library {

    private final List<User> users;
    private final Map<Book, Integer> books;
    private final List<Loan> loans;
    private Book selectedBook;
    private Loan newLoan;
    private User borrower;

    public Library() {
        users = new ArrayList<>();
        books = new HashMap<>();
        loans = new ArrayList<>();
    }

    /**
     * Adds a new {@link edu.eci.cvds.tdd.library.book.Book} into the system, the book is store in a Map that contains
     * the {@link edu.eci.cvds.tdd.library.book.Book} and the amount of books available, if the book already exist the
     * amount should increase by 1 and if the book is new the amount should be 1, this method returns true if the
     * operation is successful false otherwise.
     *
     * @param book The book to store in the map.
     *
     * @return true if the book was stored false otherwise.
     */
    public boolean addBook(Book book) {
        //TODO Implement the logic to add a new book into the map.
        if (books.containsKey(book)) {
            int amount = books.get(book);
            books.put(book, amount + 1);
            return true;
        } else {
            books.put(book, 1);
        }
        return false;
    }

    /**
     * This method creates a new loan with for the User identify by the userId and the book identify by the isbn,
     * the loan should be store in the list of loans, to successfully create a loan is required to validate that the
     * book is available, that the user exist and the same user could not have a loan for the same book
     * {@link edu.eci.cvds.tdd.library.loan.LoanStatus#ACTIVE}, once these requirements are meet the amount of books is
     * decreased and the loan should be created with {@link edu.eci.cvds.tdd.library.loan.LoanStatus#ACTIVE} status and
     * the loan date should be the current date.
     *
     * @param userId id of the user.
     * @param isbn book identification.
     *
     * @return The new created loan.
     */
    public Loan loanABook(String userId, String isbn) {
        //TODO Implement the login of loan a book to a user based on the UserId and the isbn.
        borrower = userByUserId(userId);
        selectedBook = bookByIsbn(isbn);
        if (borrower == null || selectedBook == null) {
            return null; // the user or book not exist
        }
        for (Loan loan : loans) {
            if (loan.getUser().equals(borrower) && loan.getBook().equals(selectedBook) && loan.getStatus() == LoanStatus.ACTIVE) {
                return null; // The user have an active loan for the same book
            }
        }
        int amount = books.get(selectedBook);
        if (amount <= 0) {
            return null;
        }
        books.put(selectedBook, amount - 1);
        newLoan = new Loan();
        newLoan.setBook(selectedBook);
        newLoan.setStatus(LoanStatus.ACTIVE);
        newLoan.setLoanDate(LocalDateTime.now());
        loans.add(newLoan);
        return newLoan; // Returns the new loan
    }

    /**
     * This method return a loan, meaning that the amount of books should be increased by 1, the status of the Loan
     * in the loan list should be {@link edu.eci.cvds.tdd.library.loan.LoanStatus#RETURNED} and the loan return
     * date should be the current date, validate that the loan exist.
     *
     * @param ActualLoan loan to return.
     *
     * @return the loan with the RETURNED status.
     */
    public Loan returnLoan(Loan ActualLoan) {
        //TODO Implement the login of loan a book to a user based on the UserId and the isbn.
        for (Loan loan : loans) {
            if (loan == ActualLoan) {
                selectedBook = loan.getBook();
                addBook(selectedBook);
                ActualLoan.setStatus(LoanStatus.RETURNED);
                ActualLoan.setReturnDate(LocalDateTime.now());
                return ActualLoan;
            }
        }
        return null;
    }

    public  Map<Book, Integer> getBooks() {
        return books;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    private User userByUserId(String userId) {
        for (User u : users) {
            if (u.getId().equals(userId)) {
                return u;
            }
        }
        return null;
    }

    private Book bookByIsbn(String isbn) {
        for (Book b : books.keySet()) {
            if (b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }
}