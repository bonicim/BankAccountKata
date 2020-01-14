package assignment1.problem1;

import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode
public final class Address {
  @NonNull private final String street;
  @NonNull private final String city;
  @NonNull private final String state;
  @NonNull private final String zip;
}
