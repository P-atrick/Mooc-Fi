import java.util.ArrayList;

public class Changer {
  private ArrayList<Change> changeList;


  public Changer() {
    this.changeList = new ArrayList<Change>();
  }

  public void addChange(Change change) {
    changeList.add(change);
  }

  public String change(String characterString) {
    for (Change item : changeList) {
      characterString = item.change(characterString);
    }
    return characterString;
  }
}
