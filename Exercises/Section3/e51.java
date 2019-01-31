import java.util.Scanner;

public class SeparatingCharacters {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String name = reader.nextLine();
    
    int i = 0;
    int character = 1;

    for (i = 0; i < name.length(); i++) {
      System.out.println(character + ". character: " + name.charAt(i));
      character++;
    }
  }
}
