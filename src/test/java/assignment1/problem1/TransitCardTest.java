package assignment1.problem1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TransitCardTest {
  private TransitCard transitCard;

  @Before
  public void setUp() throws Exception {
    transitCard = new TransitCard(
                    new ContactInfo(
                        new Name("Homer", "Simpson"),
                        new Address("1234", "Seattle", "WA", "98155"),
                        new EmailAddress("homer@simpsons.com")),
                    new Balance(4, 20, new Name("Homer", "Simpson")));
  }

  @Test
  public void depositMoneyWithCorrectNameShouldIncreaseBalance() {
    TransitCard expected = new TransitCard(
                            new ContactInfo(
                              new Name("Homer", "Simpson"),
                              new Address("1234", "Seattle", "WA", "98155"),
                              new EmailAddress("homer@simpsons.com")),
                            new Balance(9, 20, new Name("Homer", "Simpson")));


    TransitCard actual = transitCard.depositMoney(new Balance(5,0, new Name("Homer", "Simpson")));

    assertEquals(expected, actual);
  }

  @Test(expected = IllegalArgumentException.class)
  public void depositMoneyWithDifferentNameFromCardOwner() {
    transitCard.depositMoney(new Balance(25,20,new Name("Barry", "Sanders")));
  }

  @Test(expected = IllegalArgumentException.class)
  public void depositMoneyNotWithinRange() {
    transitCard.depositMoney(new Balance(1,20, new Name("Homer", "Simpson")));
  }
}