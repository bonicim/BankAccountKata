package assignment1.problem1;

import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode
public final class CardOwner {
  @NonNull private final Name name;
  @NonNull private final Address address;
  @NonNull private final EmailAddress emailAddress;

  public Boolean matchesName(Name name) {
    return this.name.equals(name);
  }

}
