import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();

    System.out.println("Type a word:");
    String text = reader.nextLine();

    while (true) {
      if (!text.isEmpty()) {
        words.add(text);
        System.out.println("Type a word:");
        text = reader.nextLine();
      } else {
        Collections.sort(words);
        System.out.println("You typed the following words:");
        for(String word : words) {
          System.out.println(word);
        }
        break;
      }
    }
  }
}
