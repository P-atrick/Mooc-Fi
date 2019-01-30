import java.util.Scanner;

public class SumOfThePowers {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int count = 0;
    int result = 0;

    System.out.println("Type a number:");
    int n = Integer.parseInt(reader.nextLine());

    while (count <= n) {
      result += Math.pow(2, count);
      count++;
    }
    System.out.println("The result is " + result);

  }
}
