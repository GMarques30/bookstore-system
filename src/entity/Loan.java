package entity;

public class Loan {
  public final String bookId;
  public final String customerId;

  public Loan(String bookId, String customerId) {
    this.bookId = bookId;
    this.customerId = customerId;
  }
}
