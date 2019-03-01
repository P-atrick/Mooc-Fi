import java.util.ArrayList;

public class Container {
  private ArrayList<Suitcase> suitcases;
  private int maxWeight;

  public Container(int maxWeight) {
    this.suitcases = new ArrayList<Suitcase>();
    this.maxWeight = maxWeight;
  }

  public int totalWeight() {
    int currentWeight = 0;
    for (Suitcase item : suitcases) {
      currentWeight += item.totalWeight();
    }
    return currentWeight;
  }

  public void addSuitcase(Suitcase suitcase) {
    if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
      suitcases.add(suitcase);
    }

  }

  public String toString() {
    return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
  }

  public void printThings() {
    for (Suitcase item : suitcases) {
      item.printThings();
    }
  }

}
