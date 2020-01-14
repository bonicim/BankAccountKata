package assignment1.problem1;

import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode
public abstract class AbstractBalance implements InterfaceBalance{

  @NonNull protected final Integer dollars;
  @NonNull protected final Integer cents;

  @Override
  public InterfaceBalance add(AbstractBalance balance) {
    return new Balance(this.dollars + balance.dollars, this.cents + balance.cents);
  }

}
