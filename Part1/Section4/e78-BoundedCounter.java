public class BoundedCounter {
  private int value;
  private int upperLimit;

  public BoundedCounter(int upperLimit) {
    this.upperLimit = upperLimit;
    this.value = 0;
  }

  public void next() {
    this.value++;
    if (this.value > this.upperLimit) {
      this.value = 0;
    }
  }

  public int getValue() {
    return this.value;
  }

  public void setValue(int value) {
    if (0 < value && value <= this.upperLimit) {
      this.value = value;
    }
  }

  public String toString() {
    if (this.value < 10) {
      return "0" + this.value;
    }
    return "" + this.value;
  }
}
