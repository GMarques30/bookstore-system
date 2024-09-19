package vo;

import entity.Book;

public class AvailableStatus extends BookStatus {
  public AvailableStatus(Book book) {
    super(book);
    this.value = true;
  }

  @Override
  public void available() {
    throw new RuntimeException("Invalid status");
  }

  @Override
  public void unavailable() {
    this.book.available = new UnavailableStatus(this.book);
  }
}
