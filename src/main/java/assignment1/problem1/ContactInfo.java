package assignment1.problem1;

import com.google.common.base.Objects;

public class CardOwner {
  private final Name name;
  private final Address address;
  private final EmailAddress emailAddress;

  public CardOwner(Name name, Address address, EmailAddress emailAddress) {
    this.name = name;
    this.address = address;
    this.emailAddress = emailAddress;
  }

  public Boolean matchesName(Name name) {
    return this.name.equals(name);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardOwner cardOwner = (CardOwner) o;
    return Objects.equal(name, cardOwner.name) &&
        Objects.equal(address, cardOwner.address) &&
        Objects.equal(emailAddress, cardOwner.emailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name, address, emailAddress);
  }
}
