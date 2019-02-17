public class PrintingLikeBoss {

  public static void printStars(int amount) {
    int count = 0;
    while (count < amount) {
      System.out.print("*");
      count++;
      if (count == amount) {
        System.out.printf("%n");
      }
    }
  }

  public static void printWhitespaces(int amount) {
    int count = 0;
    while (count < amount) {
      System.out.print(" ");
      count++;
    }
  }

  public static void printTriangle(int size) {
    int count = 1;
    int whitespaceCount = size - 1;
    while (count <= size) {
      printWhitespaces(whitespaceCount);
      printStars(count);
      count++;
      whitespaceCount--;
    }
  }

  public static void xmasTree(int height) {
    int count = 0;
    int whitespaceCount = height - 1;
    int starsCount = 1;

    while (count < height) {
      printWhitespaces(whitespaceCount);
      printStars(starsCount);
      count++;
      starsCount += 2;
      whitespaceCount--;
    }
    printWhitespaces(height - 2);
    printStars(3);
    printWhitespaces(height - 2);
    printStars(3);
  }

  public static void main(String[] args) {

    printTriangle(4);
    System.out.println("---");
    xmasTree(4);
  }
}
