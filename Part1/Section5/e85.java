public class Reformatory {
  private int totalWeightsMeasured;

  public int weight(Person person) {
    totalWeightsMeasured++;
    return person.getWeight();
  }

  public void feed(Person person) {
    int weightToSet = weight(person) + 1;
    person.setWeight(weightToSet);
  }

  public int totalWeightsMeasured() {
    return totalWeightsMeasured;
  }
}
