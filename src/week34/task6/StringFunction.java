package week34.task6;

/**
 * Functional interface that represents a function used to modify a given
 * string.
 */
@FunctionalInterface
public interface StringFunction {
  String modify(String original);
}
