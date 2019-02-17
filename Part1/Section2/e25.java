import java.util.Scanner;

public class SumOfThreeNumbers {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int sum = 0;
    int read; // store numbers read form user in this variable

    System.out.println("Type the first number:");
    int a = Integer.parseInt(reader.nextLine());
    sum += a;

    System.out.println("Type the second number:");
    int b = Integer.parseInt(reader.nextLine());
    sum += b;

    System.out.println("Type the third number:");
    int c = Integer.parseInt(reader.nextLine());
    sum += c;

    System.out.println("Sum: " + sum);
  }
}
