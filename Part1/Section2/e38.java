import java.util.Scanner;

public class ManyPrints {
  public static void printText() {
    System.out.println("In the beginning there were the swamp, the hoe and Java.");
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int count = 1;

    System.out.println("How many?");
    int n = Integer.parseInt(reader.nextLine());

    while(count <= n) {
      printText();
      count++;
    }
  }
}
