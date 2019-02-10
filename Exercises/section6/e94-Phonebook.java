import java.util.ArrayList;

public class Phonebook {
  private ArrayList<Person> phonebook = new ArrayList<Person>();

  public void add(String name, String phoneNumber) {
    phonebook.add(new Person(name, phoneNumber));
  }

  public void printAll() {
    for(Person item : phonebook) {
      System.out.println(item.toString());
    }
  }

  public String searchNumber(String name) {
    for (Person item : phonebook) {
      if (item.getName().equals(name)) {
        return item.getNumber();
      }
    }
    return "Number not known";
  }
}
