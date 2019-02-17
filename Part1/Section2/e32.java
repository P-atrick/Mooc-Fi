import java.util.Scanner;

public class TheSumOfSetOfNumbers {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int count = 1;
    int sum = 0;

    System.out.println("Until what?");
    int n = Integer.parseInt(reader.nextLine());

    while (count <= n) {
      sum += count;
      count++;
    }
    System.out.println("The sum is " + sum);
  }
}
