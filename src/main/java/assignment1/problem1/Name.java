package assignment1.problem1;

import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode
public final class Name {
  @NonNull private final String firstName;
  @NonNull private final String lastName;
}
