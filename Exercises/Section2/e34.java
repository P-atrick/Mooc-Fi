import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int count = 1;
    int sum = 1;
    
    System.out.println("Type a number:");
    int n = Integer.parseInt(reader.nextLine());

    while (count <= n) {
      sum *= count;
      count++;
    }
    System.out.println("The sum is " + sum);
  }
}
