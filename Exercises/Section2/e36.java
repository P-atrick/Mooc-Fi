import java.util.Scanner;

public class LoopsEndingRemembering {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    double average = 0;
    int evenCount = 0;
    int oddCount = 0;

    while (true) {

      System.out.println("Type numbers");
      int number = Integer.parseInt(reader.nextLine());

      if(number != -1) {
        System.out.println(number);
        sum += number;
        count++;
        if (number % 2 == 0) {
          evenCount++;
        } else {
          oddCount++;
        }
      } else {
        average = (double)sum / count;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        break;
      }
    }

  }
}
