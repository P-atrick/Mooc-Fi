public class Smileys {

  public static void main(String[] args) {
  }

  private static void printWithSmileys(String characterString) {
    printSmileys(characterString.length());
    printMiddleRow(characterString);
    printSmileys(characterString.length());
  }

  private static void printSmileys(int numberOfTimes) {
    System.out.print(":)");
    if (numberOfTimes % 2 == 1) {
      for (int i = 0; i < ((numberOfTimes + 2) / 2) + 1; i++) {
        System.out.print(":)");
      }
    } else {
      for (int i = 0; i < ((numberOfTimes + 2) / 2); i++) {
        System.out.print(":)");
      }
    }
    System.out.print(":)");
    System.out.println("");
  }

  private static void printMiddleRow(String characterString) {
    if (characterString.length() % 2 == 1) {
      System.out.println(":) " + characterString + "  :)");
    } else {
      System.out.println(":) " + characterString + " :)");
    }
  }
}
