import java.util.Scanner;

public class Palindromi {

  public static String reverse(String text) {
    String textReversed = "";

    for (int i = text.length() - 1; i >= 0; i--) {
      textReversed += text.charAt(i);
    }

    return textReversed;
  }

  public static boolean palindrome(String text) {
    String textReversed = reverse(text);
    if (text.equals(textReversed)) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Type a text: ");
    String text = reader.nextLine();
    if (palindrome(text)) {
      System.out.println("The text is a palindrome!");
    } else {
      System.out.println("The text is not a palindrome!");
    }
  }
}
