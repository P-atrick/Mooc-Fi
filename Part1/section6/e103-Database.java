import java.util.ArrayList;

public class Database {
  private ArrayList<Bird> birdList;

  public Database() {
    birdList = new ArrayList<Bird>();
  }

  public void addBird(String name, String latinName) {
    birdList.add(new Bird(name, latinName));
  }

  public void getBird(String name) {
    for (Bird item : birdList) {
      if (name.equals(item.getName())) {
        System.out.println(item.toString());
      }
    }
  }

  public void getAllBirds() {
    for (Bird item : birdList) {
      System.out.println(item.toString());
    }
  }

  public void observe(String name) {
    for (Bird item : birdList) {
      if (name.equals(item.getName())) {
        item.addObservation();
      } else {
        System.out.println("Is not a bird!");
      }
    }
  }
}
