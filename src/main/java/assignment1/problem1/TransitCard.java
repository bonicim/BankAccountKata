package assignment1.problem1;

import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode
public final class TransitCard {
  @NonNull private final CardOwner cardOwner;
  @NonNull private final InterfaceBalance balance;

  public TransitCard depositMoney(Deposit deposit) throws IllegalArgumentException{
    if (deposit.notMatchCardOwnerName(cardOwner)) {
      throw new IllegalArgumentException("Name on deposit does not match card owner name.");
    }

    if (deposit.outOfRange()) {
      throw new IllegalArgumentException("Deposit amount is not within the required range.");
    }

    return new TransitCard(cardOwner, balance.add(deposit));
  }
}
