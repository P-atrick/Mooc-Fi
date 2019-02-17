public class Counter {
  private int value;
  private boolean check;

  public Counter() {
    this(0, false);
  }

  public Counter(int startingValue) {
    this(startingValue, true);
  }

  public Counter(boolean check) {
    this(0, true);
  }

  public Counter(int startingValue, boolean check) {
    this.value = startingValue;
    this.check = check;
  }

  public int value() {
    return this.value;
  }

  public void increase() {
    this.increase(1);
  }

  public void increase(int increaseAmount) {
    if (increaseAmount >= 0) {
      this.value += increaseAmount;
    }
  }

  public void decrease() {
    this.decrease(1);
  }

  public void decrease(int decreaseAmount) {
    if (decreaseAmount >= 0) {
      this.value -= decreaseAmount;
      if (this.value < 0 && check) {
        this.value = 0;
      }
    }
  }
}
