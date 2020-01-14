package assignment1.problem1;

import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode
public final class EmailAddress {
  @NonNull private final String emailAddress;
}
