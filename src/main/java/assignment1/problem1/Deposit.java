package assignment1.problem1;

import lombok.NonNull;

public final class Deposit extends AbstractBalance {
  @NonNull private final Name name;

  public Deposit(@NonNull Integer dollars, @NonNull Integer cents,
      @NonNull Name name) {
    super(dollars, cents);
    this.name = name;
  }

  public Boolean notMatchCardOwnerName(CardOwner cardOwner) {
    return !cardOwner.matchesName(name);
  }

  public boolean outOfRange() {
    return (dollars < 5) || (dollars >= 50 && cents > 0);
  }

}
