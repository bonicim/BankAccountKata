package assignment1.problem1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TransitCardTest {
  private TransitCard transitCard;
  private CardOwner cardOwner;
  private Balance balance;
  private Name name;

  @Before
  public void setUp() throws Exception {
    name = new Name("Homer", "Simpson");
    cardOwner = new CardOwner(name,
                              new Address("1234", "Seattle", "WA", "98155"),
                              new EmailAddress("homer@simpsons.com"));
    balance = new Balance(4, 20);
    transitCard = new TransitCard(cardOwner, balance);
  }

  @Test
  public void depositMoneyWithCorrectNameShouldIncreaseBalance() {
    TransitCard expected = new TransitCard(cardOwner, new Balance(9, 20));

    TransitCard actual = transitCard.depositMoney(new Deposit(5,0, name));

    assertEquals(expected, actual);
  }

  @Test(expected = IllegalArgumentException.class)
  public void depositMoneyWithDifferentNameFromCardOwner() {
    transitCard.depositMoney(new Deposit(25,20,new Name("Barry", "Sanders")));
  }

  @Test(expected = IllegalArgumentException.class)
  public void depositMoneyNotWithinRange() {
    transitCard.depositMoney(new Deposit(1,20, name));
  }
}