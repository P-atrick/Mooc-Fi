import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();

    while (true) {
      System.out.println("Type a word:");
      String enteredWord = reader.nextLine();

      if (!words.contains(enteredWord)) {
        words.add(enteredWord);
      } else {
        System.out.println("You typed the word " + enteredWord + " twice");
        break;
      }
    }

  }
}
