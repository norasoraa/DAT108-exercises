package week34.task4;

/**
 * Class that prints a string if a certain condition is met.
 */
public class ConditionalPrint {
  
  public static void main(String[] args) {
    String s = "Hei!";
    ConditionalPrint.conditionalPrint(s, c -> s.length() > 3);
    ConditionalPrint.conditionalPrint(s, c -> s.startsWith("X"));
  }
  
  private static void conditionalPrint(String s, Condition<String> c) {
    if (c.condition(s)) {
      System.out.println(s);
    }
  }
}
