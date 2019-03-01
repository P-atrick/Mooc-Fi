import java.util.ArrayList;

public class Suitcase {
  private ArrayList<Thing> things;
  private int maxWeight;

  public Suitcase(int maxWeight) {
    this.things = new ArrayList<Thing>();
    this.maxWeight = maxWeight;
  }

  public void addThing(Thing thing) {
    if (this.totalWeight() + thing.getWeight() <= maxWeight) {
      things.add(thing);
    }
  }

  public String toString() {
    if (things.isEmpty()) {
      return "empty (0 kg)";
    } else if (things.size() == 1) {
      return "1 thing (" + this.totalWeight() + " kg)";
    }
    return things.size() + " things (" + this.totalWeight() + " kg)";
  }

  public int totalWeight() {
    int totalWeight = 0;
    for (Thing item : things) {
      totalWeight += item.getWeight();
    }
    return totalWeight;
  }

  public void printThings() {
    for (Thing item : things) {
      System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
    }
    System.out.println("Total weight: " + this.totalWeight() + " kg");
  }

  public Thing heaviestThing() {
    if (things.isEmpty()) {
      return null;
    }

    Thing heaviestThing = things.get(0);

    for (Thing item : things) {
      if (item.getWeight() > heaviestThing.getWeight()) {
        heaviestThing = item;
      }
    }
    return heaviestThing;
  }

}
