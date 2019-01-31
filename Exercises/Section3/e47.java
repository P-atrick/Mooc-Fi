import java.util.Scanner;

public class LengthOfName {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String name = reader.nextLine();
    calculateCharacters(name);
  }
  public static int calculateCharacters(String text) {
    int lengthOfName = text.length();
    System.out.println(lengthOfName);
    return lengthOfName;
  }

}
