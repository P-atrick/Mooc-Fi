import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner lukija = new Scanner(System.in);
    Score scores = new Score();

    while (true) {
      System.out.println("Enter number");
      int number = Integer.parseInt(lukija.nextLine());

      if (number > 0 && number <= 60) {
        scores.addScore(number);
      } else if (number == -1) {
        System.out.println(scores.getScores());
        break;
      }
    }

    scores.assignGrades();
    scores.printGrades();
    System.out.println("Acceptance percentage: " + scores.acceptancePercentage());
  }
}
