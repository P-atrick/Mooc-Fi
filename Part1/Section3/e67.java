import java.util.ArrayList;

public class Variance {
  public static int sum(ArrayList<Integer> list) {
    int result = 0;
    for (int number : list) {
      result += number;
    }
    return result;
  }

  public static double average(ArrayList<Integer> list) {
    double result = sum(list);
    return result / list.size();
  }

  public static double variance(ArrayList<Integer> list) {
    double average = average(list);
    double squareResult = 0;
    for (int item : list) {
      squareResult += Math.pow(item - average, 2);
    }
    double variance = squareResult / (list.size() - 1);
    return variance;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);

    System.out.println("The variance is: " + variance(list));
  }

}
