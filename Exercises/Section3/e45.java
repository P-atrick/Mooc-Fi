public class Greatest {

  public static int greatest(int number1, int number2, int number3) {
    int result;

    if (number1 != number2 || number1 != number3 || number2 != number3) {
      result = Math.max(number1, Math.max(number2, number3));
    } else {
      result = number1;
    }

    return result;
  }

  public static void main(String[] args) {
    int result = greatest(2, 7, 3);
    System.out.println("Greatest: " + result);
  }
}
