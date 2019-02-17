public class Main {
  public static void main(String[] args) {

  }

  public static int smallest(int[] array) {
    int smallest = array[0];

    for (int item : array) {
      if (item < smallest) {
        smallest = item;
      }
    }

    return smallest;
  }

  public static int indexOfTheSmallest(int[] array) {
    int smallest = array[0];
    int smallestIndex = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] < smallest) {
        smallest = array[i];
        smallestIndex = i;
      }
    }
    return smallestIndex;
  }

  public static int indexOfTheSmallestStartingFrom(int[] array, int startingIndex) {
    int smallest = array[startingIndex];
    int smallestIndexStartingFrom = startingIndex;

    for (int i = startingIndex; i < array.length; i++) {
      if (array[i] < smallest) {
        smallest = array[i];
        smallestIndexStartingFrom = i;
      }
    }
    return smallestIndexStartingFrom;
  }

  public static void swap(int[] array, int index1, int index2) {
    int storeIndex1 = array[index1];
    int storeIndex2 = array[index2];

    array[index1] = storeIndex2;
    array[index2] = storeIndex1;
  }

  public static void sort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(array);

      swap(array, i, indexOfTheSmallestStartingFrom(array, i));
    }
  }
}
