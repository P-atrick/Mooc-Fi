import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    NumberStatistics stats = new NumberStatistics();
    NumberStatistics even = new NumberStatistics();
    NumberStatistics odd = new NumberStatistics();

    while (true) {
      System.out.println("Type numbers");
      int number = Integer.parseInt(reader.nextLine());

      if (number != -1) {
        stats.addNumber(number);
        if (number % 2 == 0) {
          even.addNumber(number);
        } else {
          odd.addNumber(number);
        }
      } else {
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even: " + even.sum());
        System.out.println("Sum of odd: " + odd.sum());
        break;
      }
    }

  }
}
