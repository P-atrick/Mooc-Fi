import java.util.Scanner;

public class TheEndPart {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String word = reader.nextLine();

    System.out.println("Length of the first part:");
    int length = Integer.parseInt(reader.nextLine());

    String result = word.substring(word.length() - length);
    System.out.println("Result: " + result);
  }
}
