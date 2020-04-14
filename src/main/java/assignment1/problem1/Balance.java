package assignment1.problem1;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class Balance {
  private final Integer dollars;
  private final Integer cents;
  private final Name name;

  public Balance add(Balance balance) {
    return new Balance(this.dollars + balance.dollars, this.cents + balance.cents, this.name);
  }

  public Boolean isCardOwner(ContactInfo contactInfo) {
    return !contactInfo.matchesName(name);
  }

  public boolean outOfRange() {
    return (dollars < 5) || (dollars >= 50 && cents > 0);
  }

}
