package entity;

import vo.Name;

import java.time.LocalDate;
import java.util.UUID;

public class Author {
  public final String authorId;
  private Name name;
  public final LocalDate birthDate;

  public Author(String firstName, String lastName, int year, int month, int dayOfMonth) {
    this.authorId = UUID.randomUUID().toString();
    this.name = new Name(firstName, lastName);
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
}
