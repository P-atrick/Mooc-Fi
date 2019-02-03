import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
  private ArrayList<Integer> numbers;
  private Random random = new Random();

  public LotteryNumbers() {
    this.drawNumbers();
  }

  public ArrayList<Integer> numbers() {
    return this.numbers;
  }

  public boolean containsNumber(int number) {
    if (this.numbers.contains(number)) {
      return true;
    }
    return false;
  }

  public void drawNumbers() {
    this.numbers = new ArrayList<Integer>();
    int i = 0;

    for (i = 0; i < 7; i++) {
      int drawnNumber = random.nextInt(39) + 1;
      while(containsNumber(drawnNumber)) {
        drawnNumber = random.nextInt(39) + 1;
      }
      this.numbers.add(drawnNumber);
    }

  }

}
