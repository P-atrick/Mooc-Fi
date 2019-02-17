public class LyyraCard {
  private double balance;

  public LyyraCard(double balance) {
    this.balance = balance;
  }

  public void loadMoney(double amount) {
    if ((this.balance + amount) >= 150 && amount >=0) {
      this.balance = 150.00;
    } else if (amount >= 0) {
      this.balance = this.balance + amount;
    }
  }

  public void payEconomical() {
    if (this.balance >= 2.5) {
      this.balance = this.balance - 2.50;

    }
  }

  public void payGourmet() {
    if(this.balance >= 4) {
      this.balance = this.balance - 4.00;
    }
  }

  public String toString() {
    return "The card has " + this.balance + " euros";
  }
}
