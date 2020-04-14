package assignment1.problem1;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class TransitCard {
  private final ContactInfo contactInfo;
  private final Balance balance;

  public TransitCard depositMoney(Balance deposit) throws IllegalArgumentException{
    validateDeposit(deposit);
    return new TransitCard(contactInfo, balance.add(deposit));
  }

  private void validateDeposit(Balance deposit) {
    if (deposit.isCardOwner(contactInfo)) {
      throw new IllegalArgumentException("Name on deposit does not match card owner name.");
    }

    if (deposit.outOfRange()) {
      throw new IllegalArgumentException("Deposit amount is not within the required range.");
    }
  }

}
