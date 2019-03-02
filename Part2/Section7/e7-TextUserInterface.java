import java.util.Scanner;

public class TextUserInterface {
  private Scanner reader;
  private Dictionary dictionary;

  public TextUserInterface(Scanner reader, Dictionary dictionary) {
    this.reader = reader;
    this.dictionary = dictionary;
  }

  public void add(String word, String translation) {
    dictionary.add(word, translation);
  }

  public void translate(String word) {
    System.out.println(dictionary.translate(word));
  }

  public void start() {
    while (true) {
      System.out.println("Statement:");
      String command = reader.nextLine();

      if (command.equals("quit")) {
        System.out.println("Cheers!");
        break;
      } else if (command.equals("add")) {
        System.out.println("In Finnish");
        String word = reader.nextLine();

        System.out.println("translation");
        String translation = reader.nextLine();
        add(word, translation);
      } else if (command.equals("translate")) {
        System.out.println("Give a word");
        String word = reader.nextLine();

        translate(word);
      } else {
        System.out.println("Unknown statement");
      }
    }

  }

}
