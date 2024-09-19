package vo;

import entity.Book;

public class BookStatusFactory {
  public static BookStatus create(Book book, Boolean status) {
    if(!status) return new UnavailableStatus(book);
    if(status) return new AvailableStatus(book);
    throw new RuntimeException("Invalid status");
  }
}
