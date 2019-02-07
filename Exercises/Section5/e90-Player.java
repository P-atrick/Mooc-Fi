public class Player {
  private String name;
  private int numberOfGoals;

  public Player(String name) {
    this.name = name;
    this.numberOfGoals = 0;
  }

  public Player(String name, int numberOfGoals) {
    this.name = name;
    this.numberOfGoals = numberOfGoals;
  }

  public String getName() {
    return name;
  }

  public int goals() {
    return numberOfGoals;
  }

  public String toString() {
    return name + ", goals " + numberOfGoals;
  }

}
