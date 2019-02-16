public class Bird {
  private String name;
  private String latinName;
  private int observations = 0;

  public Bird(String name, String latinName) {
    this.name = name;
    this.latinName = latinName;
  }

  public String getName() {
    return name;
  }

  public String getLatinName() {
    return latinName;
  }

  public String toString() {
    return name + "(" + latinName + ")" + ": " + observations +  " observations";
  }

  public void addObservation() {
    observations++;
  }
}
