package week34.task6;

public class Main {

  public static void main(String[] args) {

    String original = "Java";

    // Only upper case letters
    StringFunction upperCaseLetters = x -> original.toUpperCase();
    printFormatted(original, upperCaseLetters);

    // Framed word
    StringFunction framedWord = x -> "[" + original + "]";
    printFormatted(original, framedWord);

    // Space between letters
    /* StringFunction spaceBetweenLetters = x -> ;
    printFormatted(original, spaceBetweenLetters); */

  }

  /**
   * The method modifies the incoming string using the {@link StringFunction}
   * format, and then prints the result to the screen.
   * 
   * @param original The string to be formatted
   * @param format   The string function to be used, as a {@link StringFunction}
   */
  private static void printFormatted(String original, StringFunction format) {
    String formattedString = format.modify(original);
    System.out.println(formattedString);
  }
}
