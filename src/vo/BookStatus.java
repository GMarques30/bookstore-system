package vo;

import entity.Book;

public abstract class BookStatus {
  public Boolean value;
  public final Book book;

  public BookStatus(Book book) {
    this.book = book;
  }

  public abstract void available();
  public abstract void unavailable();
}


