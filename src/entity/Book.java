package entity;

import vo.BookStatus;
import vo.BookStatusFactory;

import java.time.LocalDateTime;
import java.util.UUID;

public class Book {
  public final String bookId;
  public String title;
  public Author author;
  public BookStatus available;
  public final LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public Book(String title, String firstName, String lastName, Boolean status, int year, int month, int dayOfMonth) {
    this.bookId = UUID.randomUUID().toString();
    this.title = title;
    this.author = new Author(firstName, lastName, year, month, dayOfMonth);
    this.available = BookStatusFactory.create(this, status);
    this.createdAt = LocalDateTime.now();
    this.updatedAt = LocalDateTime.now();
  }

  public Boolean isAvailable() {
    return this.available.value;
  }

  public void available() {
    this.available.available();
    this.updated();
  }

  public void unavailable() {
    this.available.unavailable();
    this.updated();
  }

  public LocalDateTime getUpdatedAt() {
    return this.updatedAt;
  }

  public void updated() {
    this.updatedAt = LocalDateTime.now();
  }
}
