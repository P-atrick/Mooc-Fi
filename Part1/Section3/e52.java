import java.util.Scanner;

public class ReversingName {
  
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String name = reader.nextLine();

    int i = 0;

    System.out.print("In reverse order: ");
    for (i = name.length() - 1; i >= 0; i--) {
      String result = "";
      result += name.charAt(i);
      System.out.print(result);
    }

  }
}
