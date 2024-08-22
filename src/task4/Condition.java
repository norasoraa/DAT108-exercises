package task4;

/**
 * Functional Interface that represents a condition.
 * <p>
 * It contains a method {@link #condition(T)} that returns a boolean value depending on wether the
 * condition is met.
 */
@FunctionalInterface
public interface Condition <T> {
  boolean condition(T s);
}
