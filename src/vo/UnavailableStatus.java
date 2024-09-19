package vo;

import entity.Book;

public class UnavailableStatus extends BookStatus {
  public UnavailableStatus(Book book) {
    super(book);
    this.value = false;
  }

  @Override
  public void available() {
    this.book.available = new AvailableStatus(this.book);
  }

  @Override
  public void unavailable() {
    throw new RuntimeException("Invalid status");
  }
}
