package vo;

public class Name {
    private final String firstName;
    private final String lastName;

    public Name(String firstName, String lastName) {
      if (!firstName.matches("^[A-Z][a-z]*$")) {
        throw new IllegalArgumentException("Invalid first name");
      }
      if (!lastName.matches("^[A-Z][a-z]*$")) {
        throw new IllegalArgumentException("Invalid last name");
      }
      this.firstName = firstName;
      this.lastName = lastName;
    }

    public String getFirstName() {
      return this.firstName;
    }

    public String getLastName() {
      return this.lastName;
    }

    public String getName() {
      return String.join(" ", this.firstName, this.lastName);
    }
}
