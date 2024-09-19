package vo;

public class Email {
  private String value;

  public Email(String email) {
    if(!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) throw new IllegalArgumentException("Invalid email");
    this.value = email;
  }

  public String getValue() {
    return this.value;
  }
}
