import java.util.Scanner;

public class GradesAndPoints {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Type the points [0-60]:");
    int a = Integer.parseInt(reader.nextLine());

    String result = "";

    if (a < 30) {
      result = "failed";
    } else if (a < 35) {
      result = "1";
    } else if (a < 40) {
      result = "2";
    } else if (a < 45) {
      result = "3";
    } else if (a < 50) {
      result = "4";
    } else if (a < 60) {
      result = "5";
    }

    System.out.println("Grade: " + result);
  }
}
