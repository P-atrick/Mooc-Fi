import java.util.Scanner;

public class FirstCharacters {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String name = reader.nextLine();

    if (name.length() >= 3) {
      int i = 0;
      int character = 1;

      while(i < 3) {
        System.out.println(character + ". character: " + name.charAt(i));
        i++;
        character++;
      }
    }
  }
}
