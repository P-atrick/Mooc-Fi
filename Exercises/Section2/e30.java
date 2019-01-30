import java.util.Scanner;

public class UpToCertainNumber {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int a = 1;
    System.out.println("Enter a number");
    int max = Integer.parseInt(reader.nextLine());

    while(a <= max) {
      System.out.println(a);
      a++;
    }

  }
}
