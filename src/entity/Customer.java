package entity;

import vo.Email;
import vo.Name;

import java.time.LocalDate;
import java.util.UUID;

public class Customer {
  public final String customerId;
  private Name name;
  private Email email;
  public final LocalDate birthDate;

  public Customer(String firstName, String lastName, String email, int year, int month, int dayOfMonth) {
    this.customerId = UUID.randomUUID().toString();
    this.name = new Name(firstName, lastName);
    this.email = new Email(email);
    this.birthDate = LocalDate.of(year, month, dayOfMonth);
  }

  public String getFirstName() {
    return this.name.getFirstName();
  }

  public String getLastName() {
    return this.name.getLastName();
  }

  public String getName() {
    return this.name.getName();
  }

  public String getEmail() {
    return this.email.getValue();
  }
}
