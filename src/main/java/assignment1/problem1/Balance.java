package assignment1.problem1;

import lombok.NonNull;

public final class Balance extends AbstractBalance {

  public Balance(@NonNull Integer dollars, @NonNull Integer cents) {
    super(dollars, cents);
  }
}
