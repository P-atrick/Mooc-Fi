import java.util.Calendar;

public class Person {
  private String name;
  private MyDate birthday;

  public Person(String name, int pp, int kk, int vv) {
    this.name = name;
    this.birthday = new MyDate(pp, kk, vv);
  }

  public Person(String name, MyDate birthday) {
    this.name = name;
    this.birthday = birthday;
  }

  public Person(String name) {
    this.name = name;
    this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
  }

  public int age() {
    int currentDay = Calendar.getInstance().get(Calendar.DATE);
    int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    MyDate today = new MyDate(currentDay, currentMonth, currentYear);

    return today.differenceInYears(birthday);
  }

  public boolean olderThan(Person compared) {
    // compare the ages based on birthdays
    if(birthday.earlier(compared.birthday)) {
      return true;
    }
    return false;
  }

  public String getName() {
    return this.name;
  }

  public String toString() {
    return this.name + ", born " + this.birthday;
  }
}
