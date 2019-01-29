import java.util.Scanner;

public class EvenOrOdd {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Type a number:");
    int a = Integer.parseInt(reader.nextLine());

    String result;

    if (a % 2 == 0) {
      result = "even";
    } else {
      result = "odd";
    }

    System.out.println("Number " + a + " is " + result);
  }
}
