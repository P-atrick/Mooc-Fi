import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    Database database = new Database();

    while (true) {
      System.out.print("? ");
      String command = reader.nextLine();

      if (command.equals("Add")) {
        System.out.print("Name: ");
        String name = reader.nextLine();
        System.out.print("Latin Name: ");
        String latinName = reader.nextLine();
        database.addBird(name, latinName);
      } else if (command.equals("Show")) {
        System.out.print("What? ");
        String name = reader.nextLine();
        database.getBird(name);
      } else if (command.equals("Statistics")) {
        database.getAllBirds();
      } else if (command.equals("Observation")) {
        System.out.print("What was observed? ");
        String name = reader.nextLine();
        database.observe(name);
      } else if (command.equals("Quit")) {
        break;
      }
    }

  }

}
