package assignment1.problem1;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class ContactInfo {
  private final Name name;
  private final Address address;
  private final EmailAddress emailAddress;

  public Boolean matchesName(Name name) {
    return this.name.equals(name);
  }

}
