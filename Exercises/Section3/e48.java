import java.util.Scanner;

public class FirstCharacter {
  
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String name = reader.nextLine();
    firstCharacter(name);
  }

  public static char firstCharacter(String text) {
    char first = text.charAt(0);
    System.out.println(first);
    return first;
  }
}
