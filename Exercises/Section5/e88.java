import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    ArrayList<Student> list = new ArrayList<Student>();

    while(true) {
      System.out.println("name:");
      String name = reader.nextLine();

      if (name.length() > 0) {
        System.out.println("studentnumber:");
        String studentNumber = reader.nextLine();
        list.add(new Student(name, studentNumber) );
      } else {
        for (Student item : list) {
          System.out.println(item.toString());
        }
        break;
      }
      
    }

    System.out.println("Give search term:");
    String searchTerm = reader.nextLine();
    System.out.println("Result:");

    for (Student item : list) {
      String itemName = item.getName();
      if (itemName.contains(searchTerm)) {
        System.out.println(item.toString());
      }
    }
  }
}
