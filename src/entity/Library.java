package entity;

import java.util.ArrayList;
import java.util.List;

public class Library {
  private List<Book> books;
  private List<Customer> customers;
  private List<Loan> loans;

  public Library() {
    this.books = new ArrayList<>();
    this.customers = new ArrayList<>();
    this.loans = new ArrayList<>();
  }

  public void addBook(Book book) {
    this.books.add(book);
  }

  public List<Book> getBooksAvailable() {
    List<Book> booksAvailable = new ArrayList<>();
    for(Book book : this.books) {
      if(book.isAvailable()) {
        booksAvailable.add(book);
      }
    }
    return booksAvailable;
  }

  public Book getBookById(String bookId) {
    for(Book book : this.books) {
      if(book.bookId.equals(bookId)) {
        return book;
      }
    }
    return null;
  }

  public void updateBook(Book updatedBook) {
    for(int i = 0; i < this.books.size(); i++) {
      Book book = this.books.get(i);
      if(!book.bookId.equals(updatedBook)) {
        continue;
      }
      this.books.set(i, updatedBook);
    }
  }

  public List<Book> getBooks() {
    return this.books;
  }

  public void addCustomer(Customer customer) {
    this.customers.add(customer);
  }

  public void loanBook(String bookId, String customerId) {
    Loan loan = new Loan(bookId, customerId);
    this.loans.add(loan);
  }
}
