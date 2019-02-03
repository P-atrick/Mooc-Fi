public class NumberStatistics {
  private int amountOfNumbers = 0;
  private int sum = 0;

  public NumberStatistics() {
    this.amountOfNumbers = amountOfNumbers;
  }

  public void addNumber(int number) {
    this.amountOfNumbers++;
    this.sum += number;
  }

  public int amountOfNumbers() {
    if (this.amountOfNumbers > 0) {
      return this.amountOfNumbers;
    }
    return 0;
  }

  public int sum() {
    return this.sum;
  }

  public double average() {
    if (amountOfNumbers > 0) {
      return this.sum / (double)(this.amountOfNumbers);
    }
    return 0;
  }
}
