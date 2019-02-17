public class Money {

  private final int euros;
  private final int cents;

  public Money(int euros, int cents) {

    if (cents > 99) {
      euros += cents / 100;
      cents %= 100;
    }

    this.euros = euros;
    this.cents = cents;
  }

  public int euros() {
    return euros;
  }

  public int cents() {
    return cents;
  }

  @Override
  public String toString() {
    String zero = "";
    if (cents < 10) {
      zero = "0";
    }

    return euros + "." + zero + cents + "e";
  }

  public Money plus(Money added) {
    int resultEuros = this.euros() + added.euros();
    int resultCents = this.cents() + added.cents();

    return new Money(resultEuros, resultCents);
  }

  public boolean less(Money compared) {
    if (this.euros() < compared.euros()) {
      return true;
    } else if (this.euros() == compared.euros() && this.cents() < compared.cents()) {
      return true;
    }
    return false;
  }

  public Money minus(Money decreased) {
    int totalBegin = this.euros() * 100 + this.cents();
    int totalToMinus = decreased.euros() * 100 + decreased.cents();
    int totalResult = totalBegin - totalToMinus;

    int resultEuros = totalResult / 100;
    int resultCents = totalResult % 100;

    if (resultEuros < 0) {
      resultEuros = 0;
    }
    if (resultCents < 0) {
      resultCents = 0;
    }

    return new Money(resultEuros, resultCents);

  }
}
