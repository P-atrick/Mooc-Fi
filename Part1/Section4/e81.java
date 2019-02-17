import java.util.Random;

public class PasswordRandomizer {
  private String password;
  private int length;
  private Random random = new Random();

  public PasswordRandomizer(int length) {
    this.length = length;
  }

  public String createPassword() {
    this.password = "";
    int i = 0;

    while (i < this.length) {
      int selectedNumber = random.nextInt(26);
      char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(selectedNumber);
      this.password += symbol;
      i++;
    }
    return this.password;
  }
}
