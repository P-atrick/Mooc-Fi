import java.util.Scanner;

public class LastCharacter {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String name = reader.nextLine();
    lastCharacter(name);
  }

  public static char lastCharacter(String text) {
    char last = text.charAt(text.length() - 1);
    System.out.println(last);
    return last;
  }
}
