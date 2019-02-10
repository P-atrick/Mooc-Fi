import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] original = {1, 2, 3, 4};
    int[] copied = copy(original);

    // change the copied
    copied[0] = 99;

    // print both
    System.out.println( "original: " + Arrays.toString(original));
    System.out.println( "copied: " + Arrays.toString(copied));
  }

  public static int[] copy(int[] array) {
    int[] copy = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      copy[i] = array[i];
    }

    return copy;
  }

  public static int[] reverseCopy(int[] array) {
    int[] reverseCopy = new int[array.length];
    int j = array.length - 1;

    for (int i = 0; i < array.length; i++) {
      reverseCopy[i] = array[j];
      j--;
    }

    return reverseCopy;
  }

}
