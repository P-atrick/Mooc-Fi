public class HangmanLogic {

  private String word;
  private String guessedLetters;
  private int numberOfFaults;

  public HangmanLogic(String word) {
    this.word = word.toUpperCase();
    this.guessedLetters = "";
    this.numberOfFaults = 0;
  }

  public int numberOfFaults() {
    return this.numberOfFaults;
  }

  public String guessedLetters() {
    return this.guessedLetters;
  }

  public int losingFaultAmount() {
    return 12;
  }

  public void guessLetter(String letter) {
    if (guessedLetters.contains(letter)) {
      return;
    } else {
      guessedLetters += letter;
      if (!word.contains(letter)) {
        numberOfFaults++;
      }
    }
  }

  public String hiddenWord() {
    int i = 0;
    String hiddenWord = "";

    while (i < word.length()) {
      char currentLetter = word.charAt(i);
      String currentLetterString = "" + currentLetter;

      if (guessedLetters.contains(currentLetterString)) {
        hiddenWord += currentLetterString;
      } else {
        hiddenWord += "_";
      }
      i++;
    }
    return hiddenWord;
  }
}
